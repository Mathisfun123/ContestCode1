import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	protected static final float [] arr = new float[16];
	protected static void method() {
		float x = 0.0F;
		for (int i = 0; i <= 15; ++i) {
			float f1 = 1.0F - (float) i / 15.0F;
			arr[i] = (((1.0F - f1) / ((f1 * 3.0F) + 1.0F)) * (1.0F - x)) + x;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		method();
	}
}
