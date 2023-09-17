public class Main1{

    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private,
        // Can be accessed only through methods (getters & setters)
        // You should make attributes private if you don't have a reason to make them public/protected

        Car1 car1 = new Car1("Chevrolet", "Camaro", 2021);
        Car1 car2 = new Car1("Ford", "Mustang", 2022);

        //System.out.println(car1.getMake());

        car1.setYear(2022);

        car1.copy(car2); // copies the contents of car2 into car1

        Car1 car3 = new Car1(car2);
        System.out.println(car3.getMake());
        
        



    }


}