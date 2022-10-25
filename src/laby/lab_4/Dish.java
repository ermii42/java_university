package laby.lab_4;

public class Dish implements Priceable{
    private int price;
    private int article;
    public Dish(int price, int article){
        this.price = price;
        this.article = article;
    }
    @Override
    public void getPrice() {
        System.out.printf("Посуда с артиклем %d имеет цену %d руб.\n", article, price);
    }
}
