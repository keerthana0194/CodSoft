import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bankbalance = 1000, amount;
        int ch;
        do {
            System.out.println("\n1.Withdraw  2.Deposit  3.Balance  4.Exit");
            System.out.print("Choose: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();
                    if (amount > bankbalance) 
                    System.out.println("Insufficient balance!");
                    else if (amount <= 0) 
                    System.out.println("Invalid amount!");
                    else 
                    { bankbalance = bankbalance - amount; 
                      System.out.println("Withdrawn Rs." + amount); 
                    }
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();
                    if (amount <= 0) 
                    System.out.println("Invalid amount!");
                    else 
                    { bankbalance = bankbalance + amount; 
                      System.out.println("Deposited Rs." + amount); 
                    }
                }
                case 3 -> System.out.println("Balance: Rs." + bankbalance);
                case 4 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice!");
            }
        } while (ch != 4);
        sc.close();
    }
}