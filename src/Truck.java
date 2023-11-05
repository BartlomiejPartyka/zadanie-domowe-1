import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Truck extends Car {
    static int max_payload = 40000; // in kg
    static int min = 500;
    int payload; // in kg
    String paint_color;

    public Truck(String color) {
        paint_color = color;
        super.fuel = 200;
        payload = 500; // in kg
        super.tank_capacity = 500;
        fuel_consumption = 32.9F;
    }

    public void packIn() {
        int max = max_payload - payload;
        int random_weight = ThreadLocalRandom.current().nextInt(min, max+ 1);
        payload += random_weight;
        System.out.println("Current payload is: " + payload + " kg");
    }

    public void packOut() {
        int max = max_payload - payload;
        int random_weight = ThreadLocalRandom.current().nextInt(min, max+ 1);
        random_weight *= -1;
        payload += random_weight;
        System.out.println("Current payload is: " + payload + " kg");
    }

    public void countFare() {
        System.out.println("""
                Choose the weight range:
                0. 500-1000 kg
                1. 1000-3000 kg
                2. 3000-5000 kg
                3. >5000 kg
                4. Exit""");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        float fare;
        switch(option) {
            case 1: {
                fare = 8;
                break;
            }
            case 2: {
                fare = 7;
                break;
            }
            case 3: {
                fare = 5;
                break;
            }
            case 4: {
                return;
            }
            default: {
                fare = 10;
                break;
            }
        }
        System.out.println("""
                Choose the distance:
                0. 50-300 km
                1. 300-700 km
                2. 700-1000 km
                3. >1000 km
                4. Exit""");
        option = keyboard.nextInt();
        switch(option) {
            case 0: {
                fare *= 3;
                break;
            }
            case 1: {
                fare *= 2;
                break;
            }
            case 2: {
                fare *= 1.5F;
                break;
            }
            case 3: {
                fare *= 1;
                break;
            }
            case 4: {
                return;
            }
            default: {
                fare = 10;
                break;
            }
        }
        System.out.println("The transport will cost" + fare + " PLN/kg/km");
    }

}
