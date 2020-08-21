package com.getiejun.spring;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        //arrayListTest();
        Object key = "abcdef";
        int h;
        System.out.println (key.hashCode());
        System.out.println (key.hashCode() >>> 16);
        System.out.println ((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
    }

    public static void hashSetTest() {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
    }

    public static void linkedListTest() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
    }

    private static void vectorTest() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
    }

    private static void arrayListTest() throws InterruptedException {
        Collections.synchronizedList(new ArrayList<Integer>());
        final ArrayList<Integer> list = new ArrayList<Integer>();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 100000; i++) {
                    list.add(1);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 100000; i++) {
                    list.add(2);
                }
            }
        });
        thread1.start();
        thread2.start();

        Thread.sleep(5 * 1000);

        for( int i = 0; i < list.size(); i++) {
            if(list.get(i) == null) {
                System.out.println("改元素为null");
            }
        }
    }
    //LinkedList
    //PriorityQueue
    //Vector
}
