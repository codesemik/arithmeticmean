import java.util.Scanner;
public class diziler {
	public static void main(String[] args) {
		/*int[] arrays = {1,3,5,7,9};
		for (int i = 0; i<=4; i++) {
			System.out.print("Arrays "); System.out.print(i+1);System.out.print("st element: "); System.out.println(arrays[i]);
		}*/
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		double mean= 0.0;
		
		for (int i = 0; i< 5; i++) {
			System.out.println("Enter the "+ (i+1) + "st number.");
			numbers[i] = input.nextInt();
		}
		
		for (int y = 0; y<=4; y++) {
			mean += numbers[y];
		}
		numbers /= 5.0;
		System.out.println("Arithmetic mean= " + (mean));
	}
}
