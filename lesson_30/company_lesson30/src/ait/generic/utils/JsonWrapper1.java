package ait.generic.utils;

public class JsonWrapper1 {
    private Object value; // поле, которое содержит ссылку на любой объект

    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value=" + value + "}";
    }
}
/*
byte -> Byte
short -> Short
char -> Character
int -> Integer
long -> Long
float -> Float

 */