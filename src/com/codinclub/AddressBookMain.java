package com.codinclub;

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contacts contacts = new Contacts("Ankit", "Ghosh", "tikamgrah", "M.P.", 12345, 1234567890, "xyz@gmail.com");
        System.out.println(contacts);
    }
}

