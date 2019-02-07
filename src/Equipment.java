/**
 * A class to represent items stored in Batman's utility belt. Several copies of an item may appear
 * in the Utility belt (e.g. 5 batarangs), so the Equipment class keeps a count variable tracking
 * the number of copies of the item. I.e. there would be one equipment object for "batarangs", for
 * which the count variable would be equal to 5.
 *
 * @author Stephen
 * @version 2019-01-27
 */
public class Equipment
{
    /**
     * The name of the items.
     */
    private String name;

    /**
     * The number of copies of the item stored in the belt.
     */
    private int count;

    /**
     * The total weight of the items.
     */
    private double totalWeight;

    /**
     * The total price of the items.
     */
    private double totalPrice;

    /**
     * The description of the items.
     */
    private String description;

    /**
     * Constructor for Equipment. Takes in information on the Equipment as a comma delimited string,
     * stores info on name, count, totalWeight, totalPrice, and its description. Note that the name and count
     * are separated by a comma, not a forward slash.
     *
     * @param strg Information about the Equipment in the format:
     * 	"name/count,totalWeight,totalPrice,description"
     * The description will not contain any commas or forward-slashes.
     * The count is an integer value.
     */
    public Equipment(String strg)
    {
        String[] tokens = strg.split(",");

        String[] idinfo = tokens[0].split("/");
        this.name = idinfo[0];
        this.count = Integer.parseInt(idinfo[1]);
        this.totalWeight = Double.parseDouble(tokens[1]);
        this.totalPrice = Double.parseDouble(tokens[2]);
        this.description = tokens[3];
    }

    /**
     * toString override. Gives all information about the Equipment.
     *
     * @return All information about the Equipment formatted as (replacing parentheses with member variables):
     * "Name: (name), Number: (count), Weight: (weight, to 2 decimal places) lbs, Price: $(price, to 2 decimal places) - (description)"
     *
     * e.g.
     * "Name: Batarang, Number: 5, Weight: 3.22 lbs, Price: $700.75 - bat-shaped boomerangs"
     */
    @Override
    public String toString()
    {
        return String.format("Name: %s, Number: %d, Weight: %.2f lbs, Price: $%.2f - %s",
                name, count, totalWeight, totalPrice, description);
    }

    /**
     * Return the name of the Equipment.
     *
     * @return String name of this Equipment.
     */
    public String getName()
    {
        return name;
    }

	public int getCount() {
		return count;
	}
	public double getTotalWeight() {
		return totalWeight;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public String getDescription() {
		return description;
	}

	/**
     * Override the equals method for equipment. Equipment are considered equal
     * if the name, count, totalWeight, totalPrice, and description are the same.
     *
     * @param other The other animal to compare to.
     * @returns True if all fields (name, count, totalWeight, totalPrice, and description)
     * are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other)
    {
    	// Return true if the exact same object:
        if (other == this)
        {
            return true;
        }

        // Return false if the other object is not an Equipment:
        // (use instanceof to do this)
        if (!(other instanceof Equipment))
        {
            return false;
        }

        // Cast object to Equipment type to compare member variables:
        Equipment otherEq = (Equipment)other;

        
        // TODO: finish method
     // Check that all fields match (name, count, totalWeight, totalPrice, anddescription):
        boolean sameName = this.getName().equals(otherEq.getName());
        boolean sameCount = this.getCount() == otherEq.getCount();
        boolean sameTotalWeight = this.getTotalWeight() == otherEq.getTotalWeight();
        boolean sameTotalPrice = this.getTotalPrice() == otherEq.getTotalPrice();
        boolean sameDescription = this.getDescription().equals(otherEq.getDescription());
        
        return sameName && sameCount && sameTotalWeight && sameTotalPrice && sameDescription;
    }
}
