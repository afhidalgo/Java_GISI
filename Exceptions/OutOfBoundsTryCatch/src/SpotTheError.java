public class SpotTheError {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try{
            System.out.println(numbers[5]); // Intentional out-of-bounds error
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds: " + e.getMessage());
            e.printStackTrace();

        }
        
    }
}
