package last.task2;

import java.util.Scanner;

//№2. Nirvana
public class Main {
    public static void main(String[] args) {
        String n;
        Scanner in = new Scanner(System.in);
        //System.out.println('9'-'0');
        n = in.next();
        System.out.println(getMxMulty(n));

    }

    static int getMxMulty(String n){
        int multy=1;
        String s ="";
        for(char s1: n.toCharArray()){
            for(char s2: "9876543210".toCharArray()){
                if(s1>=s2){
                    s += s2;
                    multy *= s2-'0';
                    break;
                }
            }
        }
        int multy2=1;
        String s_ ="";
        for(char s1: "9".repeat(n.length()-1).toCharArray()){
            for(char s2: "9876543210".toCharArray()){
                if(s1>=s2){
                    s += s2;
                    multy2 *= s2-'0';
                    break;
                }
            }
        }
        if(multy>multy2) return multy;
        return multy2;
    }
}
