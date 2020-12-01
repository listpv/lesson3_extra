package ru.geekbrains;

public class ReversedString {

    private String inputString;

    public ReversedString(String inputString) {
        this.inputString = inputString;
    }

    public void reverse(){

        MyStack<Character> myStack = new MyStack<>(inputString.length());
        for (int i = 0; i < inputString.length(); i++) {
            myStack.push(inputString.charAt(i));
        }

        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(myStack.pop());
        }
    }
}
