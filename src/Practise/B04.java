package Practise;
public class B04 {
    public static void main(String[] args) {
        String []input={"123","456","789","321"};
        String []outarray=new String[input.length];
        int count=0;
        for(int i=0;i<input.length;i++){
            String s="";
            String name=input[i];
            if(i%2==0){
                int n=Integer.parseInt(input[i])*2;
                input[i]=String.valueOf(n);

            }else {
                StringBuilder sb=new StringBuilder(name);
                s=sb.reverse().toString();
                 input[i]=s;
            }
        }
        for(int i=0;i<input.length;i+=2){
            String name=input[i]+input[i+1];
            outarray[count]=name.substring(name.length()-6).trim();
            count++;
        }

        for(int i=0;i<count;i++){
            System.out.print(" "+outarray[i]);
        }

    }
}
