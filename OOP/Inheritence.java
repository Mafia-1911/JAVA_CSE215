public class Inheritence{
    int dara =98;
    int remove(){
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
class Hello extends Inheritence{
    void newMethod(){
        System.out.println("2nd method");
    }
    public static void main(String[] args) {
        Hello h1=new Hello();
        System.out.println(h1.dara);
     
    }
}
class BabyHello extends Hello{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        BabyHello bh=new BabyHello();
        bh.newMethod();
        bh.remove();
        bh.sum(4, 5);

    }
}