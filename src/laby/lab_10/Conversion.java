package laby.lab_10;
import java.io.File;
import java.util.*;

/*Написать метод для конвертации массива строк/чисел в список.*/
public class Conversion<E> {
    private List<E> list = new ArrayList<E>();

    public Conversion(E[] array) {
        list.addAll(Arrays.asList(array));
    }

    public void showList() {
        for (Object ls : list) {
            System.out.print(ls + " ");
        }
        System.out.println();
    }

    public void add(E element) {
        list.add(element);
    }

    public List getList() {
        return list;
    }
}