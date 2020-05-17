import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		//task d multiple (hard) -- failed
		Scanner sc= new Scanner(System.in);
		String S = sc.nextLine();
		int count = 0;
		for(int i = 0; i< S.length(); i++){
			for(int j = i+1; j< S.length(); j++){
				if(Long.parseLong(S.substring(i, j))%2019==0){
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
