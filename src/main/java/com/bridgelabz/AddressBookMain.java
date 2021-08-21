package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Main");
        ContactDetails person = new ContactDetails();

        person.setFirstName("Rohit");
        person.setLastName("Patro");
        person.setAddress("Bijipur");
        person.setCity("Berhampur");
        person.setState("Odisha");
        person.setZip("760001");
        person.setPhoneNumber("8249632998");
        person.setEmail("rohitpatro6@gmail.com");

        System.out.println(person);
    }
}
