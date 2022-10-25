package laby.lab_3;

abstract class Dish {
    private boolean transparency;
    private String shape;
    private int size;

    public Dish(boolean transparency, String shape, int size){
        this.shape = shape;
        this.transparency=transparency;
        this.size=size;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTransparency(boolean transparency) {
        this.transparency = transparency;
    }

    public int getSize() {
        return size;
    }

    public String getShape() {
        return shape;
    }

    public boolean getTransparency(){
        return transparency;
    }
    public abstract void getInfo();
}
