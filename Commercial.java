public class Commercial extends Building {

    private double room1;
    private double room2;
    private double room3;

    // Constructor - takes siding material, passes it up to Building
    public Commercial(String siding) {
        super(siding);
    }

    // ---- Getters and Setters for each room ----
    public double getRoom1() {
        return room1;
    }

    public void setRoom1(double room1) {
        this.room1 = room1;
    }

    public double getRoom2() {
        return room2;
    }

    public void setRoom2(double room2) {
        this.room2 = room2;
    }

    public double getRoom3() {
        return room3;
    }

    public void setRoom3(double room3) {
        this.room3 = room3;
    }

    /**
     * Calculates total square feet of the commercial building by
     * summing all 3 room sizes, stores it in the inherited
     * squarefeet field (via setSquarefeet), and returns the total.
     */
    @Override
    public double totalSquareFeet() {
        double total = room1 + room2 + room3;
        setSquarefeet(total);
        return total;
    }

    @Override
    public String toString() {
        return "Commercial -> " + super.toString();
    }
}
