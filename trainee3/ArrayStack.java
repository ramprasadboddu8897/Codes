package com.phenom.trainee3;

public class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack overflow. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int popped = stackArray[top--];
            System.out.println("Popped: " + popped);
            return popped;
        } else {
            System.out.println("Stack underflow. Cannot pop from an empty stack.");
            return -1; // You can modify this return value based on your requirements
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.push(5);
        stack.push(6); // This will cause a stack overflow
//        stack.push(7);
    }
}

