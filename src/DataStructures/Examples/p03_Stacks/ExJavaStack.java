package DataStructures.Examples.p03_Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExJavaStack {
    public static void reverseStringTest(){
        System.out.println("Exercise for  Reverse String Stack");
        System.out.println("Reverse string for (AnitaLavaLaTina) "+ ExJavaStack.reverseString("AnitaLavaLaTina"));
        System.out.println("Reverse string for (The man who sold the World) "+ ExJavaStack.reverseString("The man who sold the World"));

    }
    public static String reverseString(String input){
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char character: input.toCharArray())
            stack.push(character);

        StringBuilder reversed = new StringBuilder();

        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
    public static void isBalancedStringTest(){
        System.out.println("Exercises for Balanced String Stack");
        System.out.println("Reverse string for (25+[37*2.7]/(1+(0.5)^7)) "+ ExJavaStack.isBalanced("(25+(37*2.7)/(1+(0.5)^7))"));
        System.out.println("Reverse string for () " + ExJavaStack.isBalanced("()"));
        System.out.println("Reverse string for [) " + ExJavaStack.isBalanced("(]"));
        System.out.println("Reverse string for (() " + ExJavaStack.isBalanced("(()"));
        System.out.println("Reverse string for )( " + ExJavaStack.isBalanced(")("));
        System.out.println("Reverse string for <25+[37*2.7]/¿1+(0.5)^7?> "+ ExJavaStack.isBalanced("<25+[37*2.7]/¿1+(0.5)^7?>"));

    }
    public static List<Character> leftChars = Arrays.asList('(','[','<','{','¿');
    public static List<Character> rightChars = Arrays.asList(')',']','>','}','?');
    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()){
            if (isLeftChar(ch))
                stack.push(ch);

            if (isRightChar(ch)) {
                if (stack.isEmpty()) return false;
                char left=stack.pop();
                if(!arePairs(left,ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isLeftChar(char ch){
        return leftChars.contains(ch);
    }

    private static boolean isRightChar(char ch){
        return rightChars.contains(ch);
    }

    private static boolean arePairs(char left, char right){
        int leftIndex = leftChars.indexOf(left);
        int rightIndex = rightChars.indexOf(right);
        return rightIndex == leftIndex && leftIndex != -1;
    }


}
