package laby.lab_1;
// сдано
public class Main {
    public static void main(String[] args) {

        // вывод агрументов командной строки
        int i=0;
        for( ;; ){
            System.out.println(args[i]);
            i++;
            if (i>=args.length) break;
        }
        System.out.println("Count of args is: "+ args.length);
    }
}

// java src/laby/lab_1/Main.java arg1 arg2 arg4