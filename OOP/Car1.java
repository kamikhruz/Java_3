public class Car1 {

    private String make;
    private String model;
    private int year;

    Car1(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // This is a copy constructor
    Car1(Car1 x){
        this.copy(x);
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car1 x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
    
}
