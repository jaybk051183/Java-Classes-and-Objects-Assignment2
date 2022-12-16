package src;

//Step 6: Create a new class named ApplePieRecipe.
public class ApplePieRecipe {
    //Step 7: Create instances of ingredient objects by using the keyword "new".
    // Define the ingredients. These are class variables. That means that all methods within this class can access it.
    // We call the Indredients constructor each time with the "new" keyword, but with different arguments each time.
    // (sidenote: arguments are the parameters entered, so the constructor has parameters, the object created with the new-keyword has arguments)
    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient sugar = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient bakingSoda = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg =  new Ingredient(1, "stuks", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apple = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient cristalSugar = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneeel");
    Ingredient breadCrumbs = new Ingredient(15, "gram", "paneermeel");

    //Step 9: Define a new method that will print the ingredients, called printIngredients().
    public void printIngredients(){
        // Here we always call the getAmount(), getUnit() and getName() method of Ingredients, but each time for a different instance of Ingredients called with different values in the constructor and so we get a different result each time.
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());
        System.out.println(bakingSoda.getAmount() + " " + bakingSoda.getUnit() + " " + bakingSoda.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apple.getAmount() + " " + apple.getUnit() + " " + apple.getName());
        System.out.println(cristalSugar.getAmount() + " " + cristalSugar.getUnit() + " " + cristalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }

    //Step 10: Define another method that will print the steps (methods) to prepare an appliePie, called printRecipe().
    public void printRecipe(){
        // We call a different method each time. Each method in turn prints out a string.
        heatOven();
        whiskEggs();
        mixIngredients();
        cutApples();
        prepareBakingShape();
        spreadDough();
        spreadAppels();
        rollDough();
        garnishPie();
        bakePie();
    }

    //Step 8: For each step, create a public void method called step1, step2, etc. Then put a System.out.println() in the body of the method. And have it print out the text of the step. Then rename the method names so it can be reused.
    public void heatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void whiskEggs() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public void mixIngredients() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void cutApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void prepareBakingShape() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void spreadDough() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void spreadAppels() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void rollDough() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void garnishPie() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public void bakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}
