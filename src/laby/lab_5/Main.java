package laby.lab_5;
// сдано
/*
Создать окно, реализовать анимацию, с помощью картинки,
состоящей из нескольких кадров.
 */

public class Main {

        public static void main(String[] args) {

            Window wind = new Window();

            while(true){
                for(int i=1; i<5; i++){
                    wind.loadImage("src/laby/lab_5/static/img"+Integer.toString(i)+".png");
                    wind.drawIcon();
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
}
