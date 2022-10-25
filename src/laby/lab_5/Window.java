package laby.lab_5;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Window extends JFrame {

    private int width = 230;
    private int height = 313;

    private Image img;

    public Window() {
        setSize(width, height);
        setTitle("File Monitor:D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
        if(img==null) System.out.println("Нет картинки");
    }

    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(img, 0, 20, null);
    }
}