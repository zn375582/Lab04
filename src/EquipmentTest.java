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
        
        //test more Equipment objects
        Equipment eq = new Equipment("Bat Shark Repellent/3,3.0,3.0,Shark repelling bat spray");
        Assert.assertEquals("Bat Shark Repellent", eq.getName());
		Assert.assertEquals(3, eq.getCount());
        Assert.assertEquals(3.0, eq.getTotalWeight(), 0.1);
        Assert.assertEquals(3.02, eq.getTotalPrice(), 0.1);
        Assert.assertEquals("Shark repelling bat spray", eq.getDescription());
		
		
	}
	
	public void equalsTest() throws AssertException
	{
		Equipment eq = new Equipment("Bat Shark Repellent/3,3.0,3.0,Shark repelling bat spray");
		Equipment e = new Equipment("Bomb/1,50.6,70.6,Something you sometimes just can't get rid of");
		Equipment equip = new Equipment("Bomb/1,50.6,70.6,Something you sometimes just can't get rid of");
		
		//Check to see if each field are equal
		Assert.assertEquals(e.getName(), equip.getName());
		Assert.assertEquals(e.getCount(), equip.getCount());
		Assert.assertEquals(e.getTotalPrice(), equip.getTotalPrice());
		Assert.assertEquals(e.getTotalWeight(), equip.getTotalWeight());
		Assert.assertEquals(e.getDescription(), equip.getDescription());
			
		//test if Equipment objects are equal
		boolean expected = true;
		boolean actual = e.equals(equip);
		Assert.assertEquals(expected, actual);
			
			
		
		
		
	}
	
	
}