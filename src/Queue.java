public class Queue {
    static class QueueA{
        int []arr;
        int size;
        int rear;
        QueueA(int n){
            arr=new int[n];
           size=n;
           rear=-1;
        }
        public boolean isempty(){
            return rear==-1;
        }
        public  void enqueue(int data){
            if (rear==size-1) {System.out.println("is full"); return;}
            rear=rear+1;
            arr[rear]=data;
        }
        public int dequee(){
            int front =arr[0];
            for (int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }

            rear--;
            return front;
        }

    }

    public static void main(String[] args) {
        QueueA q=new QueueA(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(0);
        q.enqueue(5);
        while (!q.isempty()){
            System.out.println(q.dequee());
        }

    }
}
