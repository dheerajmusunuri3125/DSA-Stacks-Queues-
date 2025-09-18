package OopsPractise;
class Demo {
    private static int var1 = 40; // static variable
    final int var3 = 40;          // constant for each object
    private int var2 = 40;        // instance variable

    public Demo(int var2) {
        this.var2 = var2;                         // assign argument
        this.var2 = ++this.var2 - var3;
        // update instance var2
        Demo.var1=Demo.var1--;
        Demo.var1--; // now it REALLY decrements var1
    }
    public int method1() {
        return Demo.var1 + this.var2;
    }
    public static void main(String args[]) {
        Demo.var1--; // var1 = 39 (first decrement in main)
        Demo obj1 = new Demo(40); // var2 becomes 40, var1 decrements
        Demo obj2 = new Demo(30); // var2 becomes 20, var1 decrements
        // Print the results
        System.out.println(obj1.method1() + obj2.method1());
    }
}

