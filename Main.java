 class Queue {
    int rear, front, capacity;
    int queue[];

    Queue(int capacity) {
        rear = front = 0;
        queue = new int[capacity];
        this.capacity = capacity;
    }

    public void enqueue(int data) {
        if (capacity == rear) {
            System.out.println("Array is full !! ");
            return;
        } else {

            queue[rear] = data;
            rear++;


        
        }
        
        for(int i=0;i<rear;i++){
            if(queue[front+i]<queue[rear-1]){
                int temp=queue[front+i];
                queue[front+i]=queue[rear-1];
                queue[rear-1]=temp;
            }
        }
        
      
        
                

        return;
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Array is empty !!! ");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
          
      if (rear < capacity) {
               queue[rear] = 0;
            }
            rear--;
        }
        return;
    }

    public void display() {
        if (front == rear) {
            System.out.println("Array is empty !!! ");
            return;
        } else {
            for (int i = 0; i < rear; i++) {
                System.out.println("The number at " + i + " index is " + queue[i]);
            }
        }
    }

    public void queueFornt() {
        if (front == rear) {
            System.out.println("Array is empty !!! ");
            return;
        } else {
            System.out.println("The front of the queue is " + queue[front]);
        }
        return;
    }

    
}
class Main{
  public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Display before insertion");
        queue.display();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("After insertion!");
        queue.display();
        queue.dequeue();
    queue.dequeue();
        System.out.println("After deletion!");
        queue.display();

  }
}