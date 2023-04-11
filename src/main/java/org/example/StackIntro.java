package org.example;

import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        /*
        Stack is LIFO data structures. Last In First Out
        stores objects into a sort of vertical tower.
        push() to add to the top
        pop() remove from the top
        If we want to access data in the stack, if it"s not the top we have to pop first in order to access it


        use of stack"
        1. undo and redo in text editor
        2. moving back/forward through browser
        3. backtracking algorithm (maze, file directories
        4. calling functions (call stack)
         */

        Stack<String> stack = new Stack<String>();
//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push(("SkyRim"));
        stack.push("FFVII");
        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
