package Practise;

import java.util.*;

public class SameRank {
    static  MyStringQueue rearrange(MyStringQueue q){
        MyStringQueue outstr=new MyStringQueue(4);
        List<String> l=new ArrayList<>();
        while (!q.isEmpty()){
            String data=q.dequeue();
            String []array1=data.split(":");


        }

        return  null;
    }
    public static void main(String[] args) {
        MyStringQueue q=new MyStringQueue(4);
        q.enqueue("John:3");
        q.enqueue("Alice:2");
        q.enqueue("Bob:2");
        q.enqueue("Eve:1");
        SameRank.rearrange(q).display();

    }
}
