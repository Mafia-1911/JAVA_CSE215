/**
 * ArrayOfObjects
 */
class ArrayOfObjects {

    
}
class Student {
    String name;
    int age;

    Student(){
        this.name="No name";
        this.age=-1;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void introduce(Student s1){
        System.out.println("Hello my name is: "+s1.name+"\nMy Age is: "+s1.age);
    }
    public static void main(String[] args) {
        
        mukta.introduce(mukta);
        anil.introduce(anil);

        // int[] arr2=new int[6];
        //String array = int[] str2=new String[56];
        Student[] students=new Student[10];
        students[0]=new Student(a,45);
        students[1]=mukta;
        

    }
}