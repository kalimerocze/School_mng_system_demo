package school.management.system;
import java.util.List;
/**
 this class is responsible for keeping the track of students , teachers---can have many teachers, students
 mohlo by byt pole.....ale nevim pocet studentu a ucitelu---pole musi mit definovanou velikost
 lepsi bude kolekce
 **/
public class School {
    /**
     *  Implements teachers and students using an arrayList
     */
    private List<Teacher> teacher;
    private List<Student> student;


    private static int totalMoneyEarned;
    private static int TotalMoneySpent;

    /**
     * a new school object is created
     * @param teacher list of teachers of school
     * @param student list of thestudents in the school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned=0;
        TotalMoneySpent=0;
    }

    /**
     * adds a teacher to the school
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    }
    /**
     * adds a student to the school
     * @param student sd
     */
    public void addStudent(Student student) {
        this.student.add( student);
    }

    /**
     *
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += totalMoneyEarned;
    }

    /**
     *Updates money spent by the school - will be tearcher's salary
     * @param MoneySpent money
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }

    /**
     * Returns list of teacher
     * @return
     */
    public List<Teacher> getTeacher() {
        return teacher;
    }
    /**
     * Returns list of students
     * @return
     */
    public List<Student> getStudent() {
        return student;
    }
    /**
     * Returns total money earned by school
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     * Returns total money spent by school
     * @return
     */
    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }
}
