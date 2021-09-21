
public class Queue {
	
	
		public static int front, rear, cap, que[];
		
		Queue(int n){
			front = rear =0;
			cap = n;
			que = new int[cap];
		}
		
		void que_add(int data)
	    {
	        if (cap == rear) {
	            System.out.printf("\nQueue is full\n");
	            return;
	        }
	        else {
	            que[rear] = data;
	            rear++;
	        }
	        return;
	    }
		
	    void que_rem()
	    {
	        if (front == rear) {
	            System.out.printf("\nQueue is empty\n");
	            return;
	        }
	        else {
	            for (int i = 0; i < rear - 1; i++) {
	                que[i] = que[i + 1];
	            }
	            if (rear < cap)
	                que[rear] = 0;
	            rear--;
	        }
	        return;
	    }
	    
	    void que_top()
	    {
	        int i;
	        if (front == rear) {
	            System.out.printf("\nQueue is Empty\n");
	            return;
	        }
	        for (i = front; i < rear; i++) {
	            System.out.printf(" %d <-- ", que[i]);
	        }
	        return;
	    }
	    void queueFront()
	    {
	        if (front == rear) {
	            System.out.printf("\nQueue is Empty\n");
	            return;
	        }
	        System.out.printf("\nFront Element is: %d", que[front]);
	        return;
	    }
		
	
//	    @Override
//	    public static void main(String[] args) {
//		Queue que = new Queue(4);
//		que.que_add(3);
//		que.que_add(5);
//		que.que_add(1);
//		que.que_add(8);
//		
//		que.que_top();
//		
//		
//
//	}

}

