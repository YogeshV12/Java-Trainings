
public class Stack {
    int size;
    int arr[];
    int top;
 
    Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
 
    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is full !");
        }
    }
 
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);
            return arr[returnedTop];
 
        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }
 
    public int peek() {
        if(!this.isEmpty())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }
 
    public boolean isFull() {
        return (size - 1 == top);
    }
 
    public static void main(String[] args) {
//        Stack Stack = new Stack(10);
//        Stack.pop();
//        System.out.println("=================");
//        Stack.push(10);
//        Stack.push(30);
//        Stack.push(50);
//        Stack.push(40);
//        System.out.println("=================");
//        Stack.pop();
//        Stack.pop();
//        Stack.pop();
//        System.out.println("=================");
        
        
        
        Queue que = new Queue(4);
		que.que_add(3);
		que.que_add(5);
		que.que_add(1);
		que.que_add(8);
		
		que.que_top();
    }
	    
}
