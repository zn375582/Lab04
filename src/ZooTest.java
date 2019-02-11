/**
 * Test the Zoo class
 * 
 * @author nicolezimmerer
 * @version 2018-02-11
 * 
 */
public class ZooTest 
{
		    
	public void getTotalHeightTest() throws AssertException
	{
		//create zoo object
				Zoo dallas = new Zoo(2);
				Animal a = new Animal("Brown", "Sam", 150.0, 40.0);
			    Animal b = new Animal("Pink", "Fluffy", 250.5, 20.5);
			    Animal c = new Animal("Black", "Leo", 300.0, 40.5);
			    dallas.addAnimal(a);
			    dallas.addAnimal(b);
			    dallas.addAnimal(c);
	    
	    double expectedHeight = 101.0;
	    double actualHeight = dallas.getTotalHeight();
	    Assert.assertEquals(expectedHeight, actualHeight, .1);
	    
	    //test after adding another animal
	    Animal d = new Animal("Purple", "Sassy", 220.0, 30.0);
	    dallas.addAnimal(d);
	    Assert.assertEquals(131.1, dallas.getTotalHeight(), .1);
	   
	   
	}
	
	public void getCapacityTest() throws AssertException
	{
		
		//create zoo object
		Zoo dallas = new Zoo(2);
		Animal a = new Animal("Brown", "Sam", 150.0, 40.0);
	    Animal b = new Animal("Pink", "Fluffy", 250.5, 20.5);
	    Animal c = new Animal("Black", "Leo", 300.0, 40.5);
	    dallas.addAnimal(a);
	    dallas.addAnimal(b);
	    
	    //test the initial capacity
		int expectedCapacity = 2;
		int actualCapacity = dallas.getCapacity();
		Assert.assertEquals(expectedCapacity, actualCapacity);
		
		//test another case if add another animal
		dallas.addAnimal(c);
		//capacity should be 4 because we had to expand the zoo
		Assert.assertEquals(4, dallas.getCapacity());
	
		
	}
	
	public void toStringTest3() throws AssertException
	{
		//create zoo object
		Zoo dallas = new Zoo(2);
		Animal a = new Animal("Brown", "Sam", 150.0, 40.0);
	    Animal b = new Animal("Pink", "Fluffy", 250.5, 20.5);
	    Animal c = new Animal("Black", "Leo", 300.0, 40.5);
	    dallas.addAnimal(a);
	    dallas.addAnimal(b);
	    dallas.addAnimal(c);
	    
	    //test toString method
	    String expectedOutput = "These animals live in the zoo: \n" + "Sam, a Brown-colored animal. 150.0 pounds, 40.0 inches\n" +
	            "Fluffy, a Pink-colored animal. 250.5 pounds, 20.5 inches\n" + 
	    		"Leo, a Black-colored animal. 300.0 pounds, 40.5 inches\n";
	    String actualOutput = dallas.toString();
	    Assert.assertEquals(expectedOutput, actualOutput);
		
	}
	
	
}