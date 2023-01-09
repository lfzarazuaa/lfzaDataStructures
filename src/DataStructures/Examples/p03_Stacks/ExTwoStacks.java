package DataStructures.Examples.p03_Stacks;

import DataStructures.Definitions.Linear.p03_Stack.IntStack;
import DataStructures.Definitions.Linear.p03_Stack.TwoStacks;

public class ExTwoStacks {
    public static void push(){
        System.out.println("Exercise for Push on 2 Stacks");
        TwoStacks stack = new TwoStacks(5);
        System.out.println(stack);
        stack.push1(1);
        System.out.println(stack);
        stack.push2(2);
        System.out.println(stack);
        stack.push1(3);
        System.out.println(stack);
        stack.push2(4);
        System.out.println(stack);
        stack.push1(5);
        System.out.println(stack);
        try {
            stack.push2(6);
        }
        catch (StackOverflowError e){
            System.out.println("An overflow on stack 2 has occurred.");
        }
        try {
            stack.push1(7);
        }
        catch (StackOverflowError e){
            System.out.println("An overflow on stack 1 has occurred.");
        }
    }

    public static void pop(){
        System.out.println("Exercise for Pop on 2 Stacks");
        TwoStacks stack = new TwoStacks(5);
        stack.push1(1);
        stack.push2(2);
        stack.push1(3);
        stack.push2(4);
        stack.push1(5);
        System.out.println(stack);
        System.out.println(stack.pop1());
        System.out.println(stack);
        System.out.println(stack.pop1());
        System.out.println(stack);
        System.out.println(stack.pop1());
        System.out.println(stack);
        System.out.println(stack.pop2());
        System.out.println(stack);
        System.out.println(stack.pop2());
        System.out.println(stack);
        TwoStacks stack2 = new TwoStacks(15);
        stack2.push1(1);
        stack2.push1(2);
        stack2.push1(3);
        stack2.push1(4);
        stack2.push1(5);
        stack2.push1(6);
        stack2.push1(7);
        stack2.push1(8);
        stack2.push1(9);
        stack2.push1(10);
        stack2.push1(11);
        stack2.push1(12);
        stack2.push1(13);
        stack2.push2(1);
        stack2.push2(2);
        System.out.println(stack2);
        for (int i = 0; i < 13; i++) {
            System.out.print(stack2.pop1() + " ");
        }
        System.out.println("\n" + stack2);
        for (int i = 0; i < 2; i++) {
            System.out.print(stack2.pop2() + " ");
        }
    }
    public static void isEmpty(){
        System.out.println("Exercise for IsEmpty on 2 Stacks");
        TwoStacks stack = new TwoStacks(3);
        System.out.println(stack);
        System.out.println("Is 1 Empty: "+ stack.isEmpty1());
        System.out.println("Is 2 Empty: "+ stack.isEmpty2());
        stack.push1(1);
        stack.push1(2);
        System.out.println(stack);
        System.out.println("Is 1 Empty: "+ stack.isEmpty1());
        System.out.println("Is 2 Empty: "+ stack.isEmpty2());
        stack.push2(3);
        System.out.println(stack);
        System.out.println("Is 1 Empty: "+ stack.isEmpty1());
        System.out.println("Is 2 Empty: "+ stack.isEmpty2());
    }

    public static void isFull(){
        System.out.println("Exercise for IsFull on 2 Stacks");
        TwoStacks stack = new TwoStacks(3);
        System.out.println(stack);
        System.out.println("Is 1 Full: "+ stack.isFull1());
        System.out.println("Is 2 Full: "+ stack.isFull2());
        stack.push1(1);
        stack.push1(2);
        System.out.println(stack);
        System.out.println("Is 1 Full: "+ stack.isFull1());
        System.out.println("Is 2 Full: "+ stack.isFull2());
        stack.push2(3);
        System.out.println(stack);
        System.out.println("Is 1 Full: "+ stack.isFull1());
        System.out.println("Is 2 Full: "+ stack.isFull2());
    }

}
