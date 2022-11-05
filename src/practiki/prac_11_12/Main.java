package practiki.prac_11_12;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом. В
методе getLine() используя StringBuilder расставьте все слова в таком порядке, чтобы последняя буква
данного слова совпадала с первой буквой следующего не учитывая регистр. Каждое слово должно
участвовать 1 раз.
 */

public class Main {
    public static void main(String[] args) {
        String line = "";
        try(FileReader reader = new FileReader("src/practiki/prac_11_12/sourse/inp.txt")){
            int c;
            while((c=reader.read())!=-1){
                line += (char)c;
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] words = line.split(" ");
        StringBuilder result = arrangement(words);
        System.out.println(result.toString());
    }

    public static StringBuilder arrangement(String[] words){
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length==1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.addAll(Arrays.asList(words));
        result.append(wordsList.get(0));
        wordsList.remove(0);
        System.out.println();
        while(!wordsList.isEmpty()){
            for(int i=0; i<result.length(); i++){
                if(result.charAt(result.length()-1)==wordsList.get(i).toUpperCase().charAt(0)){
                    result.append(" ");
                    result.append(wordsList.get(i));
                    wordsList.remove(i);
                    break;
                }
                else if(result.charAt(result.length()-1)==wordsList.get(i).toLowerCase().charAt(0)){
                    result.append(" ");
                    result.append(wordsList.get(i));
                    wordsList.remove(i);
                    break;
                }
            }
        }
        return result;
    }
}
