package Practise;

public class P03 {
static StackString rearrange (Stack s ,MyStringQueue q){
    StackString output=new StackString(5);
    StackString outstack=new StackString(5);
    StackString outstack2=new StackString(5 );
    while (!q.isEmpty()){
        String data=q.dequeue();
        int data2=s.pop();
        int count=0;
        for(int i=0;i<data.length();i++){
            char ch=data.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'){
                count ++;
            }

        }
        if(count==data2){
            String res=data+data2;
            output.push(res);
        }else{
            outstack.push(data);
        }

    }while(!outstack.isEmpty()){
        outstack2.push(outstack.pop());
    }while (!output.isEmpty()){
        outstack2.push(output.pop());
    }

    return  outstack2;
}

    public static void main(String[] args) {
        Stack s = new Stack(5);
        MyStringQueue q = new MyStringQueue(5);
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
        P03.rearrange(s,q).display();

    }
}
