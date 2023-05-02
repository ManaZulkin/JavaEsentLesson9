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
        while (true){
            st = in.nextLine();
            list.add(st);
            intList.add(4);
            if (st.equals("end")) break;

        }
        System.out.println(list.length());
        System.out.println(list.indeksator(0));
        for (int i = 0; i < list.length(); i++){
            st = list.indeksator(i);
            System.out.println(i + " " + st);
            System.out.println(i + " " + list.indeksator(i).getClass());
            System.out.println(i + " " + intList.indeksator(i).getClass());
        }

    }
}
