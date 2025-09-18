package Practise;

public class Q7 {
    public static void main(String[] args) {
        String []input={"123","4567","890","12345"};
        for(int i=0;i<input.length;i++){
            if(i%2==0){
                input[i]=input[i]+input[i].length();
            }else{
                input[i]=input[i].length()+input[i];
            }
           if(input[i].length() > 5){
               System.out.println(input[i].substring(0,5));
           }else {
               System.out.println(input[i]);
           }
        }
    }
}
