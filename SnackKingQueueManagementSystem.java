//Thantrige Sahan Vimukthi Dharmarathne - 20222165 - W1985549.

import java.util.Scanner;


public class SnackKingQueueManagementSystem {

    //Creating the Scanner object for the programs all inputs.
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        FoodQueue foodQueue = new FoodQueue();//Creating the object from the Food queue class.
        foodQueue.queue();

        boolean Exit_Code = true;// Getting a boolean variable for code exit.
        //Getting a while loop for repetition of the program console menu.
        while (Exit_Code) {
            // Printing all the console menu for the operator.
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("========================================CONSOLE MENU========================================");
            System.out.println("100 or VFQ: View all Queues.");
            System.out.println("101 or VEQ: View all Empty Queues.");
            System.out.println("102 or ACQ: Add customer to a Queue.");
            System.out.println("103 or RCQ: Remove a customer from a Queue.(From a specific location)");
            System.out.println("104 or PCQ: Remove a served customer.");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order.");
            System.out.println("106 or SPD: Store Program Data into file.");
            System.out.println("107 or LPD: Load Program Data from file.");
            System.out.println("108 or STK: View Remaining pizza Stock.");
            System.out.println("109 or AFS: Add pizza to Stock.");
            System.out.println("110 or IFQ: Print the income of each queue.");
            System.out.println("999 or EXT: Exit the Program.");
            System.out.println(" ");
            System.out.println("============================================================================================");

            //Getting the operators input for the User's Option.
            System.out.print("Enter Your Menu Option : ");
            String Users_Option = input.next();

            //Use the switch case for all options in the console menu.
            //And also calling the methods in the Food Queue class by above created class object.
            switch (Users_Option) {
                case "100":
                case "VFQ":
                    foodQueue.view_all_Queues();
                    break;

                case "101":
                case "VEQ":
                    foodQueue.view_all_Empty_Queues();
                    break;

                case "102":
                case "ACQ":
                    foodQueue.adding_customer_to_A_Queue();
                    break;

                case "103":
                case "RCQ":
                    foodQueue.removing_A_Customer_From_Queue();
                    break;

                case "104":
                case "PCQ":
                    foodQueue.removing_A_Served_Customer();
                    break;

                case "105":
                case "VCS":
                    foodQueue.view_customers_Sorted();
                    break;

                case "106":
                case "SPD":
                    foodQueue.program_Data_Storing();
                    break;

                case "107":
                case "LPD":
                    foodQueue.program_Data_Loading();
                    break;

                case "108":
                case "STK":
                    foodQueue.view_remaining_Pizza_Stock();
                    break;

                case "109":
                case "AFS":
                    foodQueue.add_Pizza_Stock();
                    break;

                case "110":
                case "IFQ":
                    foodQueue.print_Income_Of_Queue();
                    break;

                case "999":
                case "EXT":
                    Exit_Code = false;
                    foodQueue.Exit_Program();
                    break;

                default:
                    System.out.println("Invalid option entered!Try again.");//Error message, if the user enter invalid console menu option.
            }
            System.out.println("============================================================================================");
        }
    }
}
