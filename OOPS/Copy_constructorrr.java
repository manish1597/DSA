package OOPS;

public class Copy_constructorrr {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Manish";
        s1.roll=15;
        s1.password="abcd";
        s1.marks[0]=99;
        s1.marks[1]=72;
        s1.marks[2]=87;
//        System.out.println(s1.name);
        Student s2 = new Student(s1);
        s2.password="xyz";
        s1.marks[2]=43;//IMP this happens because it is array here the reference is copy s2 array refernce variable point to array
//        System.out.println(s2.password);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }

}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Copy constructor
    //shallow copy constructor
    Student( Student s1){
        marks = new int[3];
        this.marks=s1.marks;
        this.name=s1.name;
        this.roll=s1.roll;
        this.password= s1.password;
    }

    //Deep copy by making new array for s2
//  Student( Student s1){
//      marks = new int[3];
////        this.marks=s1.marks;// IMP DONT WRITE OTHERWISE IT COPY
//        this.name=s1.name;
//        this.roll=s1.roll;
//        this.password= s1.password;
//        for(int i =0;i<marks.length;i++){
//            this.marks[i]=s1.marks[i];//here new array form for each value
//        }
//    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is being called..");
    }
    Student(String name){
        marks = new int[3];
        this.name =name;

    }
    Student(int roll){
        marks = new int[3];
        this.roll= roll;
    }

}