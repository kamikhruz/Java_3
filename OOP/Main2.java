import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        
        // interface = a template that can ve applied to a class.
        // similar to inheritance, but specifies what a class has/must do.
        // classes can apply more than one interface, inheritance is limited to 1 super

        Rabbit2 rabbit = new Rabbit2();
        rabbit.flee();

        Fish2 fish = new Fish2();

        fish.hunt();
        fish.flee();

        System.out.println();





        // polymorphism = greek word for poly-"many", morph-"form"
        //                The ability of an object to
        //                identify as more than one type


        Car2 car = new Car2();
        Bicycle2 bicycle = new Bicycle2();
        Boat2 boat = new Boat2();

        Vehicle2[] racers =  {car, bicycle, boat};
        

        for(Vehicle2 x : racers){
            x.go();
        }








        //DYNAMIC POLYMORPHISM

        // polymorphism = many shapes and forms
        // dynamic = after compilation (during runtime)

        // ex. A corvette is a: corvette, and a car, and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);

        try  {
            Animal2 animal;

            System.out.println();
            System.out.println("What animal do you want");
            System.out.print("(1=dog) or (2=cat):");
            int choice = scanner.nextInt();

            if(choice == 1){
                animal = new Dog2();
                animal.speak();
            }
            else if (choice == 2){
                animal = new Cat2();
                animal.speak();
            }
            else {
                animal = new Animal2();
                System.out.println("That choice was invalid");
                animal.speak();

            }
        }
        
        finally{
           scanner.close();
        }

    }
}
