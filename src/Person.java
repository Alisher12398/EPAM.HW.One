
public class Person {
    private String name;
    private String surname;
    private int age;
    private int id;

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public void setAge(int age){
        this.age=age;
    }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return  "\nAlpha Bank information:\n" + "\nID: " + getId() + "\nName: " + getName() + "\nSurname: " + getSurname() + "\nAge: " + getAge();
    }

}
