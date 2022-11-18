package school.management.system;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        Teacher Lizzy = new Teacher(1,500,"Lizzy");
        Teacher Melissa = new Teacher(2,700,"Melissa");
        Teacher Peter = new Teacher(3,400,"Peter");

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(Peter);

        Student Tamara= new Student(1,"Tamara",4);
        Student David= new Student(2,"David",12);
        Student Katerina= new Student(3,"Katerina",7);
        List<Student> studentList = new ArrayList<Student>();
studentList.add(Tamara);
studentList.add(David);
studentList.add(Katerina);

        School ghs = new School(teacherList,studentList);

        Tamara.payFees(5000);
        David.payFees(1000);
        System.out.println("School paid salary");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("School paid sspent for salary to " + Lizzy.getName());
        System.out.println("Now has" + ghs.getTotalMoneyEarned());
        System.out.println("Lizzy has salary" + Lizzy.getSalary());
    }
}
