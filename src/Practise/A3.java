package Practise;
public class A3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        String output = "";
        if (a >=b) {
            output = "Z";
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 3 != 0) {
                    output = output + "X";
                } else {
                    output = output + i;
                }

            }

        }
        System.out.println(output);
    }
}

