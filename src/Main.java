import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//task b battle
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int b =sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt();
		boolean turn = true;
		while(a>0&&c>0){
			if(turn){
				c-=b;
			}else{
				a-=d;
			}
			turn= !turn;
		}
		System.out.println(a>0?"Yes":"No");

	}
}
