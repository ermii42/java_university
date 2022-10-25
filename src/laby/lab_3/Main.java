package laby.lab_3;

/*
 Создать абстрактный класс, описывающий посуду(Dish). С
помощью наследования реализовать различные виды посуды,
имеющие свои свойства и методы. Протестировать работу классов
*/
public class Main {
    public static void main(String[] args) {
        Cup firstCup = new Cup(true, "контурная чашка", 10);
        Plate firstPlate = new Plate(false, "тарелка столовая", 40);
        firstCup.getInfo();
        firstPlate.getInfo();
    }
}
