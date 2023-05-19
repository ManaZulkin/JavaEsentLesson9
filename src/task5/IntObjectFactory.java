package task5;

public class IntObjectFactory implements ObjectFactory{

    @Override
    public CreateObject createObject() {
        return new IntObject();
    }
}
