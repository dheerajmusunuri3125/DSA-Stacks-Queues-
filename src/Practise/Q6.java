package Practise;

public class Q6 {
    public static void main(String[] args) {
        String []input ={"123","4567","890","12345"};
        for(int i=0;i<input.length;i++){
            if(i%2==0){
                String name =input[i]+input[i].length();
                input[i]=name.substring(0,4);
            }else{
                input[i]=input[i].length()+input[i].substring(0,4);
            }
        }
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }

    }
}
