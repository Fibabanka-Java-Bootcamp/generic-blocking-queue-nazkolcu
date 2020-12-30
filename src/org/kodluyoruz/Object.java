package org.kodluyoruz;

public class Object<T> {
    private T value;
    private Object<T> nextObj;

    public Object(T value) {
        this.value = value;

    }

    public Object(T value, Object nextObj) {
        this.value = value;
        this.nextObj = nextObj;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Object<T> getNextObj() {
        return nextObj;
    }

    public void setNextObj(Object<T> nextObj) {
        this.nextObj = nextObj;
    }
}
