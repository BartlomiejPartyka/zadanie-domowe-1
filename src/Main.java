import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        boolean go_on;
        boolean mainloop = true;
        Scanner keyboard = new Scanner(System.in);
        while (mainloop) {
            System.out.println("What do you want to drive?\n0. Passenger car\n1. Lorry\n2. Exit\n");
            int option = keyboard.nextInt();
            switch (option) {
                case 0: {
                    go_on = true;
                    Car red = new Car("red");
                    while (go_on) {
                        System.out.println("""
                                Choose what you want to do:
                                0. Honk
                                1. Show range
                                2. Refuel
                                3. Exit
                                """);
                        option = keyboard.nextInt();
                        switch (option) {
                            case 0: {
                                Car.honk();
                                break;
                            }
                            case 1: {
                                red.showRange();
                                break;
                            }
                            case 2: {
                                red.refuel();
                                break;
                            }
                            case 3: {
                                go_on = false;
                                break;
                            }
                            default:
                                Car.honk();
                                System.out.println("Something went wrong");
                                break;
                        }
                    }
                    break;
                }
                case 1: {
                    go_on = true;
                    Truck black = new Truck("black");
                    while (go_on) {
                        System.out.println("""
                                Choose what you want to do:
                                0. Honk
                                1. Show range
                                2. Refuel
                                3. Pack in
                                4. Pack out
                                5. Count fare
                                6. Exit
                                """);
                        option = keyboard.nextInt();
                        switch (option) {
                            case 0: {
                                Car.honk();
                                break;
                            }
                            case 1: {
                                black.showRange();
                                break;
                            }
                            case 2: {
                                black.refuel();
                                break;
                            }
                            case 3: {
                                black.packIn();
                                break;
                            }
                            case 4: {
                                black.packOut();
                                break;
                            }
                            case 5: {
                                black.countFare();
                                break;
                            }
                            case 6: {
                                go_on = false;
                                break;
                            }
                            default:
                                Car.honk();
                                System.out.println("Something went wrong!");
                                break;
                        }
                    }
                    break;
                }
                case 2: {
                    mainloop = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}

