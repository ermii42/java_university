package laby.lab_6;

/*
Реализация приложения Java, который имеет макет границы и
надписи для каждой области в макете. Теперь определим события
мыши, чтобы описать действия:
a. Когда мышь входит CENTER программа показывает
диалоговое окно
(Добро пожаловать в )
b. Когда мышь входит WEST программа показывает
диалоговое окно
(Добро пожаловать в Джидда)49
c. Когда мышь входит SOUTH программа показывает
диалоговое окно
(Добро пожаловать Абха)
d. Когда мышь входит в NORTH программа показывает
диалоговое окно (Добро пожаловать в)
e. Когда мышь входит EAST программа показывает диалоговое
окно
(Добро пожаловать в Дахране)
 */

import javax.swing.*;
import java.awt.*;

public class Main {

        public static void main(String[] args) {
            new BorderExample().setVisible(true);
        }
}
