public class P8 {
   static StackString  rearrange(MyStringQueue q){
       StackString outstack=new StackString(5);

       while(!q.isEmpty()){
           String res="";
           String data=q.dequeue();
           for(int i=0;i<data.length();i++){
              char ch=data.charAt(i);
              if(i%2!=0){
                  ch=Character.toLowerCase(ch);
                  res+=ch;
              }else{
                  ch=Character.toUpperCase(ch);
                  res+=ch;
              }

           }
           outstack.push(res);

       }

      return outstack;
    }
    public static void main(String[] args) {
        MyStringQueue q=new MyStringQueue(5);
        q.enqueue("hello");
        q.enqueue("world");
        q.enqueue("stack");
        q.enqueue("queue");
        q.enqueue("python");
        P8.rearrange(q).display();
    }
}
