package checks;
import java.util.ArrayList;

import domain.*;

public class Verification
{
    
    public static void main(String[] args){

        
        //Verification verObj = new Verification();
        //verObj.
        //performVerificationSett();


        //performVerificationCensus();

        performVerificationCensusFile();

        
    }
    /**
     * The method performVerificationSett is for testing Inhabitant setters
     */
    public static void performVerificationSett(){ 
        Inhabitant inhabitant1 = new Inhabitant(); 
        inhabitant1.setName("Juan"); 
        inhabitant1.setSurname1("Torres"); 
        inhabitant1.setSurname2("Sanz");
        System.out.println("Testing performVerificationSett method");
        System.out.println(inhabitant1.getName() + " " + inhabitant1.getSurname1() + " " + inhabitant1.getSurname2());
    }
    
    /**
     * The method performVerificationConst tests the Inhabitant constructor
     */
    public static void performVerificationConst(){
        Inhabitant inhabitant1 = new Inhabitant("Juan", "Torres ", "Sanz");
        System.out.println("Testing performVerificationConst method");
        System.out.println(inhabitant1.getName() + " " + inhabitant1.getSurname1() + " " + inhabitant1.getSurname2());
    }

    /**
     * The method performVerificationCensus is for testing a RegistrationOffice object
     */
    public static void performVerificationCensus (){
        Inhabitant inhabitant1 = new Inhabitant("Juan", "Torres ", "Sanz");
        Inhabitant inhabitant2 = new Inhabitant("Marta"," Caballero", "Ramos");
        RegistrationOffice census = new RegistrationOffice(); 
        census.addInhabitant(inhabitant1); 
        census.addInhabitant(inhabitant2); 
        ArrayList<Inhabitant> inhabitants = census.getInhabitantsCensus();
        System.out.println("Testing performVerificationCensus method");
        for(Inhabitant inhabitant : inhabitants){
            System.out.println(inhabitant.getName() + " " + inhabitant.getSurname1() + " " + inhabitant.getSurname2());
        }

        System.out.println("The total number of inhabitants is " + census.calculatePopulationNumber());
    }
    /**
     * The method performVerificationCensusFile is for testing a RegistrationOffice object from file
     */
    public static void performVerificationCensusFile(){ 
        RegistrationOffice census = new RegistrationOffice();
        ArrayList<Inhabitant> inhabitants = census.getInhabitantsCensus(); 
        for(Inhabitant inhabitant : inhabitants){
            System.out.println(inhabitant.getName() + " " + inhabitant.getSurname1() + " " + inhabitant.getSurname2());
        }
        System.out.println("The total number of inhabitants is " + census.calculatePopulationNumber());
    }
        

    
        

        
}

