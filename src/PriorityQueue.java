public class PriorityQueue {
    static MyStringQueue rearrange(MyStringQueue q,MyStringQueue q1){
        MyStringQueue output=new MyStringQueue(3);
        MyStringQueue output2=new MyStringQueue(3);
        while (!q.isEmpty()){
            String data=q.dequeue();
            String data2=q1.dequeue();
            String product1=data.split(":")[0].trim();
            String product2=data2.split(":")[0].trim();
            String res="";
            if(product1.compareTo(product2)<0){
                res=product1+":"+product2;
                output.enqueue(res);
            }else{
                res=product2+":"+product1;
                output2.enqueue(res);
            }

        }
        return  output ;
    }
    public static void main(String[] args) {
        MyStringQueue q = new MyStringQueue(3);
        MyStringQueue q1 = new MyStringQueue(3);
        q.enqueue("Laptop:Electronics");
        q.enqueue("Apple:Fruit");
        q.enqueue("Shampoo:Toiletry");
        q1.enqueue("Tablet:Electronics");
        q1.enqueue("Banana:Fruit");
        q1.enqueue("Soap:Toiletry");
        PriorityQueue.rearrange(q,q1).display();

    }
}
