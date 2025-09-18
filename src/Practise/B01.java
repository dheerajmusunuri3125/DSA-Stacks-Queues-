package Practise;

import java.util.Arrays;

public class B01 {
    static MyStringQueue rearrange (MyStringQueue q){
        MyStringQueue outq=new MyStringQueue(5);
        String []arr1=new String[q.getSize()];
        int c1=0;
        String []arr2=new String[q.getSize()];
        int c2=0;
        String []arr3=new String[q.getSize()];
        int c3=0;
        while(!q.isEmpty()){
            String data=q.dequeue();
            char ch=data.charAt(data.length()-1);
            if(ch=='1'){
                arr1[c1]=data;
                c1++;
            }else if(ch=='2'){
                arr2[c2]=data;
                c2++;
            }else{
                arr3[c3]=data;
                c3++;
            }

        }
        arr1=Arrays.copyOf(arr1,c1);
        arr2=Arrays.copyOf(arr2,c2);
        arr3=Arrays.copyOf(arr3,c3);


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        for(int i=0;i<arr1.length;i++){
            outq.enqueue(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            outq.enqueue(arr2[i]);
        }
        for(int i=0;i<arr3.length;i++){
            outq.enqueue(arr3[i]);
        }
        return outq;
    }
    public static void main(String[] args) {
        MyStringQueue q=new MyStringQueue(5);
        q.enqueue("John:3");
        q.enqueue("Alice:2");
        q.enqueue("Bob:2");
        q.enqueue("Eve:1");
        B01.rearrange(q).display();
    }
}
