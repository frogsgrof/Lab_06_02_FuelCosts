import java.util.Scanner; // importing scanner

public class Main {
    public static void main(String[] args) {

        // input variables:
        double gallonsOfGas = 0;
        double milesPerGallon = 0;
        double gasPrice = 0;
        String trash = "";

        // for calculations later
        double costPer100Mi;
        double milesCanTravel; //miles they can travel with gas currently in tank

        // initializing scanner:
        Scanner in = new Scanner(System.in);

        // 1st input prompt (# gallons)
        System.out.println("How many gallons of gas are in your tank?");

        if (in.hasNextDouble()){ // if valid int, store
            gallonsOfGas = in.nextDouble();
            in.nextLine();    // clear next line
        } else {    // if not valid int, throw in trash as string
            trash = in.nextLine();
            System.out.println("You entered: " + trash + "\n" +
                    "Invalid input.");
            System.exit(0); // terminate
        }

        // 2nd input prompt (mpg)
        System.out.println("Enter miles per gallon:");

        if (in.hasNextDouble()){ // if valid int, store
            milesPerGallon = in.nextDouble();
            in.nextLine();    // clear next line
        } else {    // if not valid int, throw in trash as string
            trash = in.nextLine();
            System.out.println("You entered: " + trash + "\n" +
                    "Invalid input.");
            System.exit(0); // terminate
        }

        // 3rd input prompt (gas price)
        System.out.println("Enter current gas price:");

        if (in.hasNextDouble()){ // if valid double, store
            gasPrice = in.nextDouble();
            in.nextLine();    // clear next line
        } else {    // if not valid double, throw in trash as string
            trash = in.nextLine();
            System.out.println("You entered: " + trash + "\n" +
                    "Invalid input.");
            System.exit(0); // terminate
        }

        // calculations:
        costPer100Mi = (100 / milesPerGallon) * gasPrice;
        milesCanTravel = gallonsOfGas * milesPerGallon;

        // final output:
        System.out.println("It would cost $" + costPer100Mi + " to drive 100 miles.\n" +
                "With the gas you currently have, you can drive " + milesCanTravel + " miles without getting more.");

        // end
    }
}
