package laby.lab_2;
// сдано
/*
2. Создать класс, описывающий тело человека(Human). Для описания
каждой части тела создать отдельные классы(Head, Leg, Hand).
Описать необходимые свойства и методы для каждого класса.
Протестировать работу класса Human.
 */
public class Main {
    public static void main(String[] args) {
        Human katya = new Human("Katya Pavlova");
        katya.getInfo();
        System.out.println();
        katya.setGender("female");
        katya.setWeigth(54);
        katya.setHeight(167);
        katya.setLegsLength(56);
        katya.setHandsLength(25);
        katya.setHeadSize(35);
        katya.getInfo();
    }
}
