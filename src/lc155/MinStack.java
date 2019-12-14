package lc155;

import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack {
    PriorityQueue<Integer> queue;
    Stack<Integer> stack;
    public MinStack(){
        queue = new PriorityQueue<Integer>();
        stack = new Stack<Integer>();
    }
    public void push(int x){
        stack.push(x);
        queue.add(x);
    }
    public void pop(){
        int x = stack.pop();
        if(x==queue.peek()) queue.poll();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return queue.peek();
    }
}
