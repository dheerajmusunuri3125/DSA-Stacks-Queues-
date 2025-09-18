public class P01 {
    static  StackString Rearrange(StackString s,MyStringQueue q){
        StackString outstack =new StackString(5);
        StackString output =new StackString(5);

        while(!s.isEmpty()){
            String data=s.pop();
            String data2=q.dequeue();
            String res=data+data2;
            outstack.push(res);
        }
        while (!outstack.isEmpty()){
            output.push(outstack.pop());
        }

        return output;
    }
    public static void main(String[] args) {
        StackString s=new StackString(5);
        MyStringQueue q=new MyStringQueue(5);
        s.push("{");
        s.push("[");
        s.push("(");

        q.enqueue(")");
        q.enqueue("]");
        q.enqueue("}");

        P01.Rearrange(s,q).display();
    }
}
