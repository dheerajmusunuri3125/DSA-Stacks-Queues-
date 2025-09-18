package OopsPractise;
class A{
    public int count;
    A(int count ){
        this.count=count;
    }
    public  int method1(){

        return  count;
    }
}
public class hiiii {
    public static void main(String[] args) {
        A c=new A(1);
        System.out.println(c.method1());
    }
}
