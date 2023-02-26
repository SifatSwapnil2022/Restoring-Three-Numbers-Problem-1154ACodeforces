import java.util.Scanner;
import java.util.Arrays;
public class RestoringThreeNumbers {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int[] arr = new int[4];
			for(int i=0; i<arr.length; i++)
				arr[i] = scan.nextInt();
			Arrays.sort(arr);
			int a = arr[3] - arr[0];
			int b = arr[3] - arr[1];
			int c = arr[3] - arr[2];
			
			System.out.println(a + " " + b + " " + c);
			scan.close();
		}

	}

