package Uni;

import java.util.Scanner;

public class ClassroomControl {
    public static void main(String[] args) {
        Rooms roomOne = new Rooms();
        Rooms roomTwo = new Rooms();
        Rooms roomThree = new Rooms();
        Rooms roomFour = new Rooms();
        Scanner scanner = new Scanner(System.in);
        int flagOne = 0;
        while (flagOne != -1){
            System.out.print("Do you want to add new Teacher or Student?");
            String answer = scanner.nextLine();
            if(answer.toLowerCase().equals("teacher")) {

                System.out.print("Enter First name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter Second name: ");
                String secondName = scanner.nextLine();


            }
        }



    }
}


