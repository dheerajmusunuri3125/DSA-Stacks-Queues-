package LeetCode;
import java.util.Arrays;
public class MedianArray {
    public static void main(String[] args) {
        int []num1={1,3};
        int []num2={2,4};
        int []finalarray= Arrays.copyOf(num1,num1.length+num2.length);
        for(int i=0;i<num2.length;i++){
            finalarray[num1.length+i]=num2[i];
        }
        Arrays.sort(finalarray);
        for(int i=0;i<finalarray.length;i++){
            System.out.println(finalarray[i]);
        }
        double medain=0.0;
        if(finalarray.length%2!=0){
            medain=finalarray[finalarray.length/2];
        }
        else{
            medain=(finalarray[finalarray.length/2 - 1] + finalarray[finalarray.length/2])/2.0;
        }
        System.out.println(medain);

    }
}
