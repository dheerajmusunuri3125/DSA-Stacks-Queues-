package Practise;

public class Q8 {
    public static void main(String[] args) {
        String s ="Hello";
        int[]indeces={1,3};
        String res="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j=0;j<indeces.length;j++){
                if(i==indeces[j]){
                    ch='*';
                }
            }
            res+=ch;
        }
        System.out.println(res);
    }
}
