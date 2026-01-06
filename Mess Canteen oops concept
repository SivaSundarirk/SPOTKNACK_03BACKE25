import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

abstract class User {
    protected String name;

    User(String name) {
        this.name = name;
    }

    abstract void showMenu();
}

class Student extends User {
    Student(String name) {
        super(name);
    }

    void showMenu() {
        System.out.println("\nStudent Menu");
        System.out.println("1. Breakfast (Rs:30)");
        System.out.println("2. Lunch (Rs:70)");
        System.out.println("3. Dinner (Rs:100)");
    }
}

class Staff extends User {
    Staff(String name) {
        super(name);
    }

    void showMenu() {
        System.out.println("\nStaff Menu");
        System.out.println("1. Breakfast (Rs:70)");
        System.out.println("2. Lunch (Rs:90)");
        System.out.println("3. Snacks (Rs:50)");
    }
}

class Wallet {
    private double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid amount");
    }

    public void deductMoney(double amount) throws InsufficientBalanceException {
        if (balance >= amount)
            balance -= amount;
        else
            throw new InsufficientBalanceException("Not enough balance to place order");
    }
}

class SmartCanteenSystem {

    public static void recommendMeal(double balance) {
        System.out.println("\nSmart Meal Recommendation");
        if (balance < 50)
            System.out.println("Recommended Snacks");
        else if (balance < 100)
            System.out.println("Recommended Lunch");
        else
            System.out.println("Recommended Full Meal Combo");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Welcome to Smart Canteen System");
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Select User Type:");
            System.out.println("1. Student");
            System.out.println("2. Staff");
            int type = sc.nextInt();

            User user = (type == 1) ? new Student(name) : new Staff(name);
            Wallet wallet = new Wallet(100);

            int choice;
            do {
                System.out.println("\nHello " + name);
                System.out.println("Wallet Balance: Rs " + wallet.getBalance());
                System.out.println("1. Show Menu");
                System.out.println("2. Order Meal");
                System.out.println("3. Add Money");
                System.out.println("4. Meal Recommendation");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        user.showMenu();
                        break;

                    case 2:
                        user.showMenu();
                        System.out.print("Select meal number: ");
                        int meal = sc.nextInt();
                        double price = 0;

                        if (user instanceof Student) {
                            if (meal == 1) price = 30;
                            else if (meal == 2) price = 70;
                            else if (meal == 3) price = 100;
                        } else {
                            if (meal == 1) price = 70;
                            else if (meal == 2) price = 90;
                            else if (meal == 3) price = 50;
                        }

                        try {
                            wallet.deductMoney(price);
                            System.out.println("Order Successful! Enjoy your meal 😊");
                        } catch (InsufficientBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to add: ");
                        wallet.addMoney(sc.nextDouble());
                        break;

                    case 4:
                        recommendMeal(wallet.getBalance());
                        break;

                    case 0:
                        System.out.println("Thank you for using Smart Canteen System");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 0);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter numbers only.");
        } finally {
            sc.close();
            System.out.println("System closed");
        }
    }
}
