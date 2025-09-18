package Practise;

public class Array {
    public static void main(String[] args) {
        int []array={3,4,6,1};
        int []array2={2,4,3,7};
        int target=7;
        for (int i=0;i<array.length;i++){
            if(array[i]==target){
                array[i]=array2[i];
            }
            System.out.println(array[i]);
        }
    }
}
