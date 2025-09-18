package Practise;
public class CountofChar {
    public static void main(String[] args) {
        String str="aabbccdd";
        String res="";
        int count=1;
        char []carray=new char[str.length()];
        carray=str.toCharArray();
        for(int i=0;i< carray.length-1;i++){
            if(carray[i]==carray[i+1]){
                count++;
            }else {
                System.out.print(""+res+carray[i]+count);
                count=1;
            }
        }
        System.out.println(res+carray[carray.length-1]+count);
    }
}
