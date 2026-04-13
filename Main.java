package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        // make login object
        LogIn myLogin = new LogIn();
        
        // welcome message
        System.out.println("=====================================");
        System.out.println("   USER REGISTRATION SYSTEM");
        System.out.println("=====================================");
        
        // get user info
        System.out.print("Enter first name: ");
        String first = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String last = scanner.nextLine();
        
        System.out.print("Create username (must have _ and be 5 or less chars): ");
        String username = scanner.nextLine();
        
        System.out.print("Create password (8+ chars, 1 capital, 1 number, 1 special): ");
        String password = scanner.nextLine();
        
        System.out.print("Enter cell number (must start with + like +27731234567): ");
        String phone = scanner.nextLine();
        
        System.out.println("\n--- REGISTRATION RESULT ---");
        
        // register the user
        String result = myLogin.registerUser(username, password, phone, first, last);
        System.out.println(result);
        
        // if registration worked, do login
        if (result.startsWith("Username successfully captured")) {
            System.out.println("\n--- LOGIN ---");
            
            System.out.print("Enter username: ");
            String loginUser = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();
            
            System.out.println("\n--- LOGIN RESULT ---");
            
            String status = myLogin.returnLoginStatus(loginUser, loginPass);
            System.out.println(status);
        } else {
            System.out.println("\nRegistration failed. Please run again.");
        }
        
        scanner.close();
    }
}