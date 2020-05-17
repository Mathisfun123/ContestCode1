import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		//task c gacha
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		TreeSet<String> vals = new TreeSet<>();
		for(int i = 0; i< n; i++){
			vals.add(sc.nextLine());
		}
		System.out.println(vals.size());

	}
}
