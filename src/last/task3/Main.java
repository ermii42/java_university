package last.task3;

import java.util.ArrayList;
import java.util.Scanner;

// 3 Дежурство по классу
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int k=0;
        int n=input.nextInt();

        for(int i=n-100>1 ? n-100:1; i<=n; i++){
            if(getSum(i)+i == n) {
                result.add(i);
                k++;
            }
        }
        System.out.println(k);
        for(int elem: result){
            System.out.println(elem);
        }
    }
    static int getSum(int num){
        if(num<10) return num;
        return num%10+getSum(num/10);
    }
}
