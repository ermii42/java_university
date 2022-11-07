package laby.lab_11;
import java.util.*;
//СДАНО

/*Основываясь на предыдущей работе:
Реализуйте вспомогательные методы в классе Solution, которые должны
создавать соответствующую коллекцию и помещать туда переданные объекты.
Методы newArrayList, newHashSet параметризируйте общим типом T. Метод
newHashMap параметризируйте парой <K, V>, то есть типами К- ключ и Vзначение. Аргументы метода newHashMap должны принимать
 */
public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] lines = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};

        ArrayList list = test.newArrayList(numbers);
        System.out.println(list);
        HashSet set = test.newHashSet(numbers);
        System.out.println(set);
        HashMap map = test.newHashMap(numbers, lines);
        System.out.println(map);
    }
}
