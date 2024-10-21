package negocio;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner; 

public class Padron{
	private ArrayList<Habitante> habitantesPadron = new ArrayList<>();

	public Padron(){
		cargarHabitantes();
	}

	public void annadir(Habitante habitante){
		habitantesPadron.add(habitante);
		volcarHabitantesPadron();
	}

	public ArrayList<Habitante> getHabitantesPadron(){
		return habitantesPadron;
	}

	private void volcarHabitantesPadron(){
		try{
			FileWriter fw = new FileWriter("padron.csv");
			for(Habitante habitante : habitantesPadron){
				fw.write(habitante.getNombre() + "," +
						habitante.getApellido1() + "," +
						habitante.getApellido2() + "\n");
			}
			fw.close();
		}catch(IOException ex){
			System.err.println(ex);
		}
	}

	private void cargarHabitantes(){
		try{
			File fichero = new File("padron.csv");
			//Crea el fichero si no existe
			fichero.createNewFile();
			Scanner sc = new Scanner(fichero);
			sc.useDelimiter(",|\n");
			while(sc.hasNext()){
				Habitante habitante = new Habitante(sc.next(),
								    sc.next(),
								    sc.next());
				habitantesPadron.add(habitante);
			}
			sc.close();
		}catch(IOException ex){
			System.err.println("No hay habitantes inscritos");
		}
	}
}
