package practiki.prac_7;

import java.util.ArrayDeque;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque player1 = new ArrayDeque();
        ArrayDeque player2 = new ArrayDeque();
        int count=0;
        for(int i=0; i<5; i++){
            player1.add(in.nextInt());
        }
        for(int i=0; i<5; i++){
            player2.add(in.nextInt());
        }
        int first, second;
        while(!player1.isEmpty()&&!player2.isEmpty()){
            if(count == 106) {
                System.out.println("botva");
                break;
            }
            first = (Integer) player1.pop();
            second = (Integer) player2.pop();
            if(first - second < 0){
                if(first == 0 && second == 9){
                    player1.add(first);
                    player1.add(second);
                }
                else{
                    player2.add(first);
                    player2.add(second);
                }
            }
            else{
                if(first == 9 && second == 0){
                    player2.add(first);
                    player2.add(second);
                }
                else{
                    player1.add(first);
                    player1.add(second);
                }
            }
            count++;
        }
        if(player1.isEmpty()) System.out.println("second");
        if(player2.isEmpty()) System.out.println("first");
        System.out.println(count);
    }
}
