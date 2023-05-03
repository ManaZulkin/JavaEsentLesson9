package task2;

public class MyClas<T> implements MyListInerface<T> {
    private static final int DEFULT_CUPUCITY = 3;
    private final Object[] EMPTY_ELEMENT_DATA = new Object[DEFULT_CUPUCITY];
    private final Object[] myClas;
    private T[] tArray;
    private double size;
    int curentPos = 0 ;

    public MyClas(int size) {
        this.size = size;
        if (size > 0)
            this.myClas = new Object[size];
        else if (size == 0) {
            this.myClas = EMPTY_ELEMENT_DATA;
            this.size = DEFULT_CUPUCITY;
        } else throw new IllegalArgumentException("Illegal element");
        this.tArray = (T[]) myClas;
    }

    private void reSize(T[] tArray) {
        int newN = (int) (this.size * 1.5);
        this.tArray = (T[]) (new Object[newN]);
        if (tArray.length + 1 >= 0) System.arraycopy(tArray, 0, this.tArray, 0, tArray.length + 1);
    }

    public MyClas() {
        this.myClas = EMPTY_ELEMENT_DATA;
        tArray = (T[]) myClas;
        this.size = DEFULT_CUPUCITY;
    }

    @Override
    public void add(T obj) {

        if (curentPos >= ((int) (size * 75 / 100))) {
            reSize(this.tArray);
        }

        this.tArray[curentPos] = obj;

        curentPos++;
    }

    @Override
    public final int length() {
        int length = 0;
        for (T obj : this.tArray) {
            if (obj != null) length += 1;
            else break;
        }
        return length;
    }

    @Override
    public T indeksator(int index) {
        return tArray[index];
    }
}