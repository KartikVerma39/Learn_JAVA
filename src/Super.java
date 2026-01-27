package src;

public class Super {
    public static void main(String[] args){
//        Super = Refers to the parent class

        Person person = new Person("Tony" , "Stark");
        Student1 student = new Student1("Thor" , "Singh" , 9.5);
        Employee employee = new Employee("Loki" , "Verma"  , 50000);

        student.showName();
        person.showName();
        student.showGPA();
        employee.showSalary();

    }
}
