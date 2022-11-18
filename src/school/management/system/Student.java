package school.management.system;
/**
        this class is responsible for keeping the track of students fees, name, id grade & fees paid
**/
public class Student {
    /**
     chci si chranit propertu---fields
     **/
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /** kdyz das tohle a enter tak snippet se udela comment
     * to create a new object by initializing values
     * fees will be for every student: $30,000 per year
     * when student is created fees paid will be initially 0
     *
     * @param grade  name of the student
     * @param id  id for student:unique
     * @param name grade of the student
     **/
    public Student(int id, String name, int grade){
/**
 feespaid can be without this cause there is no parameter with same name---
 no possibility for conflict--but can be used even this.feesPaid
 **/

/**
 id modeli this...je rovno parametru id
 **/
this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }
/**
 not going to alter students' name,id
 i will be altering grade maybe
 metoda vezpod updatuje stupen studenta
 **/
    /**
     * Used to update student's grade
     * @param grade new grade of the certain student
     */
    public void setGrade(int grade){
    this.grade=grade;

}

    /**
     * 0,-->10,000->20,000
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * (keep adding fees to fees paid field¨)
     * @param fees fees which is paid by student
     */
    public void payFees(int fees){
        /**
         *or you can write feesPaid += fees;
         * same code just reduced
         */
        this.feesPaid=this.feesPaid + fees;
        /**
         * update school received school - total money
         */
        School.updateTotalMoneyEarned(fees);

    }


   /** alt a insert zkratka pro vytvoreni getteru!!!!**/

    /**
     * return Id
     * @return
     */
    public int getId(){
        return id;
    }   /**
     * return name of the student
     * @return
     */
    public String getName(){
        return name;
    }   /**
     * return grade of the student
     * @return
     */
    public int getGrade(){
        return grade;
    }   /**
     * return paid fees of the student
     * @return
     */
    public int getFeesPaid(){
        return feesPaid;
    }   /**
     * return totalfees paid of the student
     * @return
     */
    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     * return remaining fees
     * @return
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
}
@Override
    public String toString(){
        return "students name is " + name + "Total fwwa paid so far is:  "+ feesPaid+ "\n" + "aaa";

}
}
