import java.util.Scanner;
public class Car{
    static float fuel_consumption = 5.7F; //in L/100km
    int tank_capacity; // in L
    int fuel; // in L
    static String paint_color;

    public Car(String color) {
        paint_color = color;
        fuel = 20;
        tank_capacity = 50;
    }

    public Car() {
        paint_color = "white";
        fuel = 20;
        tank_capacity = 50;
    }

    public static void honk() {
        System.out.println("Honk! Honk!");
    }

    public void showRange() {
        int range = (int) (Math.floor(tank_capacity/fuel_consumption) * 100);
        System.out.println("Current range is: " + range + "km");
    }

    public void refuel() {
        boolean go_on = true;
        int tanked_fuel;
        while (go_on) {
            int max_fuel = tank_capacity - fuel;
            System.out.println("The fuel price is 6.50 PLN per liter. How many litres do you want?" +
                    "(Max. " + max_fuel + "L)");
            Scanner keyboard = new Scanner(System.in);
            tanked_fuel = keyboard.nextInt();
            if (tanked_fuel > max_fuel) {
                System.out.println("Error! Too much fuel. Try again with a lower amount.");
                break;
            }
            else {
                float cost = (float) (6.5 * tanked_fuel);
                System.out.println("That will be" + cost + " PLN.");
                fuel += tanked_fuel;
                go_on = false;
            }
        }
    }
}