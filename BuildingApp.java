import java.util.Scanner;

public class BuildingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------------- HOUSE ----------------
        System.out.println("===== Creating a House =====");
        System.out.print("Enter siding material for the house (e.g. Brick, Vinyl): ");
        String houseSiding = input.nextLine();

        House house = new House(houseSiding);

        System.out.print("Enter size of Living Room (sq ft): ");
        double livingRoom = Double.parseDouble(input.nextLine());
        house.setLivingRoom(livingRoom);

        System.out.print("Enter size of Kitchen (sq ft): ");
        double kitchen = Double.parseDouble(input.nextLine());
        house.setKitchen(kitchen);

        System.out.print("Enter size of Dining Room (sq ft): ");
        double dining = Double.parseDouble(input.nextLine());
        house.setDining(dining);

        System.out.print("Enter size of Bedroom (sq ft): ");
        double bedroom = Double.parseDouble(input.nextLine());
        house.setBedroom(bedroom);

        double houseTotal = house.totalSquareFeet();

        // ---------------- COMMERCIAL ----------------
        System.out.println("\n===== Creating a Commercial Building =====");
        System.out.print("Enter siding material for the commercial building (e.g. Cement, HaloBrick): ");
        String commercialSiding = input.nextLine();

        Commercial commercial = new Commercial(commercialSiding);

        System.out.print("Enter size of Room 1 (sq ft): ");
        double room1 = Double.parseDouble(input.nextLine());
        commercial.setRoom1(room1);

        System.out.print("Enter size of Room 2 (sq ft): ");
        double room2 = Double.parseDouble(input.nextLine());
        commercial.setRoom2(room2);

        System.out.print("Enter size of Room 3 (sq ft): ");
        double room3 = Double.parseDouble(input.nextLine());
        commercial.setRoom3(room3);

        double commercialTotal = commercial.totalSquareFeet();

        // ---------------- RESULTS ----------------
        System.out.println("\n===== Results =====");
        System.out.println(house);
        System.out.println("Total Square Feet of House: " + houseTotal);

        System.out.println();
        System.out.println(commercial);
        System.out.println("Total Square Feet of Commercial Building: " + commercialTotal);

        input.close();
    }
}
