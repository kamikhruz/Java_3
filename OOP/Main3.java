import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class Main3 {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // exception = an event that occurs during the execution of a program that, disrupts the normal flow of instructions.


        Scanner scanner = new Scanner(System.in);

        /* 
        try {
            

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: "+z);
        }
        catch(ArithmeticException e){
            System.out.println("You can divide by zero! IDIOT!");
        }
        catch(InputMismatchException e){
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("This will always print");
            scanner.close();
        }
        */



        









        // file = An abstract representation of file and directory pathnames 

        File file = new File("Secret_Document.txt");

        if (file.exists()){
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();

        }
        else {
            System.out.println("That file doesn't exist :(");
        }










       try{ FileWriter writer = new FileWriter("poem.txt");
       writer.write("Roses are red\n Booty Booty\n Rockin' everywhere");
       writer.append("\n A poem by bro");
       writer.close();

    }
    catch (IOException e){
        e.printStackTrace();
    }







    // FileReader = read the contents of a file as a stream of characters. One by one
    //              read() returns an int value which contains the byte value
    //              when read() returns -1, there is no more data to be read

    try {
        FileReader reader = new FileReader("poem.txt");
        int data = reader.read();
        while(data != -1) {
            System.out.print((char)data );
            data = reader.read();
        }
        reader.close(); 
    }
    catch(FileNotFoundException e) {
        e.printStackTrace();
    }
    catch(IOException e){

    }
    










    File files = new File("いのちの食べ方 - Eve MV.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(files);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    
    
    //clip.start();

    String response = "";

    

    while(!response.equals("Q")) {
        System.out.println("\nP = play, S = Stop, R = Reset, Q = Quit");
        System.out.print("Enter your choice: ");

        response = scanner.next();
        response = response.toUpperCase();

        switch(response) {
           case ("P"):{
            
            clip.start();
           }
           break;
           case ("S"):{            
            clip.stop();
            
           }
           break;
           case ("R"): clip.setMicrosecondPosition(0);
           break;
           case ("Q"): clip.close();
           break;
           default: System.out.println("Not a valid response");
        }
    }
    System.out.println("Byeeeee!");
    }
}
