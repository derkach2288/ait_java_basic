package ait.generic.utils;
// дженерик - на чем специализируется
public class JsonWrapper2 <T>{ // в < > можно использовать любую букву или слово. Принято одна заглавная буква
    private T value;

    public JsonWrapper2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value=" + value + "}";
    }

}
