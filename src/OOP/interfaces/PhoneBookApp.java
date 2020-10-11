package OOP.interfaces;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
       PhoneBook pb = new PhoneBook();
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] splitLine = line.split(" ");
        Person p = new Person(splitLine[0],splitLine[1],splitLine[2]);
           pb.addContact(p);

        System.out.println(pb.listContact());
    }
}
