package by.itacademy.artsiommitskevich;

public class Account {
    String name;
    String address;
    double balance;

    public void display(){
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") имеет на счету $");
        System.out.print(balance);
    }
    public double getInterest(double parcentageRate){
        return balance * parcentageRate / 100.00;
    }
}
