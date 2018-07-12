public class Manager extends Employee{
    private int tableNumber;

    public void setTableNumber(int tableNumber){
        this.tableNumber=tableNumber;
    }

    public int getTableNumber(){
        return tableNumber;
    }

    @Override
    public String toString(){
        return  super.toString() + "\nPosition: " + getClass().getName() + "\nTable number: " + getTableNumber();
    }
}
