package src;

// Step 2: Create a new class called ingredient.
public class Ingredient {
    //Step 3: Create three new private class variables within class Ingredient. (amount, unit & name). Don't assign variables yet. These are private because they cannot be used outside of the class ingredient.
    private double amount;
    private String unit;
    private String name;


    //Step 4: Create an empty constructor and a constructor with the three variables as parameters.
    // We create this "empty" constructor, but we don't use it. Normally java creates it automatically, behind the scenes, but because we also made another constructor in this class, java doesn't do it automatically anymore. So we have to add this "empty" constructor ourselves.
    public Ingredient() {
    }

    // In this constructor we ask for 3 parameters.
    public Ingredient(double amount, String unit, String name) {
        // We use the 3 parameters to give the 3 class variables above a value.
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    //Step 5: Define a getter and setter per variable. These are methods that allow private class variables to be accessible outside the class ingredient.
    //We use these getters to print out the values in the printIngredients() method of ApplPieRecipe class.
    public double getAmount() {
        return amount;
    }
    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }
}
