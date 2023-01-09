package DataStructures.Examples.p03_Stacks;

import DataStructures.Definitions.Linear.p03_Stack.MinStack;

public class ExMinStack {
    public static void push(){
        System.out.println("Exercise for Push on Min Stacks");
        MinStack stack = new MinStack(5);
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        stack.push(7);
        System.out.println(stack);
        stack.push(8);
        System.out.println(stack);
        stack.push(6);
        System.out.println(stack);
    }

    public static void pop(){
        System.out.println("Exercise for Pop on 2 Stacks");
        MinStack stack = new MinStack(5);
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(8);
        stack.push(6);
        System.out.println(stack);
        System.out.println("Pop from stack = "+ stack.pop());
        System.out.println(stack);
        System.out.println("Pop from stack = "+ stack.pop());
        System.out.println(stack);
        System.out.println("Pop from stack = "+ stack.pop());
        System.out.println(stack);
        System.out.println("Pop from stack = "+ stack.pop());
        System.out.println(stack);
        stack.push(-2);
        System.out.println(stack);
        stack.push(-1);
        System.out.println(stack);
        stack.push(15);
        System.out.println(stack);
        stack.push(14);
        System.out.println(stack);
    }
    public static void min(){
        System.out.println("Exercise for Pop on 2 Stacks");
        MinStack stack = new MinStack(5);
        stack.push(5);
        stack.push(2);
        stack.push(10);
        stack.push(1);
        System.out.println(stack);
        System.out.println("Min from stack = "+ stack.min());
        System.out.println(stack);
        System.out.println("Pop from stack = "+ stack.pop());
        System.out.println(stack);
        System.out.println("Min from stack = "+ stack.min());
        System.out.println(stack);
    }
}
