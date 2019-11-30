package zajecia7.ex3;

public class Student {
    private double permills;
    private double cheerfulness;
    private double maxPermills = 3.5;
    private double alcoholAbsorptionRate = 0.1;

    public Student() {} // UWAGA! jeżeli zdefiniuje choć jeden konstruktor
    // sparametryzowany to wówczas konstruktor domyślny (bez argumentów) nie istnieje
    // Muszę go zdefiniować "po swojemu" na własną rękę.

    public Student(double maxPermills, double alcoholAbsorptionRate) {
        this.maxPermills = maxPermills;
        this.alcoholAbsorptionRate = alcoholAbsorptionRate;
    }

    public String getState() {
        // student dmucha w alkomat
        return "Student blows in the breathalyser...\n" +
            "Permills: " + permills + "\n" +
            "Cheerfulness: " + cheerfulness + "\n" +
            "maxPermills: " + maxPermills + "\n" +
            "alcoholAbsorptionRate: " + alcoholAbsorptionRate + "\n";
    }

    public String drinkBeer(Beer beer) {
        if (permills + getPermillsForAlcohol(
                alcoholAbsorptionRate,
                beer.getAlcohol()
        ) > this.maxPermills) {
            cheerfulness -= getPermillsForAlcohol(alcoholAbsorptionRate, beer.getAlcohol());

            return "I'm done, no more beer!";
        }
        permills += getPermillsForAlcohol(
                alcoholAbsorptionRate,
                beer.getAlcohol()
        );
        cheerfulness += getPermillsForAlcohol(
                alcoholAbsorptionRate,
                beer.getAlcohol()
        );

        return "Nice beer! I'm so happy!";
    }

    public static double getPermillsForAlcohol(double alcoholAbsorptionRate,
                                         double beerAlcohol) {
        return alcoholAbsorptionRate * beerAlcohol;
    }

    public double getPermills() {
        return permills;
    }

    public double getCheerfulness() {
        return cheerfulness;
    }

    public double getMaxPermills() {
        return maxPermills;
    }

    public double getAlcoholAbsorptionRate() {
        return alcoholAbsorptionRate;
    }
}
