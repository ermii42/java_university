package practiki.prac_5;
// сдано
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Введите число:");
        number = input.nextInt();
        System.out.println(is_prime_number(number, -1));
        System.out.println("Введите число:");
        number = input.nextInt();
        System.out.println("Раложение числа "+number+" на простые делители:");
        factorisation(number, 2);
        String s;
        System.out.println("Введите строку:");
        s = input.next();
        String answer = is_palindrom(s);
        if(answer=="YES") System.out.println("Введенная строка является палиндромом");
        else System.out.println("Введенная строка не является палиндромом");
    }

    // №6
    public static String is_prime_number(int n, int div) {
        if(div==-1) div = n-1;
        while(div>=2){
            if (n%div==0) return "Число не является простым";
            else return is_prime_number(n, div-1);
        }
        return "Число является простым";
    }
    // №7
    public static void factorisation(int n, int k) {
        if(k > n/2){
            System.out.println(n);
            return;
        }
        if(n%k==0){
            System.out.println(k);
            factorisation(n/k, k);
        }
        else factorisation(n, k+1);
    }
    // №8
    public static String is_palindrom(String line) {
        if(line.length()==1) return "YES";
        if(line.substring(0,1).equals(line.substring(line.length()-1))){
            if (line.length()==2) return "YES";
            return is_palindrom(line.substring(1, line.length()-1));
        }
        return "NO";
    }
}
