import java.util.*;
import java.io.*;

class Hostel {
    String name, location, owner;
    int rooms;

    public Hostel(String name, String location, String owner, int rooms) {
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.rooms = rooms;
    }

    public String toString() {
        return name + " | " + location + " | " + owner + " | Rooms: " + rooms;
    }
}

public class Main {
    static ArrayList<Hostel> hostels = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Hostel\n2. View Hostels\n3. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1 -> addHostel();
                case 2 -> viewHostels();
                case 3 -> System.exit(0);
            }
        }
    }

    static void addHostel() {
        System.out.print("Enter Hostel Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Location: ");
        String location = sc.nextLine();
        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        int rooms = sc.nextInt(); sc.nextLine();

        Hostel h = new Hostel(name, location, owner, rooms);
        hostels.add(h);
        System.out.println("Hostel added successfully!");
    }

    static void viewHostels() {
        if (hostels.isEmpty()) {
            System.out.println("No hostels found.");
            return;
        }
        for (Hostel h : hostels) {
            System.out.println(h);
        }
    }
}
