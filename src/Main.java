package src;

//Stap 1: Create a public static void main method (psvm tab shortcut)

public class Main {
    public static void main(String[]args){
        ApplePieRecipe applePie = new ApplePieRecipe();

        // Print the ingredients using the "printIngredients" method.

        applePie.printIngredients();

        // Print the recipe using the "prinRecipe" method.

        applePie.printRecipe();

    }
}

