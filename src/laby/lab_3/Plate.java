package laby.lab_3;

public class Plate extends Dish{

    public Plate(boolean transparency, String shape, int size) {
        super(transparency, shape, size);
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о тарелке");
        System.out.println("Форма -\t"+super.getShape());
        System.out.println("Размер - \t"+super.getSize());
        if(getTransparency()) System.out.println("Тарелка прозрачная");
        else System.out.println("Тарелка не прозрачная");
        System.out.println();
    }
}
