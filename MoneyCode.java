import java.util.Scanner;
public class MoneyCode {

    double amountOfMoney;

    public void askQuestion() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much money do you have?: ");
        amountOfMoney = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What is the name of the item?: ");
        String nameOfItem = keyboard.nextLine();
        System.out.println("What is the price of the item?");
        double priceOfItem = keyboard.nextDouble();

        double calculation = amountOfMoney / priceOfItem;

        System.out.println("With $" + amountOfMoney + ", you can buy " + nameOfItem + " " + calculation + " times until you run out of money.");

        System.out.println("\n Try again? 1 yes 2 no.");
        byte choice = keyboard.nextByte();

        if (choice == 1) {
            askQuestion2();
        }if(choice == 2){
            return;
        }
    }

    public void askQuestion2() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Same amount of money? 1 for yes 2 for no.");
        byte yesNo = keyboard.nextByte();
        keyboard.nextLine();
        if (yesNo == 2) {
            System.out.println("How much money do you have?: ");
            amountOfMoney = keyboard.nextDouble();
            keyboard.nextLine();
        } else {
            amountOfMoney = amountOfMoney;
        }

        System.out.println("What is the name of the item?: ");
        String nameOfItem = keyboard.nextLine();
        System.out.println("What is the price of the item?");
        double priceOfItem = keyboard.nextDouble();

        double calculation = amountOfMoney / priceOfItem;

        System.out.println("With $" + amountOfMoney + ", you can buy " + nameOfItem + " " + calculation + " times until you run out of money.");

        System.out.println("\n Try again? 1 yes 2 no.");
        byte choice = keyboard.nextByte();

        while (choice == 1) {
            askQuestion2();
        }

    }

}
