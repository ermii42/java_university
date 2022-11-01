package laby.lab_10;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.)
public class MyGenericArrayList<T> {
    private int size; // количество элементов- емкость списка
    private T[] elements;
    public MyGenericArrayList(T [] arr) { //конструктор
        elements = arr;
    }
    public void showArray() {
        for (T elem: elements) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    //Реализовать метод, который возвращает любой элемент массива по индексу
    public T getElem(int index){
        return elements[index];
    }
}