package Practise;
public class Q05 {
    public static void main(String[] args) {
        String []input = {"hello","world","code","java"};
        String []outarray =new String[input.length];
        outarray[0]=input[0];
        for(int i=1;i< input.length;i++){
            char last=outarray[i-1].charAt(outarray[i-1].length()-1);
            if(last=='a'||last=='e'||last=='i'||last=='o'||last=='u'){
                input[i]=input[i]+outarray[i-1].length();
            }
            else{
                if(Character.isDigit(last)){
                    StringBuilder sb=new StringBuilder(input[i]);
                    input[i]=sb.reverse().toString();

                }else{
                    input[i]=outarray[i-1].length()+input[i];
                }
            }
            outarray[i]=input[i];
        }
        for(String s:outarray){
            System.out.println(s);
        }
    }
}
