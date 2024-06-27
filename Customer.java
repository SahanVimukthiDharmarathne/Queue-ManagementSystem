public class Customer{
    private String firstName; //Initialize a string variable for customers first name.
    private String secondName; //Initialize a string variable for customers second name.
    private int PIZZA_AMOUNT; //Initialize an integer variable for customers required pizza amount.

    private int ID;//Initialize an integer variable for customers ID.

    // Creating the constructor.
    public Customer(String firstname, String second_name, int pizza_amount, int identity) { // Using "this" keyword to assume variables to arguments.
        this.firstName = firstname;
        this.secondName = second_name;
        this.PIZZA_AMOUNT = pizza_amount;
        this.ID = identity;
    }

    public String getFirstName() {
        return firstName;
    } //Creating the method to get the customer's first name.

    public String getSecondName() {  //Creating the method to get the customer's second name.
        return secondName;
    } //Creating the method to get the customer's second name.

    public int getPizza_AMOUNT() { return PIZZA_AMOUNT;} //Creating the method to get the customer's required pizza amount.

    public int getID() {return ID;} //Creating the method to get the customer's ID.
}


