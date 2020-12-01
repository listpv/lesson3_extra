package ru.geekbrains;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyAnotherQueue<T> {

    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;
    private boolean direction;    //  переменная для направления движения


    public MyAnotherQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyAnotherQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        return temp;
    }


    //   вставка элемента справа налево   <<---
    public void insertToEnd(T item){
        if(begin == 0 && end == 0){
            direction = true;
        }
        else if(!direction){
            int temp = nextIndexToRight(begin);
            begin = nextIndexToRight(end);
            end = temp;
            direction = true;
        }
        insert(item);
        end = nextIndexToRight(end);
    }

    //  удаление элемента справа налево   <<---
    public T removeFromBegin(){
        if(begin == 0 && end == 0) {
            direction = true;
        }
        else if(!direction){
            int temp = nextIndexToRight(begin);
            begin = nextIndexToRight(end);
            end = temp;
            direction = true;
        }
        T element = remove();
        begin = nextIndexToRight(begin);
        return element;
    }


    //  вставка элемента слева направо   --->>
    public void insertToBegin(T item){
        if(begin == 0 && end == 0){
            direction = false;
        }
        else if(direction){
            int temp = nextIndexToLeft(begin);
            begin = nextIndexToLeft(end);
            end = temp;
            direction = false;
        }
        insert(item);
        end = nextIndexToLeft(end);
    }


    //  удаление элемента слева направо   --->>
    public T removeFromEnd(){
        if(begin == 0 && end == 0){
            direction = false;
        }
        else if(direction){
            int temp = nextIndexToLeft(begin);
            begin = nextIndexToLeft(end);
            end = temp;
            direction = false;
        }
        T element = remove();
        begin = nextIndexToLeft(begin);
        return element;
    }

    public void insert(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        size++;
        list[end] = item;
    }

    //  операция с индексом при действиях справа налево   <<---
    public int nextIndexToRight(int index) {
        if((index + 1) == list.length){
            changeCapacityToRight();
        }
        return (index + 1);
    }

    //  операция с индексом при действиях слева направо   --->>
    public int nextIndexToLeft(int index){
        int tempIndex = index;
        if (index == 0) {
            tempIndex = changeCapacityToLeft(index);
        }
        return (tempIndex - 1);
    }



    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " begin: " + begin + " end: " + end;
    }

//    public void reduceItem(int item){
//        if(item == 0){
//            item = nextIndexToLeft(item);
//        }else {
//            item = item - 1;
//        }
//    }


    //  проверка на окончание массива при действиях справа налево   <<---
    public void changeCapacityToRight(){

        T[] temp = (T[]) new Object[list.length * 2];
        System.arraycopy(list, 0, temp, 0, size);
        list = temp;

    }

    //  проверка на окончание массива при действиях слева направо   --->>
    public int changeCapacityToLeft(int index){
        T[] temp = (T[]) new Object[list.length * 2];
        System.arraycopy(list, 0, temp, list.length, size);
        begin += list.length;
        end += list.length;
        int tempIndex = index + list.length;
        list = temp;
        return tempIndex;
    }


}
