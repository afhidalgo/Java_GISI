public class Main{
	public static void main(String[] args){
		int[] numbers = {1, 2, 3};
		try{
			System.out.println("The numbers is:" + numbers[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of bounds: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
