package design;

public abstract class AbstractEmployee implements Employee{

    public final String leaderName = "Sharif";
    static String address = "1920, Like Street,Minneapolis, MN";

    public void typeOfCompany(){
        System.out.println("Tech Company"+ leaderName + "TopLeader Company Located at" + address + ".");
    }
    public abstract void  typeOfCompany(String Mission);


    public abstract void calculateSalary(double salary);
}
