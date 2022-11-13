package last.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// №5 (1 лаба). Алёна и mex
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        n = in.nextInt();
        for(int i=0; i<n;i++){
            lst.add(in.nextInt());
        }
        int mex=1;
        Collections.sort(lst);
        for(int number: lst){
            if(number>=mex) mex++;
        }
        System.out.println(mex);
    }
}
