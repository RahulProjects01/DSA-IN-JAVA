// // public class Main {
// //     public static class Node {
// //         int data;
// //         Node next;

// //         Node(int data) {
// //             this.data = data;
// //         }
// //     }

// //     public static class LinkedList {
// //         Node head = null;
// //         Node tail = null;

// //         void insertAtEnd(int val) {
// //             Node temp = new Node(val);
// //             if (head == null) {
// //                 head = temp;
// //             } else {
// //                 tail.next = temp;
// //             }
// //             tail = temp;
// //         }

// //         void insertAtHead(int val) {
// //             Node temp = new Node(val);
// //             if (head == null) {
// //                 head = temp;
// //             }
// //             temp.next = head;
// //             head = temp;
// //         }

// //         void deleteFirst(int idx) {
// //             Node temp = head;
// //             for (int i = 1; i <= idx - 1; i++) {
// //                 temp = temp.next;
// //             }
// //             temp.next = temp.next.next;
// //             tail = temp;
// //         }

// //         int size() {
// //             int count = 0;
// //             Node temp = head;
// //             while (temp != null) {
// //                 count++;
// //                 temp = temp.next;
// //             }
// //             return count;
// //         }

// //         void dispaly() {
// //             Node temp = head;
// //             while (temp != null) {
// //                 System.out.print(temp.data + " ");
// //                 temp = temp.next;
// //             }
// //         }

// //     }

// //     public static void main(String[] args) {
// //         LinkedList ll = new LinkedList();
// //         ll.insertAtEnd(232);
// //         ll.insertAtEnd(322);
// //         ll.insertAtEnd(243);
// //         ll.insertAtEnd(789);
// //         ll.dispaly();
// //         System.out.println();
// //         ll.deleteFirst(3);
// //         // ll.insertAtHead(333);

// //         ll.dispaly();
// //         System.out.println();
// //         System.out.println("size of linkedList: " + ll.size());
// //     }
// // }

// // 
// public class Main {
//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static class LinkedList {
//         Node head = null;
//         Node tail = null;

//         void insertAtEnd(int data) {
//             Node temp = new Node(data);
//             if (head == null) {
//                 head = temp;
//             } else {
//                 tail.next = temp;
//             }
//             tail = temp;
//         }

//         void insertAtHead(int data) {
//             Node temp = new Node(data);
//             if (head == null) {
//                 head = temp;
//             }
//             temp.next = head;
//             head = temp;
//         }

//         void delete(int idx) {
//             Node temp = head;
//             for (int i = 1; i <= idx - 1; i++) {
//                 temp = temp.next;
//             }
//             temp.next = temp.next.next;
//             tail = temp;
//         }

//         void dispaly() {
//             Node temp = head;
//             while (temp != null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.insertAtEnd(10);
//         ll.insertAtEnd(20);
//         ll.insertAtEnd(30);
//         ll.insertAtEnd(40);
//         ll.insertAtHead(50);
//         ll.delete(3);
//         ll.dispaly();
//     }
// }






import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account account = new Account(accountNumber, accountHolder, initialBalance);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account already exists with the given account number.");
        }
    }

    public void displayAccountDetails(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found with the given account number.");
        }
    }

    public void performTransaction(String accountNumber, double amount, String transactionType) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            if (transactionType.equalsIgnoreCase("deposit")) {
                account.deposit(amount);
            } else if (transactionType.equalsIgnoreCase("withdraw")) {
                account.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type. Please choose deposit or withdraw.");
            }
        } else {
            System.out.println("Account not found with the given account number.");
        }
    }
}

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

public class BankingManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Perform Transaction");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = scanner.nextLine();
                    System.out.print("Enter Initial Balance: $");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accNumber, accHolder, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String displayAccNumber = scanner.nextLine();
                    bank.displayAccountDetails(displayAccNumber);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String transAccNumber = scanner.nextLine();
                    System.out.print("Enter Transaction Type (Deposit/Withdraw): ");
                    String transType = scanner.nextLine();
                    System.out.print("Enter Amount: $");
                    double transAmount = scanner.nextDouble();
                    bank.performTransaction(transAccNumber, transAmount, transType);
                    break;

                case 4:
                    System.out.println("Exiting Banking Management System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
