package entities;

public class Soma_Array {

	public static int arr[] = { 1,8,7,1,7,1};

	public static int sum() {

		int sum = 0;
		int i;

		for (i = 0; i < arr.length; i++)
			sum += arr[i];
		
		return sum;
	}
}