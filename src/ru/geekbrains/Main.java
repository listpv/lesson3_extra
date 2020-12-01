package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Задание №1");
        String exampleString = "ABCD1EFGHJ3{KLM=NO/P4QRSTU.VWXYZ";
        System.out.println(exampleString);
        ReversedString reversedString = new ReversedString(exampleString);
        reversedString.reverse();
        System.out.println("");


        System.out.println("Задание №2");
        MyAnotherQueue<Integer> queue = new MyAnotherQueue<>(5);
        System.out.println(queue);
        queue.insertToEnd(5);
        System.out.println(queue);
        queue.insertToBegin(3);
        System.out.println(queue);
        queue.insertToEnd(2);
        System.out.println(queue);
        queue.insertToBegin(7);
        System.out.println(queue);
        queue.insertToEnd(8);
        System.out.println(queue);
        System.out.println(queue.removeFromBegin());
        System.out.println(queue);
        System.out.println(queue.removeFromBegin());
        System.out.println(queue);
        System.out.println(queue.removeFromEnd());
        System.out.println(queue);

    }
}
