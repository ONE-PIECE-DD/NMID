package Car.rental;
/**/
public class Car {
    private String name;
    private int rent;
    private int passenger;
    private double volume;
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

}