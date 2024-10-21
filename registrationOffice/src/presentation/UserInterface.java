package presentation;
import java.util.ArrayList;

import domain.*;

public class UserInterface
{
    //public static void perform(String instruction){ 
    //    RegistrationOffice census = new RegistrationOffice(); 
    //    if (instruction.equalsIgnoreCase("show")){
    //        showRegistrationOffice(census);
    //    }else{
    //        System.out.println("Error in instruction");
    //    }
    //}

    
    public static void perform(String[] instruction){ 
        RegistrationOffice census = new RegistrationOffice();
        if (instruction[0].equalsIgnoreCase("show") && instruction.length == 1){
            showRegistrationOffice(census);
        }else if (instruction[0].equalsIgnoreCase("add") && instruction.length == 4){
            census.addInhabitant(new Inhabitant(instruction[1], instruction[2], instruction[3]));
            System.out.println("Inhabitant successfully added");
        }else{
            System.out.println("Error in instruction");
        }
    }
    
    private static void showRegistrationOffice(RegistrationOffice census){
         ArrayList<Inhabitant> inhabitants = census.getInhabitantsCensus();
         for(Inhabitant inhabitant : inhabitants){ 
            System.out.println(inhabitant.getName() + " " +
            inhabitant.getSurname1() + " " + inhabitant.getSurname2());
        }
        System.out.println("The total number of inhabitants is " + census.calculatePopulationNumber());
        }
}
    
    





    //private static void showRegistrationOffice(RegistrationOffice census){
    //    ArrayList<Inhabitant> inhabitants = census.getInhabitantsCensus();
    //    for(Inhabitant inhabitant : inhabitants){ 
    //        System.out.println(inhabitant.getName() + " " +
    //        inhabitant.getSurname1() + " " +
    //        inhabitant.getSurname2());
    //    }
    //    System.out.println("The total number of inhabitants is " + census.calculatePopulationNumber());
    //}
