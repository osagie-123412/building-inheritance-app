public class House extends Building {

    private double livingRoom;
    private double kitchen;
    private double dining;
    private double bedroom;

    // Constructor - takes siding material, passes it up to Building
    public House(String siding) {
        super(siding);
    }

    // ---- Getters and Setters for each room ----
    public double getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(double livingRoom) {
        this.livingRoom = livingRoom;
    }

    public double getKitchen() {
        return kitchen;
    }

    public void setKitchen(double kitchen) {
        this.kitchen = kitchen;
    }

    public double getDining() {
        return dining;
    }

    public void setDining(double dining) {
        this.dining = dining;
    }

    public double getBedroom() {
        return bedroom;
    }

    public void setBedroom(double bedroom) {
        this.bedroom = bedroom;
    }

    /**
     * Calculates total square feet of the house by summing
     * all the room sizes, stores it in the inherited squarefeet
     * field (via setSquarefeet), and returns the total.
     */
    @Override
    public double totalSquareFeet() {
        double total = livingRoom + kitchen + dining + bedroom;
        setSquarefeet(total);
        return total;
    }

    @Override
    public String toString() {
        return "House -> " + super.toString();
    }
}
