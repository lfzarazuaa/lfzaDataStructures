package DataStructures.Examples.p03_Stacks;


public class ExStack {
    public static void main(String[] args) {
        System.out.println("Exercises for Stack");
        testJavaStack();
        testIntStack();
        testGenericStack();
        testTwoStacks();
        testMinStack();
    }

    private static void testGenericStack() {
        ExGenericStack.push();
        ExGenericStack.pop();
        ExGenericStack.peek();
        ExGenericStack.isEmpty();
    }

    private static void testMinStack() {
        ExMinStack.push();
        ExMinStack.pop();
        ExMinStack.min();
    }

    private static void testTwoStacks() {
        ExTwoStacks.push();
        ExTwoStacks.pop();
        ExTwoStacks.isEmpty();
        ExTwoStacks.isFull();
    }

    private static void testIntStack() {
        ExIntStack.push();
        ExIntStack.pop();
        ExIntStack.peek();
        ExIntStack.isEmpty();
    }

    private static void testJavaStack() {
        ExJavaStack.reverseStringTest();
        ExJavaStack.isBalancedStringTest();
    }
}
