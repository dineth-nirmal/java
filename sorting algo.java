import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] numbers = {5, 67, 3, 1, 100};
		System.out.println(Arrays.toString(numbers));
		for (int j = 1 ; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i+1]) {
					numbers[i] = numbers[i] + numbers[i+1];
					numbers[i+1] = numbers[i] - numbers[i+1];
					numbers[i] = numbers[i] - numbers[i+1];
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
	}
}
