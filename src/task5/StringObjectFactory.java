package task5;

public class StringObjectFactory implements ObjectFactory{
    @Override
    public CreateObject createObject() {
        return new StringObject();
    }
}
