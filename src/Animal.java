/**
 * Class to represent an animal in a zoo. Animals have a color, name, weight, and height.
 *
 * @author Stephen Thung
 * @version 2019-01-23
 */
public class Animal
{
    /**
     * The color of the animal
     */
    private String color;

    /**
     * The name of the animal
     */
    private String name;

    /**
     * The weight of the animal in pounds
     */
    private double weight;

    /**
     * The height of the animal in inches
     */
    private double height;


    /**
     * Empty (Default) Constructor
     *
     * Sets the weight to 0, age to 0, name to "noname", and color to "unknown"
     */
    public Animal()
    {
        this.color = "unknown";
        this.name = "noname";
        this.weight = 0.0;
        this.height = 0.0;
    }

    /**
     * Animal constructor setting all fields.
     *
     * @param color The animal color.
     * @param name The animal's name.
     * @param weight The animal's weight in pounds.
     * @param height The animal's height in inches.
     */
    public Animal(String color, String name, double weight, double height)
    {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }


    /**
     * Return the name of the given Animal
     * @return String name of the animal object
     */
    public String getColor()
    {
        return this.color;
    }


    /**
     * Return the name of the given Animal
     * @return String name of the animal object
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Return the weight of the given Animal in pounds
     * @return the weight of Animal in pounds as a double
     */
    public double getWeight()
    {
        return this.weight;
    }

    /**
     * Return the height of the animal in inches
     * @return the height of the animal in inches as in double
     */
    public double getHeight()
    {
        return this.height;
    }

    /**
     * When the user needs to print out info about an animal, present
     * the animal in order of color, name, weight, and height
     *
     * @return The string representation of the Animal class, formatted as:
     *         "(name), a (color)-colored animal. (weight) pounds, (height) inches.\n"
     * Weight and height are formatted to one decimal place.
     */
    @Override
	public String toString()
    {
        return String.format("%s, a %s-colored animal. %.1f pounds, %.1f inches\n",
                this.name, this.color, this.weight, this.height);
    }

    /**
     * Override the equals method. Java does not inherently know how to compare two objects.
     * Intuitively, two animals should be equal if their name, color, weight, and height are
     * the same, but Java does not do this automatically. It must be defined. One could also
     * define that two Animals are equal if their name and color are the same, regardless
     * of the weight.
     *
     * @param other The other animal to compare to.
     * @returns True if all fields (name, color, weight, height) are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other)
    {
    	  // Return true if the exact same object:
        if (other == this)
        {
            return true;
        }

        // Return false if the other object is not an Animal:
        // (use instanceof to do this)
        if (!(other instanceof Animal))
        {
            return false;
        }

        // Cast object to Animal type to compare member variables:
        Animal otherAni = (Animal)other;

        // Check that all fields match (color, name, weight, height):
        
        // TODO: finish this...
        boolean sameColor = this.getColor().equals(otherAni.getColor());
        boolean sameName = this.getName().equals(otherAni.getName());
        boolean sameWeight = this.getWeight() == otherAni.getWeight();
        boolean sameHeight = this.getHeight() == otherAni.getHeight();
        
        return sameColor && sameName && sameWeight && sameHeight;
        
        /* return TODO; */
    }
}
