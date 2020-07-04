import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("change.in"));
		int val = sc.nextInt(); sc.nextLine();
		String[] coinsstring = sc.nextLine().split(",");
		int[] coins = new int[coinsstring.length];
		for(int i = 0; i< coinsstring.length; i++){
			coins[i] = Integer.parseInt(coinsstring[i]);
		}


	}
}
