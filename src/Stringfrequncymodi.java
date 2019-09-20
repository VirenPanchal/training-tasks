import java.util.Scanner;

public class Stringfrequncymodi {
	public static void main(String[] args) {
		String str = "";
		int count = 0, len = 0, flag = 0;
		int[] arr = new int[50];
		int check=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");

		str = sc.nextLine();
		len = str.length();

		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = 0; j < len; j++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;

				}
				for (int k = 0; k < i; k++) {
					if (str.charAt(k) == str.charAt(i)) {
						flag = 1;
					}
				}
			}

			if (flag != 1) {
				System.out.println(str.charAt(i) + "--" + count);
				
				arr[i] = count;
//				i++;
				
//				for (int m = 0; m <= count; m++) {
//					arr[m] = count;
//				}
				
			}
				flag = 0;
				
			}
		
			int freq = arr[0];
			for(int index = 1; index < str.length()- 1; index++) {
				if(freq != arr[index]) {
					check=0;
					break;
				}
			}
			if(check==0)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}

		}

	}

