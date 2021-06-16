package BTVN;

import java.util.Scanner;

public class MainPhone {
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println(" 1. Insert Phone");
            System.out.println(" 2. Remove Phone");
            System.out.println(" 3. Update Phone");
            System.out.println(" 4. Search Phone");
            System.out.println(" 5. Sort");
            System.out.println(" 6. Show");
            System.out.println(" 7. Exit");


            int choise = Integer.parseInt(scanner.nextLine());

            if (choise == 7){
                break;
            }

            switch (choise) {
                case 1:
                    System.out.println("nhập name");
                    String name = scanner.nextLine();
                    System.out.println("nhập phone");
                    String phone = scanner.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 6:
                    show();
                    break;
            }
        }
    }

    static void show() {
        for (Phone p : phoneBook.phonelist) {
            System.out.println(p);
        }
    }
}
