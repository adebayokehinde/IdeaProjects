package assignment;

public class Stack {
   private int maxSize;
   private int top;
   private int[] stackArray;

   public Stack(int size) {
      this.maxSize = size;
      this.stackArray = new int[size];
      this.top = -1;


   }
   public void push(int value) {
      if (top < maxSize - 1) {
         stackArray[++top] = value;
      }else {
         System.out.println("Stack is full");
      }
   }
   public int pop() {
      if (top > 0) {
         return stackArray[top--];

      }else {
         System.out.println("Stack is underflow");
         return -1;
      }

   }
}



