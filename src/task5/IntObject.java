package task5;

public class IntObject implements CreateObject{

    @Override
    public void showTipeOfObject() {
        System.out.println(this.getClass());
    }
}
