package Practise;
public class TwoIndexSum {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 70;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Indices: [" + i + ", " + j + "] → Values: (" + array[i] + ", " + array[j] + ")");
                }
                break;
            }
        }
    }
}
