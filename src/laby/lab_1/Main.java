package laby.lab_1;

public class Main {
    public static void main(String[] args) {

        // вывод агрументов командной строки
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("Count of args is: "+ args.length);
    }
}

// java src/laby/lab_1/Main.java arg1 arg2 arg4