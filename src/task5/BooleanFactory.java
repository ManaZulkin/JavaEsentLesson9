package task5;

public class BooleanFactory implements ObjectFactory{
    @Override
    public CreateObject createObject() {
        return new BooleanObject();
    }
}
