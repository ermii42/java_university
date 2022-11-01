package laby.lab_10;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.)
public class MyGenericArrayList<E> {
    private int size; // количество элементов- емкость списка
    private E[] elements;
    public MyGenericArrayList(E [] arr) { //конструктор
        elements = arr;
    }
    public void showArray() {
        for (E elem: elements) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    //Реализовать метод, который возвращает любой элемент массива по индексу
    public E getElem(int index){
        return elements[index];
    }
}