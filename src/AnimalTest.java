/**
 * Testing class for Product object
 *
 * @author Nicole Zimmerer, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    public void fullConstructorTest(String color, String name, double weight, double height) throws AssertException
    {
    	Animal ani = new Animal("Purple", "Perry", 50.0, 4.0);
    	
    	Assert.assertEquals("Purple", ani.getColor());
    	Assert.assertEquals("Perry", ani.getName());
    	Assert.assertEquals(50.0, ani.getWeight(), 0.01);
    	Assert.assertEquals(4.0, ani.getHeight(), 0.01);
    	
    }
    
    public void gettersTest() throws AssertException
    {
    	Animal dolphin = new Animal("Blue", "Bobby", 100.0, 30.0);
    	String expectedColor = "Blue";
    	String actualColor = dolphin.getColor();
    	Assert.assertEquals(expectedColor, actualColor);
    	
    	//Assert.assertTrue(dolphin.getColor().equals(”Blue”));
    	
    	String expectedName = "Bobby";
    	String actualName = dolphin.getName();
    	Assert.assertEquals(expectedName, actualName);
    	
    	//Assert.assertTrue(dolphin.getName().equals(”Bobby”));
    	
    	double expectedWeight = 100.0;
    	double actualWeight = dolphin.getWeight();
    	Assert.assertEquals(expectedWeight, actualWeight, 0.01);
    	
    	double expectedHeight = 30.0;
    	double actualHeight = dolphin.getHeight();
    	Assert.assertEquals(expectedHeight, actualHeight, 0.01);
    	
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal cat = new Animal("Black", "Midnight", 25.0, 20.0);
    	String expected = "Midnight, a Black-colored animal. 25.0 pounds, 20.0 inches\n";
    	String actual = cat.toString();
    	Assert.assertEquals(expected, actual);
    }
    
}

