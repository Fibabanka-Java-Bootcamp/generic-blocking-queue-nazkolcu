package org.kodluyoruz;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {

        Queue<String> myQueue = new Queue<>();

        Runnable addThread1 = () -> myQueue.add("1");
        Runnable addThread2 = () -> myQueue.add("2");
        Runnable addThread3 = () -> myQueue.add("3");
        Runnable addThread4 = () -> myQueue.add("4");
        Runnable addThread5 = () -> myQueue.add("5");
        Runnable addThread6 = () -> myQueue.add("6");
        Runnable addThread7 = () -> myQueue.add("7");
        Runnable addThread8 = () -> myQueue.add("8");
        Runnable pollThread1 = () -> myQueue.poll();
        Runnable pollThread2 = () -> myQueue.poll();
        Runnable pollThread3 = () -> myQueue.poll();
        Runnable pollThread4 = () -> myQueue.poll();
        Runnable pollThread5 = () -> myQueue.poll();
        Runnable pollThread6 = () -> myQueue.poll();
        Runnable pollThread7 = () -> myQueue.poll();
        Runnable pollThread8 = () -> myQueue.poll();


        try {
            Thread add1 = new Thread(addThread1);
            add1.setPriority(Thread.MAX_PRIORITY);
            add1.start();
            Thread add2 = new Thread(addThread2);
            add2.setPriority(Thread.MAX_PRIORITY);
            add2.start();

            Thread add3 = new Thread(addThread3);
            add3.setPriority(Thread.MAX_PRIORITY);
            add3.start();
            Thread add4 = new Thread(addThread4);
            add4.setPriority(Thread.MAX_PRIORITY);
            add4.start();
            Thread add5 = new Thread(addThread5);
            add5.setPriority(Thread.MAX_PRIORITY);
            add5.start();
            Thread add6 = new Thread(addThread6);
            add6.setPriority(Thread.MAX_PRIORITY);
            add6.start();
            Thread add7 = new Thread(addThread7);
            add7.setPriority(Thread.MAX_PRIORITY);
            add7.start();
            Thread add8 = new Thread(addThread8);
            add8.setPriority(Thread.MAX_PRIORITY);
            add8.start();

            new Thread(pollThread1).start();
            new Thread(pollThread2).start();
            new Thread(pollThread3).start();
            new Thread(pollThread4).start();
            new Thread(pollThread5).start();
            new Thread(pollThread6).start();
            new Thread(pollThread7).start();
            new Thread(pollThread8).start();
        } catch (EmptyStackException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}







