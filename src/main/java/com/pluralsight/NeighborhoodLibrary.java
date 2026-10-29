package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Book[] bookCatalog = new Book[20];
        bookCatalog[0] = new Book("Gone Girl", "123", "", false, 1000);
        bookCatalog[1] = new Book("Hunger Games", "234", "", false, 1001);
        bookCatalog[2] = new Book("The Help", "345", "", false, 1002);
        bookCatalog[3] = new Book("Room", "456", "", false, 1003);
        bookCatalog[4] = new Book("Ready Player One", "567", "", false, 1004);
        bookCatalog[5] = new Book("Silver Linings Playbook", "678", "", false, 1005);
        bookCatalog[6] = new Book("How to Train a Dragon", "789", "", false, 1006);
        bookCatalog[7] = new Book("The Martian", "890", "", false, 1007);
        bookCatalog[8] = new Book("Crazy Rich Asians", "901", "", false, 1008);
        bookCatalog[9] = new Book("Shutter Island", "134", "", false, 1009);
        bookCatalog[10] = new Book("Life of Pi", "245", "", false, 1010);
        bookCatalog[11] = new Book("Perks of Being a Wallflower", "356", "", false, 1011);
        bookCatalog[12] = new Book("The Girl with the Dragon Tattoo", "467", "", false, 1012);
        bookCatalog[13] = new Book("World War Z", "578", "", false, 1013);
        bookCatalog[14] = new Book("Unbroken", "689", "", false, 1014);
        bookCatalog[15] = new Book("Bird Box", "790", "", false, 1015);
        bookCatalog[16] = new Book("Wild", "801", "", false, 1016);
        bookCatalog[17] = new Book("Story of Your Life", "912", "", false, 1017);
        bookCatalog[18] = new Book("Doctor Sleep", "143", "", false, 1018);
        bookCatalog[19] = new Book("The Fault in Our Stars", "254", "", false, 1019);

        //Build Home Screen, Show Available Books, Show Checked Out Books, EXIT

        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Choose one of the following options: ");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");

            userInput = scanner.nextLine().trim();

            if (userInput.equals("1")) {
                for (Book book : bookCatalog) {

                    if (!book.isCheckedOut()) {
                        //System.out.println("Available Books: ");
                        System.out.println(book.getTitle());

                    }
                }
            } else if (userInput.equals(("2"))) {

                for (Book book : bookCatalog) {
                    if (book.isCheckedOut()){
                        System.out.println(book.getTitle());
                    }
                }

            }

        } while (!userInput.equals("3"));


    }
}
