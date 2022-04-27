import java.util.Scanner;

public class ItemType {
    private String name;
    private Double costPerDay;
    private Double deposit;
    ItemType(){
        this.deposit = 10000.50;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setCostPerDay(Double costPerDay){
        this.costPerDay = costPerDay;
    }
    public Double getcostPerDay(){
        return costPerDay;
    }
    public void setdeposit(Double deposit){
        this.deposit = deposit;
    }
    public Double getdeposit(){
        return deposit;
    }
    public void display(){
        ItemType a = new ItemType();
        System.out.println("Item Type Details");
        System.out.println("Name: "+ getname());
        System.out.println("cost Per day :"+ getcostPerDay());
        System.out.println("Deposit: "+ getdeposit());

    }
    public static void main(String[] args){
        ItemType i = new ItemType();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item type Name");
        String name = sc.nextLine();
        System.out.println("Enter Cost Per Day");
        Double costPerDay = sc.nextDouble();
        System.out.println("Enter the Deposit");
        Double deposit = sc.nextDouble();
        ItemType items = new ItemType();
        items.setname(name);
        items.setCostPerDay(costPerDay);
        items.setdeposit(deposit);
        items.display();


    }
}
