/**
 * Test the Equipment class and objects
 * 
 * @author nicolezimmerer
 * @version 2018-02-10
 */

public class EquipmentTest 
{

	
	public void toStringTest2() throws AssertException
	{
		Equipment eq = new Equipment("Bat Shark Repellent/3,3.0,3.0,Shark repelling bat spray");
		String expected = "Name: Bat Shark Repellent, Number: 3, Weight: 3.00 lbs, Price: $3.00 - Shark repelling bat spray";
		String actual = eq.toString();
		Assert.assertEquals(expected, actual);
	}
	
	public void gettersTest2() throws AssertException
	{
		Equipment e = new Equipment("Bomb/1,50.6,70.6,Something you sometimes just can't get rid of");
		
		Assert.assertEquals("Bomb", e.getName());
		Assert.assertEquals(1, e.getCount());
        Assert.assertEquals(50.6, e.getTotalWeight(), 0.1);
        Assert.assertEquals(70.6, e.getTotalPrice(), 0.1);
        Assert.assertEquals("Something you sometimes just can't get rid of", e.getDescription());
		
		
	}
	
	public void equalsTest() throws AssertException
	{
		
	}
	
	
}