public class Employee extends Person{
    private int salary;
    private int experience;

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void setExperience(int experience){
        this.experience=experience;
    }

    public int getSalary(){
        return salary;
    }

    public int getExperience(){
        return experience;
    }

}
