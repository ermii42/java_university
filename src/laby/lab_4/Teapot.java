package laby.lab_4;

public class Teapot implements Priceable{
    private int price;
    private String model;

    public Teapot(int price, String model){
        this.model = model;
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.printf("Чайник модели %s имеет цену %d руб.\n", model, price);
    }
}
