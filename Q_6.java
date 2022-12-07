
public class Q_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int square_of_sum = 0;
		int temp_sum = 0;
		int temp_square = 0;
		
		
		
		for(int i = 1; i <= 100; i++) {
			temp_sum +=  i;
			temp_square += i*i;
		}
		
		square_of_sum = temp_sum * temp_sum;
		
		System.out.println("Result: " + (square_of_sum - temp_square));
		
		
		
		
		
		
		

	}

}
