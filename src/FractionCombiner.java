import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FractionCombiner {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("fractions"));
		int n = sc.nextInt(); sc.nextLine();
		long denom = 1;
		long[] nums = new long[n];
		long[] den = new long[n];
		//Calc Den
		for(int i = 0; i< n; i++){
			 nums[i] = sc.nextInt();
			 den[i] = sc.nextInt();
			 denom*=  den[i] /(calcGCF(denom,den[i]));
		}
		long result = 0;
		for(int i = 0; i< n; i++){
			result+= nums[i]* (denom/den[i]);
		}
		System.out.println(result);
		System.out.println(denom);

	}
	public static long calcGCF(long a, long b){
		if(a%b ==0){
			return b;
		}else{
			return calcGCF(b, a%b);
		}
	}
}
