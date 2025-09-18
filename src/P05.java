public class P05 {
    static Stack rearrange(Stack s,MyintQueue q){
        Stack outstack=new Stack(8);
        Stack outstack2=new Stack(8);
        while(!q.isEmpty()){
            outstack.push(s.pop());
            outstack.push(q.dequeue());
        }while(!outstack.isEmpty()){
            outstack2.push(outstack.pop());
        }

        return outstack2;
    }
    public static void main(String[] args) {
        Stack s=new Stack(4);
        MyintQueue q=new MyintQueue(4);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);
        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);
        q.enqueue(35);
        P05.rearrange(s,q).display();

    }
}
