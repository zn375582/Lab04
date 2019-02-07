import java.io.IOException;

/**
 * Driver class that tests provided code. Unittests should provide full code coverage, but you may edit the driver
 * to better understand how the code works.
 * 
 * @author Stephen
 * @version 2018-09-10
 */
public class Driver
{
   public static void main(String[] args) throws IOException 
   {
       /*
        * You don't have to change any of this particular code however you may 
        * find it useful to play around with how the code works here.
        */
       Animal a = new Animal("Green", "Chester", 350.0, 40);
       Animal b = new Animal("Orange", "Tony", 200.5, 15);

       // Create a zoo and add animals to it:
       Zoo zoo = new Zoo(5);
       zoo.addAnimal(a); // Gorilla
       zoo.addAnimal(b); // Tiger

       // Print out info about the zoo:
       System.out.println(zoo);
       
       // Create a utility belt and print out its info:
	   UtilityBelt team = new UtilityBelt("InputOfficial.csv");
       
       team.writeEquipment("EquipmentInfo.txt");
       team.writeStatistics("EquipmentStats.txt");
       
       UtilityBelt team2 = new UtilityBelt("InputOfficial.csv");
       
       team2.writeEquipment("EquipmentInfo.txt");
       team2.writeStatistics("EquipmentStats.txt");
   }
}