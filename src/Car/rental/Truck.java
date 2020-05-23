package Car.rental;

public class Truck extends Car {
    private String name;
    private int rent;
    private double volume;
    //定义一个载货车的基本信息
    public Truck(String name,int rent,double volume)
    {
        this.name=name;
        this.rent=rent;
        this.volume=volume;
    }

    //依次对车的名字、租车费用、容量进行操作
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
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

}
