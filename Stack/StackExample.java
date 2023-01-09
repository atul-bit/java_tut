import java.util.*;

class StackExample{
  //push at bottom
  public static void pushAtBottom(int data, Stack<Integer> s){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(data, s);
    s.push(top);
  }
 public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(4, stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
  }
}