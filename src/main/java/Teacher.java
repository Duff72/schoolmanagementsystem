package SchoolManagementSystem;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;



    /* creates new teacher object

     */
    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;


    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getSalary() {
        return this.salary;
    }

    //set salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        this.salaryEarned += salary;
        school.management.system.School.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Name of teacher: " + this.name + " Total salary earned so far $" + this.salaryEarned;}

}
