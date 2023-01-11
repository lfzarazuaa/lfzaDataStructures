package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Linear.p03_Stack.IntTwoQueuesStack;

import java.util.EmptyStackException;

public class ExIntTwoQueuesStack {

    public static void push(){
        System.out.println("Exercise for Push on IntStackTwoQueues");
        IntTwoQueuesStack stack = new IntTwoQueuesStack();
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
    }

    public static void pop(){
        System.out.println("Exercise for Pop on IntStackTwoQueues");
        IntTwoQueuesStack stack = new IntTwoQueuesStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        System.out.println("Pop 1st element on Stack = " +  stack.pop());
        System.out.println(stack);
        System.out.println("Pop 2d element on Stack = " +  stack.pop());
        System.out.println(stack);
        System.out.println("Pop 3d element on Stack = " +  stack.pop());
        System.out.println(stack);

        try {
            System.out.println("Pop 3th element on Stack = ");
            stack.pop();
        }catch (EmptyStackException e){
            System.out.println("The stack is empty.");
        }
        System.out.println(stack);
    }

    public static void peek(){
        System.out.println("Exercise for Peek on IntStackTwoQueues");
        IntTwoQueuesStack stack = new IntTwoQueuesStack();
        stack.push(1);
        stack.push(2);

        System.out.println(stack);
        System.out.println("Peek 1st element on Stack = " +  stack.peek());
        System.out.println("Pop 1st element on Stack = " +  stack.pop());
        System.out.println(stack);
        System.out.println("Peek 1st element on Stack = " +  stack.peek());
        System.out.println("Pop 2d element on Stack = " +  stack.pop());
        System.out.println(stack);

        try {
            System.out.println("Peek 3th element on Stack = ");
            stack.peek();
        }catch (EmptyStackException e){
            System.out.println("The stack is empty.");
        }
        System.out.println(stack);
    }

    public static void isEmpty(){
        System.out.println("Exercise for IsEmpty on Stack");
        IntTwoQueuesStack stack = new IntTwoQueuesStack();
        System.out.println(stack);
        System.out.println("Is Empty = " +  stack.isEmpty());
        stack.push(1);
        System.out.println(stack);
        System.out.println("Is Empty = " +  stack.isEmpty());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);
        System.out.println("Is Empty = " +  stack.isEmpty());
    }
}
