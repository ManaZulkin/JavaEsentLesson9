package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        MyDictionary dictionary = new MyDictionary();
        input(dictionary);
        dictionary.showAll();
        System.out.println("Size of this dictionary is " + dictionary.dictionarySize());
        System.out.println();
        getByIndex(dictionary);
    }

    public static void input(MyDictionary dictionary){
        Scanner in = new Scanner(System.in);
        String s1, s2;
        for (int i = 0; i < 10; i++){
            System.out.println("Enter word");
            s1 = in.nextLine();
            System.out.println("Enter translate for this word");
            s2 = in.nextLine();
            dictionary.addWordPair(s1,s2);
        }
    }
    public static void getByIndex(MyDictionary dictionary){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter index for word");
        int index = in.nextInt();
        System.out.println(dictionary.returnByIndex(index));
    }
}
