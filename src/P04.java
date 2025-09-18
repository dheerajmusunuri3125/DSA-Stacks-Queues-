

public class P04 {

    static StackString rearrange(Stack s,  MyintQueue q){
        StackString output=new StackString(5);
        StackString tempstack=new StackString(5);
        while(!q.isEmpty()){
            int data=q.dequeue();
            int data2=s.pop();
            String res="";
            res=data+":"+data2;
            tempstack.push(res);
        }
        while(!tempstack.isEmpty()){
            output.push(tempstack.pop());
        }
        return output;
    }
    public static void main(String[] args) {

        MyintQueue q=new MyintQueue(5);
        Stack s=new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        q.enqueue(12);
        q.enqueue(34);
        q.enqueue(56);
        q.enqueue(78);
        q.enqueue(90);
        P04.rearrange(s,q).display();
    }
}
