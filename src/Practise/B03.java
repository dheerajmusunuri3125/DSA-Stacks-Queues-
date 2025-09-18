package Practise;

public class B03 {
    static  MyStringQueue rearrange(MyStringQueue q,MyStringQueue q1){
        MyStringQueue outq=new MyStringQueue(5);
        while (!q.isEmpty()){
            String res="";
            String data1=q.dequeue();
            String data2=q1.dequeue();
            String product1=data1.split(":")[0].trim();
            String product2=data2.split(":")[0].trim();
            if(product1.compareTo(product2)< 0){
                 res =product1+"-"+product2;
                 outq.enqueue(res);
            }else {
                 res=product2+"-"+product1;
                 outq.enqueue(res);
            }
        }
        return  outq;
    }
    public static void main(String[] args) {
        MyStringQueue q=new MyStringQueue(5);
        MyStringQueue q1=new MyStringQueue(5);
        q.enqueue("Laptop:Electronics");
        q.enqueue("Apple:Fruit");
        q.enqueue("Shampoo:Toilet");

        q1.enqueue("Tablet:Electronics");
        q1.enqueue("Banana:Fruit");
        q1.enqueue("Soap:Toiler");

        B03.rearrange(q,q1).display();

    }
}
