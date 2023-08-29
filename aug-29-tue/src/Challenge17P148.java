import java.util.Scanner;

public class Challenge17P148 {
    public static void main(String[] args) {
var keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        var name = keyboard.nextLine();
        System.out.println("What is your age?");
        var age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is the name of a city?");
        var city = keyboard.nextLine();
        System.out.println("What is the name of a college?");
        var college = keyboard.nextLine();
        System.out.println("What is a profession?");
        var profession = keyboard.nextLine();
        System.out.println("What is a type of animal?");
        var animal = keyboard.nextLine();
        System.out.println("What is a pet's name?");
        var petName = keyboard.nextLine();
        String story = String.format("There once was a person named %s who lived in %s. At the age of %d, %s went to college at %s. %s graduated and went to work as a %s. Then, %s adopted a(n) %s named %s. They both lived happily ever after!", name, city, age, name, college, name, profession, name, animal, petName);
        System.out.println(story);
    }
}
//17. Word Game
//        Write a program that plays a word game with the user. The program should ask the user
//        to enter the following:
//        • His or her name
//        • His or her age
//        • The name of a city
//        • The name of a college
//        • A profession
//        • A type of animal
//        • A pet’s name
//        After the user has entered these items, the program should display the following story, inserting the user’s input into the appropriate locations:
//        There once was a person named NAME who lived in CITY. At the age of AGE, NAME went to college at COLLEGE. NAME graduated and went to work as a PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived happily ever after!