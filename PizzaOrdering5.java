package projectpizza;



import java.util.Scanner;

public class PizzaOrdering5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, address, phone;
        int size, pizzaType, pizzaChoice, crust, toppings, quantity;
        boolean doubleToppings = false, extraCheese = false;
        double total;

        System.out.println("Welcome to Pizza Ordering!");
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.print("Please enter your address: ");
        address = input.nextLine();
        System.out.print("Please enter your phone number: ");
        phone = input.nextLine();
        
        // Choose pizza type
        System.out.println("Please choose the pizza type:");
        System.out.println("1 - Vegetarian");
        System.out.println("2 - Non-Vegetarian");
        System.out.print("Enter your choice (1-2): ");
        pizzaType = input.nextInt();
        
        if (pizzaType == 1) { // Vegetarian pizzas
            System.out.println("\nPlease select a Vegetarian pizza: ");
            System.out.println("1 - Deluxe Veggie ");
            System.out.println("2 - Cheese and Corn ");
            System.out.println("3 - Paneer Tikka ");
            System.out.print("Enter your choice (1-3): ");
            pizzaChoice = input.nextInt();
        } else { // Non-vegetarian pizzas
            System.out.println(" Please select a Non-Vegetarian pizza: ");
            System.out.println("1 - Non-Veg Supreme ");
            System.out.println("2 - Chicken Tikka ");
            System.out.println("3 -  Pepper Barbecue Chicken ");
            System.out.print("Enter your choice (1-3): ");
            pizzaChoice = input.nextInt();
        }
        
        // Choose pizza size
        System.out.println(" Please select a pizza size: ");
        System.out.println("1 - Regular ");
        System.out.println("2 - Medium ");
        System.out.println("3 - Large ");
        System.out.print("Enter your choice (1-3): ");
        size = input.nextInt();
        
        // Choose crust type
        System.out.println(" Please choose the crust type:");
        System.out.println("1 - New Hand Tossed ");
        System.out.println("2 - Wheat Thin Crust ");
        System.out.println("3 - Cheese Burst ");
        System.out.println("4 - Fresh Pan Pizza ");
        System.out.print("Enter your choice (1-4): ");
        crust = input.nextInt();
        
       // Choose toppings
System.out.println(" Please select your toppings:");
if (pizzaType == 1) { // vegetarian pizza
    System.out.println("1 -  Black olive");
    System.out.println("2 -  Capsicum");
    System.out.println("3 - Paneer");
    System.out.println("4 - Mushroom");
    System.out.println("4 - Fresh Tomato");
    System.out.print("Enter your choice (1-5): ");
} else { // non-vegetarian pizza
    System.out.println("1 - Chicken Tikka");
    System.out.println("2 - Barbeque Chicken");
    System.out.println("3 - Grilled Chicken");
    System.out.print("Enter your choice (1-3): ");
}
toppings = input.nextInt();


//Calculate total price
double pizzaPrice = 0.0;
if (pizzaType == 1) {               // Vegetarian pizzas
 if (pizzaChoice == 1) {            // Deluxe Veggie
     if (size == 1) {               // Regular
         pizzaPrice = 150.0;
     } else if (size == 2) {        // Medium
         pizzaPrice = 200.0;
     } else {                       // Large
         pizzaPrice = 325.0;
     }
 } else if (pizzaChoice == 2) {      // Cheese and Corn
     if (size == 1) {                // Regular
         pizzaPrice = 175.0;
     } else if (size == 2) {         // Medium
         pizzaPrice = 375.0;
     } else {                        // Large
         pizzaPrice = 475.0;
     }
 } else {                            // Paneer Tikka
     if (size == 1) {                // Regular
         pizzaPrice = 160.0;
     } else if (size == 2) {         // Medium
         pizzaPrice = 290.0;
     } else {                        // Large
         pizzaPrice = 340.0;
     }
 }
} else {                              // Non-vegetarian pizzas
 if (pizzaChoice == 1) {              // Non-Veg Supreme
     if (size == 1) {                 // Regular
         pizzaPrice = 190.0;
     } else if (size == 2) {          // Medium
         pizzaPrice = 325.0;
     } else {                         // Large
         pizzaPrice = 425.0;
     }
 } else if (pizzaChoice == 2) {       // Chicken Tikka
     if (size == 1) {                 // Regular
         pizzaPrice = 210.0;
     } else if (size == 2) {          // Medium
         pizzaPrice = 370.0;
     } else {                         // Large
         pizzaPrice = 500.0;
     }
 } else {                             // Pepper Barbecue Chicken
     if (size == 1) {                 // Regular
         pizzaPrice = 220.0;
     } else if (size == 2) {          // Medium
         pizzaPrice = 380.0;
     } else {                         // Large
         pizzaPrice = 525.0;
     }
 }
}

double toppingsPrice = 0.0;
if (pizzaType == 1) {                // Vegetarian pizza
 if (toppings == 1) {                // Black olive
     toppingsPrice = 20.0;
 } else if (toppings == 2) {         // Capsicum
     toppingsPrice = 25.0;
 } else if (toppings == 3) {         // Paneer
     toppingsPrice = 35.0;
 } else if (toppings == 4) {         // Mushroom
     toppingsPrice = 30.0;
 } else {                            // Fresh tomato
     toppingsPrice = 10.0;
 }
} else {                             // Non-vegetarian pizza
 if (toppings == 1) {                // Chicken Tikka
     toppingsPrice = 35.0;
 } else if (toppings == 2) {         // Barbeque Chicken
     toppingsPrice = 45.0;
 } else {                            // Grilled Chicken
     toppingsPrice = 40.0;
 }
}

// Adding double toppings price
if (doubleToppings) {
   toppingsPrice *= 2;
}

// Adding extra cheese price
if (extraCheese) {
   toppingsPrice += 35.0;
}




  //Choose sides
System.out.println(" Do you want to add any sides? (y/n) :");
String wantSides = input.next();
double sidesPrice = 0.0;
if (wantSides.equalsIgnoreCase("y")) {
 System.out.println("Please select your sides:");
 System.out.println("1 - Cold Drink ");
 System.out.println("2 - Mousse Cake");
 System.out.print("Enter your choice (1-2): ");
 int sidesChoice = input.nextInt();
 switch (sidesChoice) {
     case 1:
         sidesPrice = 55;
         break;
     case 2:
         sidesPrice = 90;
         break;
     default:
         System.out.println("Invalid choice.");
         break;
 }
}


//Choose quantity
System.out.print("How many pizzas do you want to order : ");
quantity = input.nextInt();

//Calculate total price
total = (pizzaPrice + sidesPrice + toppingsPrice ) * quantity;
System.out.println("Order Summary:");
System.out.println("Name: " + name);
System.out.println("Address: " + address);
System.out.println("Phone: " + phone);
System.out.println("Pizza Type: " + pizzaType);
System.out.println("Pizza size: " + size);
//Printing the final toppings price
System.out.println("Toppings Price: Rs " + toppingsPrice);
System.out.println("Sides: " + sidesPrice);
System.out.println("Quantity: " + quantity);
System.out.println("Total price: $" + total);
}
}



