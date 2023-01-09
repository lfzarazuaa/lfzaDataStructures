package DataStructures.Examples.p03_Stacks;

import DataStructures.Definitions.Linear.p03_Stack.IntStack;
import DataStructures.Definitions.Linear.p03_Stack.Stack;

import java.util.EmptyStackException;

public class ExGenericStack {
    public static void push(){
        System.out.println("Exercise for Push on Stack");
        Stack<Integer> stack = new Stack<>(5);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(2);
        stack.push(3);
        stack.print();
        stack.push(4);
        stack.push(5);
        stack.print();
        try {
            stack.push(6);
        }
        catch (StackOverflowError e){
            System.out.println("An overflow has occurred.");
        }
    }

    public static void pop(){
        System.out.println("Exercise for Pop on Stack");
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();

        System.out.println("Pop 1st element on Stack = " +  stack.pop());
        stack.print();
        System.out.println("Pop 2d element on Stack = " +  stack.pop());
        stack.print();
        System.out.println("Pop 3d element on Stack = " +  stack.pop());
        stack.print();

        try {
            System.out.println("Pop 3th element on Stack = ");
            stack.pop();
        }catch (EmptyStackException e){
            System.out.println("The stack is empty.");
        }
        stack.print();
    }

    public static void peek(){
        System.out.println("Exercise for Peek on Stack");
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);

        stack.print();
        System.out.println("Peek 1st element on Stack = " +  stack.peek());
        System.out.println("Pop 1st element on Stack = " +  stack.pop());
        stack.print();
        System.out.println("Peek 1st element on Stack = " +  stack.peek());
        System.out.println("Pop 2d element on Stack = " +  stack.pop());
        stack.print();

        try {
            System.out.println("Peek 3th element on Stack = ");
            stack.peek();
        }catch (EmptyStackException e){
            System.out.println("The stack is empty.");
        }
        stack.print();
    }

    public static void isEmpty(){
        System.out.println("Exercise for IsEmpty on Stack");
        Stack<Integer> stack = new Stack<>(10);
        stack.print();
        System.out.println("Is Empty = " +  stack.isEmpty());
        stack.push(1);
        stack.print();
        System.out.println("Is Empty = " +  stack.isEmpty());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.print();
        System.out.println("Is Empty = " +  stack.isEmpty());
    }

}
