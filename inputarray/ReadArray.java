import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadArray{
	public static void main (String[] args){

		int[] vectN = introduceVect();

	}
	public static int[] introduceVect(){
		int i = 0;

		int[] vect = new int[100];
		try{
			
			int number = 1;
			BufferedReader console = new BufferedReader(new InputStreamReader (System.in));
			do{
				System.out.println("Introduce an integer. Introduce  \"0\" for exti");
				String stringRead = console.readLine();
				number = Integer.parseInt(stringRead);

				vect[i] = number;
				i++;
			}while(number !=0);

		}catch(IOException ex){
		}
			int N = i-1;
			int[] vectN = new int[N];

			for (i=0; i<N; i++){
				vectN[i] = vect[i];
				System.out.println("The element"+i+":"+vect[i]);
			}

		        return vectN;



	}


}
