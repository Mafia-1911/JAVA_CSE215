public class Polymorphism {
    String s1="abcd";
    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        
    }
}
class Child extends Polymorphism{
    
    public static void main(String[] args) {
        Child c1=new Child();
        void printer(){
            super.s1;
            super.sum(1,3);
        }
        System.out.println(c1.s1);
        Super.sum()
    }
}