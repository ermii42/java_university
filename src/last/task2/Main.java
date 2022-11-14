package last.task2;
// СДАНО
import java.util.Scanner;

//№2. Nirvana
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        System.out.println(dfs(n));
    }
    public static long dfs(long number){
        if(number<10) return Math.max(number,1);
        return Math.max(number%10*dfs(number/10), dfs(number/10-1)*9);
    }
}
