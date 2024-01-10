package Controllers;

import Models.CharacterCount;
import java.util.Map;
import java.util.Scanner;

public class CharCountControll {

    private CharacterCount counter;

    public CharCountControll() {
    }
    

    public void Display() {
        Scanner sc = new Scanner(System.in);
        counter = new CharacterCount();
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
        sc.close();

        counter.countCh(input);
        System.out.println("Word Counts: ");
        for (Map.Entry<String, Integer> entry : counter.getWordCount().entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println("'" + word + "' : " + count);
        }
        System.out.println("Char Counts: ");
        for (Map.Entry<Character, Integer> entry : counter.getCharCount().entrySet()) {
            Character chr = entry.getKey();
            int count = entry.getValue();
            System.out.println("'" + chr + "' : " + count);
        }
    }

}
