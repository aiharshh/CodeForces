import java.util.Scanner;

public class AJellyfishAndUndertale {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			long a = scanner.nextLong(); // Read the maximum timer value 'a'
			long b = scanner.nextLong(); // Read the initial timer value 'b'
			int n = scanner.nextInt(); // Read the number of tools 'n'
			long[] x = new long[n];
			// Read the increment values for each tool
			for (int i = 0; i < n; i++) {
				x[i] = scanner.nextLong();
			}

			// Initialize maximum_time with the initial timer value 'b'
			long maximum_time = b;
			// Calculate the maximum time by adding the minimum of each tool's increment and (a-1)
			for (int i = 0; i < n; i++) {
				maximum_time += Math.min(x[i], a - 1);
			}

			// Output the maximum time until the bomb explodes
			System.out.println(maximum_time);
		}
		scanner.close();
	}
}

// Time Complexity (TC): O(n) = O(100)
// Space Complexity (SC): O(n) = O(100)
