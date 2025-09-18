package Practise;

public class P07 {
    static  StackString rearrange(MyStringQueue q){
        StackString outstack=new StackString(5);
        while (!q.isEmpty()){
            String data=q.dequeue();
            String res="";
            for(int i=0;i<data.length();i++){
                char ch=data.charAt(i);
                if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('){
                    ch='-';
                }
                res+=ch;
            }
            outstack.push(res);
        }
        return  outstack;
    }
    public static void main(String[] args) {
        MyStringQueue q=new MyStringQueue(5);
        q.enqueue("He@llo");
        q.enqueue("Wor#ld");
        q.enqueue("Pyt%on");
        q.enqueue("Stac&k");
        q.enqueue("Que*ue");
        P07.rearrange(q).display();
    }
}
