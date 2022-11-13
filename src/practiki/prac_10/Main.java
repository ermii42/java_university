package practiki.prac_10;
// 1) Реализовать класс Абстрактная фабрика для комплексных чисел

// 2) Реализовать класс Абстрактная фабрика для различных типов стульев: Викторианский стул,
//Многофункциональный стул, Магический стул, а также интерфейс Стул, от которого наследуются все
//классы стульев, и класс Клиент, который использует интерфейс стул в своем методе Sit (Chair chair).

/*
Исходные данные. Есть некий базовый интерфейс IDocument, представляющий документ
неопределённого рода. От него впоследствии будут унаследованы конкретные документы: TextDocument,
ImageDocument, MusicDocument и т.п. Интерфейс IDocument перечисляет общие свойства и операции для
всех документов.
• При нажатии пунктов меню File -> New и File -> Open требуется создать новый экземпляр
документа (конкретного подкласса). Однако каркас не должен быть привязан ни к какому
конкретному виду документов.
• Нужно создать фабричный интерфейс ICreateDocument. Этот интерфейс содержит два
абстрактных фабричных метода: CreateNew и CreateOpen, оба возвращают экземпляр
IDocument
• Каркас оперирует одним экземпляром IDocument и одним экземпляром ICreateDocument.
Какие конкретные классы будут подставлены сюда, определяется во время запуска
приложения.
Требуется:
1. создать перечисленные классы. Создать каркас приложения — окно редактора с меню File.
В меню File реализовать пункты New, Open, Save, Exit.
2. продемонстрировать работу каркаса на примере текстового редактора. Потребуется создать
конкретный унаследованный класс TextDocument и фабрику для него —
CreateTextDocument.
С
 */

import practiki.prac_10.task_3.TextDocument;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Main extends JFrame
{

    public static void main(String[] args)
    {
        TextDocument t = new TextDocument();
        t.run();
    }
}

