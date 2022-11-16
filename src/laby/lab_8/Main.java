package laby.lab_8;
// СДАНО
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//  Реализовать вывод информации из файла на экран
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileReader reader = new FileReader("src/laby/lab_8/sourse/input.txt")){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
