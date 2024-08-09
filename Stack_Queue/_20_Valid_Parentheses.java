package Stack_Queue;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/
Tags: Stack
 */
public class _20_Valid_Parentheses {
    
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['  ){
                myStack.push(c);
            }else{
                if(myStack.isEmpty()){
                    return false;
                }
                char openPeek = myStack.peek();
                if( openPeek == '(' && c == ')' || openPeek == '{' && c == '}' || openPeek == '[' && c == ']'){
                    myStack.pop();
                }else{
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}