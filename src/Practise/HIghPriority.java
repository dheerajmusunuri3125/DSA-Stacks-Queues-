package Practise;

public class HIghPriority {
    static MyStringQueue rearrange(StackString s){
        StackString High= new StackString(5);
        StackString medium=new StackString(5);
        StackString low= new StackString(5);
        MyStringQueue outq=new MyStringQueue(5);
        while (!s.isEmpty()){
            String data=s.pop();
            if(data.contains("A")){
                High.push(data);
            } else if (data.contains("B")) {
                medium.push(data);
            }else {
                low.push(data);
            }
        }while (!High.isEmpty()){
            outq.enqueue(High.pop());
        }
        while (!medium.isEmpty()){
            outq.enqueue(medium.pop());
        }



        return  outq;
    }
    public static void main(String[] args) {
        StackString s=new StackString(5);
        s.push("Laptop-A");
        s.push("Chair-B");
        s.push("Book-C");
        s.push("Phone=A");
        s.push("Table-B");
        HIghPriority.rearrange(s).display();

    }
}
