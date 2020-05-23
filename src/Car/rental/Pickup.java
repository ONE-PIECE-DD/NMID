package Car.rental;

public class Pickup extends Car {
    //定义一个皮卡的基本信息
    private String name;
    private int rent;
    private int passenger;
    private double volume;
    public Pickup(String name,int rent,int passenger,double volume)
    {
        this.name=name;
        this.passenger=passenger;
        this.rent=rent;
        this.volume=volume;
    }
    //依次对皮卡的载客量、载货量、名字、租车费用进行操作
    public int getPassenger() {
        return passenger;
    }
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
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
