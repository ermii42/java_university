package laby.lab_4;
//СДАНО

/*
Реализовать интерфейс Priceable, имеющий метод getPrice(),29
возвращающий некоторую цену для объекта. Проверить работу для
различных классов, сущности которых могут иметь цену.
 */
public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish(1200, 123456);
        Teapot teapot = new Teapot(4300,"REDMOND SkyKettle G214S");
        dish.getPrice();
        teapot.getPrice();
    }
}
