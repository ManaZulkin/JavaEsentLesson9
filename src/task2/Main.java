package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyClas<String> list = new MyClas<>();
        MyClas<Integer> intList = new MyClas<>();
        String st;
        Scanner in = new Scanner(System.in);
        do {
            st = in.nextLine();
            list.add(st);
            intList.add(4);

        } while (!st.equals("end"));
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
