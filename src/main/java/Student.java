// This class is for keeping track of students' fees, name, id, grade

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid=0;
    private int feesTotal=30000;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(this.feesPaid)
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }

    public int getRemainingFrees() {
        return feesPaid - feesTotal;
    }

    public String toString() {
        return "Student's name:" + this.name + " Total feels paid so far : $ " + this.feesPaid;
    }

}
