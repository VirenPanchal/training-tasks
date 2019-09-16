import java.util.Scanner;

public class Stringfrequency {
	public static void main(String[] args) {
		int i, j, k, l = 0;
		String str;
		char c, ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str = sc.next();
		i = str.length();
		System.out.println(i);
		for (c = 'A'; c <= 'z'; c++) {
			k = 0;
			for (j = 0; j < i; j++) {
				ch = str.charAt(j);
				if (ch == c) {
					k++;
				}
			}

			if (k > 0) {
				System.out.println(c + "  frequency: " + k + "  times ");
			}

		}
	}
}
