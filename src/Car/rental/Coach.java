package Car.rental;

public class Coach extends Car {

    //定义一个大巴的基本信息
    private String name;
    private int rent;
    private int passenger;
    public Coach(String name,int rent,int passenger) {
        this.name=name;
        this.passenger=passenger;
        this.rent=rent;
    }
    //依次对乘客数、大巴名字、租车费用进行操作
    public int getPassenger() {
        return passenger;
    }
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
}