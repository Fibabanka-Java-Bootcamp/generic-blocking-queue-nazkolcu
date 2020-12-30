package org.kodluyoruz;

public class Queue<T> implements Functions<T> {

    private Object<T> firstObj;
    private Object<T> lastObj;


    public void add(T a) {
        Object<T> obj = new Object<>(a);
        if (firstObj == null) {
            firstObj = obj;
            lastObj = obj;
        } else {
            lastObj.setNextObj(obj);
            lastObj = obj;
        }
    }

    @Override
    public T poll() {
        T x = null;

        if (firstObj != null) {
            Object<T> obj = firstObj;
            firstObj = firstObj.getNextObj();
            x = obj.getValue();
        }
        else
        { throw new NullPointerException("kuyyyruk boş");

            //x=null;
               // T) "Kuyruk boş!";
        }

        return x;
    }

    @Override
    public T peek() {
        if (firstObj == null) {
            throw new IllegalArgumentException("kuyyyruk boş");

           // return null;
                    //(T) "Kuyruk boş!";
        } else {
            return firstObj.getValue();
        }
    }
}
