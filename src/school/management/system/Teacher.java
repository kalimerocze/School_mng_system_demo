package school.management.system;

/**
 * this is responsible for keeping track of teachers name, id and salary
 */
public class Teacher {
    /**
     chci si chranit propertu---fields
     salary could be double but for simplicity it is int
     **/
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teaceh object
     * @param id id for the teacher
     * @param salary salary for the zteacher
     * @param name name of the teacher
     */
    public  Teacher(int id,int salary,String name){
        this.name=name;
        this.id=id;
        this.salary=salary;
        salaryEarned=0;
    }

    /**
     * Vratí jmnéo ucitele(can be without  word "  this)
     * @return
     */
    public String getName(){
        return this.name;

    }
    /**
     * return Id of the teacher
     * @return
     */
    public int getId(){
        return id;

    }
    /**
     * return salary of the teacher
     * @return
     */
    public int getSalary(){
        return salary;
    }

    /**
     * setter only if we wan to change something that is already set----
     */
    /**
     * Set salary
     * @param salary new salary of the teacher
     */
    public void setSalary(int salary){
        this.salary= salary;
    }

    /**
     * adds to salary earned
     * removes from the total money earned by school
     * @param salary
     */
    public void receiveSalary(int salary){
        this.salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

}
    @Override
    public String toString(){
        return "teacher name is " + name + "Total earned salary is:  "+ salaryEarned+ "\n" + "..";

    }
}
