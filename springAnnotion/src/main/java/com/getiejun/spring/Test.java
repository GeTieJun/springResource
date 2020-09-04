package com.getiejun.spring;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        //arrayListTest();
        testIfElse();
    }

    public static void testIfElse() {
        int i = 5;
        if(i > 1) {
            System.out.println("1");
        } else if( i > 3) {
            System.out.println("3");
        } else {
            System.out.println("5");
        }
    }

    public static void hashTable() {
        Hashtable<String, String> table = new Hashtable<String, String>();
        table.put("1", "1");
    }

    public static void hashMapTest() {
        HashMap<String, String> map = new HashMap<String, String>();
        Collections.synchronizedMap(map);
        map.put("1", "1");
        map.remove("1");
    }

    public static void TreeSetTest() {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("xiaoming", 1);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
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
