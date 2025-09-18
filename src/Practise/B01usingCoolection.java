package Practise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class B01usingCoolection {
    static  MyStringQueue rearrange(MyStringQueue q){
        MyStringQueue outq=new MyStringQueue(5);
        List<String> l1=new ArrayList<>();
        List<String>l2=new ArrayList<>();
        List<String>l3=new ArrayList<>();
        while(!q.isEmpty()){
            String data=q.dequeue();
            char ch=data.charAt(data.length()-1);
            if (ch == '1') {

                l1.add(data);
            }else if(ch=='2'){
                l2.add(data);
            }else{
                l3.add(data);
            }

        }
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        for(String s : l1){
            outq.enqueue(s);
        }
        for (String s : l2){
            outq.enqueue(s);
        }
        for (String s: l3){
            outq.enqueue(s);
        }
        return outq ;
    }

    public static void main(String[] args) {
        MyStringQueue q=new MyStringQueue(5);
        q.enqueue("John:3");
        q.enqueue("Alice:2");
        q.enqueue("Bob:2");
        q.enqueue("Eve:1");
        B01usingCoolection.rearrange(q).display();
    }
}
