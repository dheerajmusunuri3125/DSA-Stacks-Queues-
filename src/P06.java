public class P06 {
    static StackString rearrrange(MyStringQueue q, Stack s){
        StackString TA=new StackString(1);
        StackString TB=new StackString(1);
        StackString TC=new StackString(1);
        StackString TD=new StackString(1);


        return null;
    }
    public static void main(String[] args) {
        MyStringQueue q=new MyStringQueue(4);
        Stack s=new Stack(4);
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(3);
        q.enqueue("TaskA");
        q.enqueue("TaskB");
        q.enqueue("TaskC");
        q.enqueue("TaskD");
        P06.rearrrange(q,s).display();
    }
}
