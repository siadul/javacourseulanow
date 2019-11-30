package zajecia7.ex3;

public class Barrel {
    public final static double MUG_SIZE = 0.5;

    private final String type;
    private double amount;
    private boolean opened;

    {
        System.out.println("Hey people! The barrel has just arrived!");
    }

    public Barrel(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public Beer createBeer() {
        System.out.println("Before beer creation, the amount of " +
                type + " beer is: " + amount);
        if(amount < MUG_SIZE) {
            System.out.println("Not enough beer :(");
            return new Beer("water", 0);
        }
        if(!opened) {
            System.out.println("Opening the new Barrel...");
            setOpened(true);
            amount -= MUG_SIZE;
        }
        amount -= MUG_SIZE;

        return new Beer(type, Beer.getAlcoholForType(type));
    }
}
