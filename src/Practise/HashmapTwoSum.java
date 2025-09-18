package Practise;
import java.util.HashMap;
import java.util.Map;
public class HashmapTwoSum {
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        int []array={10,30,40,50};
        int target=40;
        for(int i=0;i<array.length;i++){
            int compliment=target-array[i];
            if(m.containsKey(compliment)){
                System.out.println("Indices : ["+m.get(compliment)+", "+i+"]");
                break;
            }
            m.put(array[i],i);
        }
    }
}
