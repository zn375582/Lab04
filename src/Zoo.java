/**
 * Class to represent a zoo. Holds a list of animals that are present at the zoo.
 * Calculates statistics about these animals.
 * 
 * @author Stephen Thung
 * @version 2018-01-23
 */
public class Zoo
{
    /**
     * Array to keep track of all of the Zoo's animals.
     * 
     * The size of the array is the capacity of the zoo. This should match the value of the
     * member variable "capacity".
     * 
     * The number of animals in the zoo may be less than the capacity of the zoo. For example,
     * the zoo may be able to hold 5 animals at a given point (array size/capacity = 5), but only
     * contain 2 animals (numAnimals=2).
     * 
     * When an animal is added, it should be added in the first free index. I.e. if there are 2
     * animals in the array, when a third is inserted it should be inserted in index 2, as arrays
     * start from 0.
     * 
     * When an animal should be added but the zoo is full, the zoo must be expanded to increase
     * capacity.
     */
    private Animal[] animals;

    /**
     * The number of animals present in the zoo.
     */
    private int numAnimals;
    
    /**
     * The number of animals that the zoo can currently hold.
     * Should always be equal to the size of the animals array.
     */
    private int capacity;

    /**
     * Default Constructor
     * 
     * Initializes the zoo capacity (and array size) to an initial value
     * Sets the numAnimals to 0
     * 
     * @param initialCapacity The initial number of animals that the zoo can hold.
     */
    public Zoo(int intialCapacity) 
    {
        this.animals = new Animal[intialCapacity];
        this.capacity = intialCapacity;
        this.numAnimals = 0;
    }

    /**
     * Doubles the capacity of the zoo (both the variable and the size of the array).
     * 
     * Remember: an array's size is immutable - it cannot be changed. Instead, to "increase" the size of the
     * animals array, you will need to create a new array with a larger size, copy over the data in the "animals"
     * array, and update the reference of the "animals" array to the new array.
     */
    private void expandZoo()
    {
        // Create the new array
        Animal[] newArray = new Animal[capacity*2];
        // Copy each value from animals into the new array
        for (int i = 0; i < capacity; ++i) 
        {
            newArray[i] = this.animals[i];
        }
        // Update the reference and values
        capacity *= 2;
        this.animals = newArray;
    }

    /**
     * Add a single animal to the zoo. Adds the animal into the animals array and updates the number of animals.
     * Expands the animals array if there is not enough room to store a new animal (zoo capacity is exceeded).
     * 
     * @param ani The animal to be added to the zoo.
     */
    public void addAnimal(Animal ani)
    {
        // Check if the current index is at the end of the array
        if (numAnimals == capacity) 
        {
            // If so, extend the size of the array
            expandZoo();
        }
        //actually add products to the inventory
        animals[numAnimals] = ani;
        numAnimals++;
    }

    /**
     * Loop over all the Animals in the zoo to compute the total height.
     * 
     * @return The sum of height of animals in the zoo.
     */
    public double getTotalHeight() 
    {
        double result = 0.0;
        // Loop over all animals and sum the weight:
        for (int i = 0; i < numAnimals; ++i) 
        {
            result += this.animals[i].getHeight();
        }
        return result;
    }
    
    /**
     * Loop over all the Animals in the zoo to compute the average weight.
     * 
     * @return Average weight (rounded down) of all animals in the zoo.
     */
    public int getAverageWeight()
    {
    	if (numAnimals == 0)
    		return 0;
        double totalWeight = 0;
        for (int i = 0; i < numAnimals; i++) 
        {
            Animal animal = animals[i];
            totalWeight += animal.getWeight();
        }
        return (int) (totalWeight / numAnimals);
    }
    
    /**
     * Loop over all the Animals in the zoo to compute the average weight over all animals that
     * match the given color.
     * 
     * (Be sure to divide by the number of animals that match the color, not the total number of animals)
     * 
     * @param color The average weight is computed for animals of this color.
     * @return Average weight (rounded down) of all animals of a certain color in the zoo.
     */
    public int getAverageWeight(String color)
    {
    	if (numAnimals == 0)
    		return 0;
    	int numMatch = 0;
        double totalWeight = 0;
        for (int i = 0; i < numAnimals; i++) 
        {
            Animal animal = animals[i];
            // Only compute if the colors match:
            if (animal.getColor().equalsIgnoreCase(color))
            {
            	numMatch++;
            	totalWeight += animal.getWeight();
            }
        }
        return (int) (totalWeight / numMatch);
    }

    /**
     * Retrieve the array that constitutes the animals in the zoo.
     * 
     * @return The Animal array representing the zoo.
     */
    public Animal[] getAnimals()
    {
        return animals;
    }
    
    /**
     * Get the zoo's capacity.
     * 
     * @return The zoo's capacity.
     */
    public int getCapacity()
    {
    	return capacity;
    }

    /**
     * Print out formatted information about the animals in the zoo.
     * 
     * @return A string representing the animals in the zoo. Formatted as:
     * "These animals live in the zoo: \n" +
     * for each animal in the animals array (starting from index 0), the toString of the animal
     */
    public String toString() 
    {
        String result = "These animals live in the zoo: \n";
        for (int i = 0; i < numAnimals; ++i) 
        {
            // add each Animal toString in the array to the result string
            result += animals[i].toString();
        }
        return result;
    }
}
