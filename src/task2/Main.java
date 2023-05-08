package task2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyClas<String> list = new MyClas<>();
        MyClas<Integer> intList = new MyClas<>();
        String st;
        Scanner in = new Scanner(System.in);
        System.out.println("Вводьте данні. Для закінчення напишіть 'end'");
        while (true){
            st = in.nextLine();
            list.add(st);
            intList.add(4);
            if (st.equals("end")) break;
        }

        System.out.println("Довжина списку - " + list.length());
        System.out.println("Елементи списку: ");

        for (int i = 0; i < list.length(); i++){
            st = list.indeksator(i);
            System.out.println(i + " " + st);

        }

        System.out.println("Класи різних списків створених через дженерик");
        System.out.println(list.indeksator(0).getClass());
        System.out.println(intList.indeksator(0).getClass());

    }
}
