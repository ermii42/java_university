package last.task6;
// СДАНО
import java.util.ArrayList;
import java.util.Scanner;

// №6. Мишка и выборы
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int isRes=0;
        int candy=0;
        int mxN, mxKon;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i=0; i<n;i++){
            lst.add(in.nextInt());
        }
        while(isRes<n-1){
            isRes=n-1;
            mxN = 0;
            mxKon = lst.get(0);
            for(int i=1; i<n; i++){
                if(mxKon<=lst.get(i)){
                    mxN = i;
                    mxKon = lst.get(i);
                    isRes--;
                }
            }
            if(mxN!=0){
                lst.set(0, lst.get(0)+1);
                candy++;
                lst.set(mxN, lst.get(mxN)-1);
            }
        }
        System.out.println(candy);
    }
}
