package task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyClas <T> implements MyListInerface {


    private static final int DEFULT_CUPUCITY = 3;
    private final Object[] EMPTY_ELEMENT_DATA = new Object[DEFULT_CUPUCITY];
    private Object[] myClas;
    private T[] tArray;
    private double size ;
    private int length = 0;

    public MyClas(int size){
        this.size = size;
        if (size > 0)
            this.myClas = new Object[size];
        else if (size == 0) {
            this.myClas = EMPTY_ELEMENT_DATA;
            this.size = DEFULT_CUPUCITY;
        }else throw new IllegalArgumentException("Illegal element");
        this.tArray = (T[]) myClas;
    }

    private void reSize(T[] tArray){
        Object[] transit = new Object[tArray.length];
        T[] tTransit = (T[]) transit;
        tTransit = tArray;
        this.tArray = (T[]) (new Object[(int) (this.size * 1.5)]);
        for (int i = 0; i <= tTransit.length; i++){
            this.tArray[i] = tTransit[i];
        }
    }
    public MyClas(){
        this.myClas = EMPTY_ELEMENT_DATA;
        tArray = (T[])myClas;
        this.size = DEFULT_CUPUCITY;
    }


        @Override
        public void add(Object obj) {
            int curentPos;
            curentPos = length();
            if (curentPos  >= ((int)size * 75 / 100)) {
                reSize(this.tArray);
                curentPos = length();
            }
            if (this.tArray[curentPos] == null)
                this.tArray[curentPos] = (T) obj;
            else {
                curentPos += 1;
                this.tArray[curentPos] = (T) obj;
                }
        }

        @Override
        public final int length () {
        length = 0;
            for (T obj: this.tArray )
            {
                if(obj != null) length += 1;
                else break;
            }
        return length;
    }

        @Override
        public T indeksator (int index) {
            T obj = tArray[index];
        return obj;
    }
}