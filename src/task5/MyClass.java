package task5;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tipe;
        System.out.println("Enter name of object which you want to create(string, int and boolean in program right now)" +
                "\n'End' will stop this program");
        do {
           try {
               tipe = in.nextLine();
               if (tipe.equalsIgnoreCase("end")) break;
               ObjectFactory objectFactory = CreateSpecialObject(tipe);
               CreateObject createObject = objectFactory.createObject();
               createObject.showTipeOfObject();
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
        }while (true);


    }

    public static ObjectFactory CreateSpecialObject(String tipe){
        if (tipe.equalsIgnoreCase("string")){
            return new StringObjectFactory();
        }else if (tipe.equalsIgnoreCase("int") || tipe.equalsIgnoreCase("integer") ){
            return new IntObjectFactory();
        }else if (tipe.equalsIgnoreCase("Boolean")){
            return new BooleanFactory();
        }
        else throw new  RuntimeException(tipe + " unknown tipe");
    }
}


