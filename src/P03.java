public class P03 {
    static  StackString rearrange(MyStringQueue q,Stack s){
        StackString outstatck=new StackString(5);
        StackString tempstack=new StackString(5);
        StackString output=new StackString(5);
        while(!q.isEmpty()){
            String data=q.dequeue();
            int data1=s.pop();
            int count=0;
            for(int i=0;i<data.length();i++){
                char ch=data.charAt(i);
                if(ch=='A'||ch=='a'||ch=='e'||ch=='E'||ch=='i'||ch=='o'||ch=='u'||ch=='I'||ch=='O'||ch=='U'){
                    count++;
                }
            }
            if(count == data1){
                outstatck.push(data+data1);
            }else {
                tempstack.push(data);
            }
        }
        while (!tempstack.isEmpty()){
            output.push(tempstack.pop());
        }
        while(!outstatck.isEmpty()){
            output.push(outstatck.pop());
        }
        return output;
    }
    public static void main(String[] args) {
        Stack s=new Stack(5);
        MyStringQueue q=new MyStringQueue(5);
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(3);
        s.push(3);
        q.enqueue("Orange");
        q.enqueue("Eagle");
        q.enqueue("Dog");
        q.enqueue("Banana");
        q.enqueue("Owl");
        P03.rearrange(q,s).display();




    }
}
