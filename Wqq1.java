public class Wqq1 {
    public static void main(String[] args) {
        Wq1 c=new Wq1();
        System.out.println("the value of counter"+ c.getValue());
        c.click();
        c.click();
        c.click();
        System.out.println("the value after theer click"+c.getValue());
        c.reset();
        System.out.println("the value after reset"+c.getValue());
    }
}
