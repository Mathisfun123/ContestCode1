import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(); int w = sc.nextInt();
		System.out.println(w<s?"safe":"unsafe");

	}
}
