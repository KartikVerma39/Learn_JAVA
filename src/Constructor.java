package src;

public class Constructor {
    public static void main(String[] args){

//        constructor = A special method to intialize objects

        Student student1 = new Student("SpongeBob" , 30 , 3.2);
        Student student2 = new Student("Patrick" , 34 , 1.5);

//        System.out.println(student1.name);
//        System.out.println(student2.name);
//        System.out.println(student1.age);
//        System.out.println(student2.age);
//        System.out.println(student1.gpa);
//        System.out.println(student2.gpa);
//        System.out.println(student1.isEnrolled);
//        System.out.println(student2.isEnrolled);

        student1.study();
        student2.study();

    }
}
