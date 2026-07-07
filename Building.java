public class Building {

    private String siding;
    private double squarefeet;

    // Default constructor
    public Building() {
        this.siding = "Unknown";
        this.squarefeet = 0.0;
    }

    // Constructor with siding
    public Building(String siding) {
        this.siding = siding;
        this.squarefeet = 0.0;
    }

    // ---- Getters and Setters ----
    public String getSiding() {
        return siding;
    }

    public void setSiding(String siding) {
        this.siding = siding;
    }

    public double getSquarefeet() {
        return squarefeet;
    }

    public void setSquarefeet(double squarefeet) {
        this.squarefeet = squarefeet;
    }

    /**
     * Returns the total square feet of the building.
     * Subclasses (House, Commercial) override this to first
     * calculate the total from their rooms, store it in squarefeet,
     * and then return it.
     */
    public double totalSquareFeet() {
        return squarefeet;
    }

    @Override
    public String toString() {
        return "Siding: " + siding + ", Total Square Feet: " + squarefeet;
    }
}
