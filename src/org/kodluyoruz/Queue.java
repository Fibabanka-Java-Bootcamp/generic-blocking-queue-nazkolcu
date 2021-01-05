package org.kodluyoruz;

public class Queue<T> implements Functions<T> {

    private Object<T> firstObj;
    private Object<T> lastObj;


    synchronized public void add(T a) {
        Object<T> obj = new Object<>(a);
        System.out.println("Eklenen değer: " + obj.getValue().toString());
        if (firstObj == null) {
            firstObj = obj;
            lastObj = obj;
        } else {
            lastObj.setNextObj(obj);
            lastObj = obj;
        }
    }

    @Override
    synchronized public T poll() {
        T x = null;

        if (firstObj != null) {
            Object<T> obj = firstObj;
            firstObj = firstObj.getNextObj();
            x = obj.getValue();
        } else {

            System.out.println("Kuyruk boş");
            return null;
        }
        System.out.println("Çekilen değer: " + x.toString());

        return x;
    }

    @Override
    synchronized public T peek() {
        if (firstObj == null) {

            System.out.println("Kuyruk boş");
            return null;

        } else {

            System.out.println("Okunan değer: " + firstObj.getValue().toString());

            return firstObj.getValue();
        }
    }
}
