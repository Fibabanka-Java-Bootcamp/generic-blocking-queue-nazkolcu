package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {

        Queue<String> myQueue = new Queue<>();

        //System.out.println(myQueue.poll());
       // System.out.println(myQueue.peek());

        myQueue.add("1");
        myQueue.add("2");
        myQueue.add("3");
        myQueue.add("4");

        System.out.println(myQueue.peek());
String a="";
        for (int i = 0; i < 5; i++) {
            a = myQueue.poll();
            System.out.println(a);
           /* if (a == null) {
                throw new IllegalArgumentException("kuyyyruk boş");
                //System.out.println();}
            }*/
        }





    }
}
