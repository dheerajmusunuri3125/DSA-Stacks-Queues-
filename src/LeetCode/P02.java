package LeetCode;
public class P02 {
    public static void main(String[] args) {
        /*Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807. out put : 7,0,8*/
        int []array1={2,4,3};
        int []array2={5,6,4};
        String sum1="";
        String sum2="";
        for (int i = 0; i < array1.length; i++) {
            sum1+=String.valueOf(array1[i]);
        }
        for (int i=0;i<array2.length;i++){
            sum2+=String.valueOf(array2[i]);
        }
        int finalsum=Integer.parseInt(sum1)+Integer.parseInt(sum2);
        int[]outarray=new int[5];
        int count=0;
        while(finalsum >0){
            int a=finalsum%10;
            outarray[count++]=a;
            finalsum=finalsum/10;
        }
        for(int i=0;i<count;i++){
            System.out.print(outarray[i]+" ");
        }
    }
}
