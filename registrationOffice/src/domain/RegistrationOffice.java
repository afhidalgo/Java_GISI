package domain;
import java.util.ArrayList;
import java.util.Scanner; 
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

/**
 * [Description of the method/class/field]
 * 
 * @param paramName [Description of the parameter]
 * @return [Description of the return value, if applicable]
 * @throws ExceptionType [Condition under which the exception is thrown]
 * @author Ansdrés F. Hidalgo
 * @version [Version number]
 * @since [Version or date]
 */

public class RegistrationOffice
{
    private ArrayList<Inhabitant> inhabitantsCensus = new ArrayList<>();

    public RegistrationOffice(){
        loadInhabitants();
    }

    //public void addInhabitant(Inhabitant inhabitant){
    //     inhabitantsCensus.add(inhabitant);
    //}

    public void addInhabitant(Inhabitant inhabitant)
    { 
        inhabitantsCensus.add(inhabitant);
        dumpContacts();
    }
    

    public ArrayList<Inhabitant> getInhabitantsCensus(){
         return inhabitantsCensus;
    }

    public int calculatePopulationNumber(){ 
        int sum = 0;
        for(Inhabitant inhabitant : inhabitantsCensus){ 
            sum++;
        }
        return sum;
    }

    /**
     * Function to add Inhabitants objects
     * 
     * @param paramName [Description of the parameter]
     * @return [Description of the return value, if applicable]
     * @throws ExceptionType [Condition under which the exception is thrown]
     * @author Ansdrés F. Hidalgo
     * @version [Version number]
     * @since [Version or date]
     */

    private void loadInhabitants(){ 
        try{
            File file = new File("census.csv");
            // Create the file if it does not exist: 
            file.createNewFile();
            Scanner sc = new Scanner(file); 
            sc.useDelimiter(",|\n"); 
            while(sc.hasNext()){
                Inhabitant inhabitant = new Inhabitant(sc.next(), sc.next(), sc.next());
                inhabitantsCensus.add(inhabitant);
        }
            sc.close();
        }catch(IOException ex){
             System.out.println("No inhabitants registered");
        }
    }

    public void dumpContacts(){ 
        try{
            FileWriter fw = new FileWriter("census.csv"); 
            for(Inhabitant inhabitant : inhabitantsCensus){
                fw.write(inhabitant.getName() + "," + inhabitant.getSurname1() + "," + inhabitant.getSurname2() + "\n");
            }
        fw.close();
        }catch(IOException ex){ 
            System.err.println(ex);
        }
    }
        
        
        
}