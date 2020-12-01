package ru.geekbrains;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyReverseQueue<T> {

//    private T[] list;
//    private int size;
//    private final int DEFAULT_CAPACITY = 10;
//    private int begin;
//    private int end;
//    private boolean direction;
//
//    // 0 1 2 3 4
//    //   5 8
//    //   b
//    //       e
//
//    public MyReverseQueue(int capacity) {
//        if (capacity <= 0) {
//            throw new IllegalArgumentException("capacity: " + capacity);
//        }
//        list = (T[]) new Object[capacity];
//    }
//
//    public MyReverseQueue() {
//        list = (T[]) new Object[DEFAULT_CAPACITY];
//    }
//
//    public T peekFront() {
//        if (isEmpty()) {
//            throw new NoSuchElementException();
//        }
//        return list[begin];
//    }
//
//    public T remove() {
//        T temp = peekFront();
//        size--;
//        list[begin] = null;
////        begin = nextIndex(begin);
//        return temp;
//    }
//
//    public void insertToEnd(T item){
//        if(begin == 0 && end == 0){
//            direction = true;
//        }
//        else if(!direction){
//            int temp = nextIndex(begin);
//            begin = nextIndex(end);
//            end = temp;
//            direction = true;
//        }
//        insert(item);
//        end = nextIndex(end);
//    }
//
//    public T removeFromBegin(){
//        if(begin == 0 && end == 0) {
//            direction = true;
//        }
//        else if(!direction){
//            int temp = nextIndex(begin);
//            begin = nextIndex(end);
//            end = temp;
//            direction = true;
//        }
//        T element = remove();
//        begin = nextIndex(begin);
//        return element;
//    }
//
//    public void insertToBegin(T item){
//        if(begin == 0 && end == 0){
//            direction = false;
//        }
//        else if(direction){
//            int temp = begin - 1;
//            if(begin == 0){
//                temp = list.length - 1;
//            }
//            begin = end - 1;
//            if(end == 0){
//                begin = list.length - 1;
//            }
//            end = temp;
//            direction = false;
//        }
//        insert(item);
//        reduceItem(end);
//    }
//
//    // 0 1 2 3 4
//    //     5 8
//    //   e
//    //       b
//
//    public T removeFromEnd(){
//        if(begin == 0 && end == 0){
//            direction = false;
//        }
//        else if(direction){
//            int temp = begin - 1;
//            if(begin == 0){
//                temp = list.length - 1;
//            }
//            begin = end - 1;
//            if(end == 0){
//                begin = list.length - 1;
//            }
//            end = temp;
//            direction = false;
//        }
//        T element = remove();
//        reduceItem(begin);
//        return element;
//    }
//
//    public void insert(T item) {
//        if (isFull()) {
//            throw new IllegalStateException();
//        }
//        size++;
//        list[end] = item;
// //       end = nextIndex(end);
//    }
//
//    private int nextIndex(int index) {
//        return (index + 1) % list.length;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public boolean isFull() {
//        return size == list.length;
//    }
//
//    @Override
//    public String toString() {
//        return Arrays.toString(list) + " begin: " + begin + " end: " + end;
//    }
//
//    public void reduceItem(int item){
//        if(item == 0){
//            item = list.length - 1;
//        }else {
//            item = item - 1;
//        }
//    }
}
