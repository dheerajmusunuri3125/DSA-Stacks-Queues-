package Practise;
public class P02 {
     static  StackString rearrange(MyStringQueue q){
         StackString outstack=new StackString(5);
         StackString output=new StackString(5);
         while(!q.isEmpty()){
             String data= q.dequeue();
             String []temp=new String[2];
             temp=data.split(":");
             if(temp[0].length()==temp[1].length()){
                 outstack.push(data);
             }else {
                 String res = temp[0] + temp[1];
                 StringBuilder sb = new StringBuilder(res);
                 String res2 = sb.reverse().toString();
                 outstack.push(res2);

             }
         }
         while (!outstack.isEmpty()){
             output.push(outstack.pop());
         }
         return  output;

     }

    public static void main(String[] args) {
        MyStringQueue q = new MyStringQueue(5);
        q.enqueue("Ca:t");
        q.enqueue("Do:g");
        q.enqueue("Fi:sh");
        q.enqueue("Parr:ot");
        q.enqueue("Bi:rd");
        P02.rearrange(q).display();
    }
}
