package laby.lab_10;
import java.io.File;
import java.util.*;
//СДАНО

/*Написать метод для конвертации массива строк/чисел в список.*/
//Написать класс, который умеет хранить в себе массив любых типов данных (int,
//long etc.)
//Реализовать метод, который возвращает любой элемент массива по индексу
//Написать функцию, которая сохранит содержимое каталога в список и
//выведет первые 5 элементов на экран

public class Main {
    // Написать ф-ю, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
    public static void Filelist(String path){
        File f = new File(path);
        String[] fArray = null;
        if (f.exists()||f.isDirectory()) fArray = f.list(null);
        else System.out.print("Папка не найдена");
        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));

        for (int i =0; i<list.size();i++) {
            if(i<5) System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] lines = {"q", "w", "e", "r", "t", "y"};

        Conversion<Integer> listInt = new Conversion(numbers);
        listInt.showList();

        Conversion<String> listStr = new Conversion(lines);
        listStr.showList();

        MyGenericArrayList<Integer> arrayInt = new MyGenericArrayList(numbers);
        MyGenericArrayList<String> arrayStr = new MyGenericArrayList(lines);
        arrayInt.showArray();
        arrayStr.showArray();
        System.out.println(arrayStr.getElem(2));

        Filelist("C:\\Users\\user\\Documents\\university\\3 semak\\java");
    }
}
