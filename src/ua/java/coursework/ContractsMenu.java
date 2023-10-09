package ua.java.coursework;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContractsMenu {
    public static void main(String[] args){
        Contracts contract = new Contracts();
        ClientsFile clientsfile = new ClientsFile();
        PointsFile pointsfile = new PointsFile();
        RentsFile rentsfile = new RentsFile();
        ListPoint listpoint = new ListPoint();
        Rent rentpoint = new Rent();
        ListClients listclients = new ListClients();
        Information information = new Information();
        int userSelected;
        do {
            userSelected = Menu();
            switch(userSelected){
                case 1:
                    contract.say("The most expensive contract we have is the Nike store contract.");
                    System.out.println("Expensive contract.Thank you.");
                    break;
                case 2:
                    contract.say("The cheapest contract at the moment is the premises of Puma.");
                    System.out.println("Cheap contract.Thank you.");
                    break;
                case 3:
                    contract.say("The average rental term with us is from 1 month.");
                    System.out.println("Average rental term.Thank you.");
                    break;
                case 4:
                    listpoint.makeNoise();
                    System.out.println("ListPoint.Thank you.");
                    break;
                case 5:
                    rentpoint.makeNoise();
                    System.out.println("ListRent.Thank you.");
                    break;
                case 6:
                    listclients.makeNoise();
                    System.out.println("ListClients.Thank you.");
                    break;
                case 7:
                    clientsfile.makeNoise();
                    System.out.println("ClientsFile.Thank you.");
                    break;
                case 8:
                    pointsfile.makeNoise();
                    System.out.println("PointsFile .Thank you.");
                    break;
                case 9:
                    rentsfile.makeNoise();
                    System.out.println("RentFile.Thank you.");
                    break;
                case 10:
                    information.makeNoise();
                    System.out.println("Information.Thank you.");
                    break;
            }
        }
        while(userSelected!=0);
    }

    public static int Menu(){
        int selection;
        Scanner sc = new Scanner (System.in);
        System.out.println("Select your option:");
        System.out.println("-------\n");
        System.out.println("Expensive contract - Option 1");
        System.out.println("Cheap contract - Option 2");
        System.out.println("Average rental term - Option 3");
        System.out.println("ListPoint - Option 4");
        System.out.println("ListRent - Option 5");
        System.out.println("ListClients - Option 6");
        System.out.println("ClientsFile - Option 7");
        System.out.println("PointsFile - Option 8");
        System.out.println("RentFile - Option 9");
        System.out.println("Information about the company manager - Option 10");


        System.out.println("Your selected option is:");
        selection = sc.nextInt();
        return selection;
    }
}

