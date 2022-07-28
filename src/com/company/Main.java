package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = getName();
        printName(name);

        String age = getAge();
        printName(age);

        String email = getEmail();
        printName(email);

        String faculty = getFaculty();
        printName(faculty);




    }
    private static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name ");
        return scanner.next();
    }

    private static String getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age ");
        return scanner.next();

    }
    private static String getEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your email ");
       return scanner.next();
    }
    private static String getFaculty(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your Faculty ");
        return scanner.next();
    }




    private static void printName(String name){
        System.out.println("Your name is .. " + name);
    }
    private static void printAge(int age){
        System.out.println("Your age is .. " + age);
    }
    private static void printEmail(String email){
        System.out.println("Your email is .. " + email);
    }
    private static void printFaculty(String faculty){
        System.out.println("Your faculty is .. " +  faculty);
    }
}
