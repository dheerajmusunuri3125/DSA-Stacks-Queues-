package Practise;

public class B02 {
    static Stack rearrange(Stack s){
        Stack outstack=new Stack(5);
        Stack outstack2=new Stack(5);
        Stack output=new Stack(5);
        while(!s.isEmpty()){
            int data=s.pop();
            if(data%2==0){
                outstack.push(data);
            }else{
                outstack2.push(data);
            }
        }
        while (!outstack2.isEmpty()){
            output.push(outstack2.pop());
        }
        while (!output.isEmpty()){
            outstack.push(output.pop());
        }
        return outstack ;
    }
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(81);
        s.push(29);
        s.push(12);
        s.push(56);
        s.push(34);
        B02.rearrange(s).display();

    }
}
