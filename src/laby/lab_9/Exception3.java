package laby.lab_9;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
