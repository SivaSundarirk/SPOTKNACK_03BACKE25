import java.util.Scanner;

class TimeBomb extends Thread {

    private boolean defused = false;

    public void defuseBomb() {
        defused = true;
    }

    public void run() {
        try {
            for (int i = 10; i >= 0; i--) {

                if (defused) {
                    System.out.println("Bomb Defused!");
                    return;
                }

                System.out.println("Bomb exploding in " + i + " seconds...");
                Thread.sleep(1000);
            }

            if (!defused) {
                System.out.println("BOOM! The bomb exploded.");
            }

        } catch (InterruptedException e) {
            System.out.println("Bomb Defused!");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TimeBomb bomb = new TimeBomb();
        bomb.start();

        System.out.print("Enter the password to defuse the bomb: ");
        String password = scanner.nextLine();

        if (password.equals("1234")) {
            bomb.defuseBomb();
        } else {
            System.out.println("Wrong password!");
        }

        scanner.close();
    }
}
