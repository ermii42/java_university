package last.task1;
// СДАНО, ПЕРЕДЕЛАЙ
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//1 Филя и задание
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int sm = 0;
        ArrayList<Integer> numbers= new ArrayList<>();
        for(int i=0; i<n;i++){
            numbers.add(in.nextInt());
            sm += numbers.get(i);
        }

        if(n==2){
            System.out.println("YES");
            return;
        }
        int middle = sm / n;
        if(sm % n != 0){
            middle+=1;
        }
        int current;
        int k = Math.abs(numbers.get(0)-middle);
        for (int i=1; i<n; i++){
            current = Math.abs(numbers.get(i)-middle);
            if(current !=0 && current !=k){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
