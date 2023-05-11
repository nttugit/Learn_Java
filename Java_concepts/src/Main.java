import java.util.Arrays;

public class Main {
	public static void printStringArray(String[] arr) {
		System.out.println(Arrays.deepToString(arr));
//		for (String string : arr) {
//			System.out.print(string + " ");
//		}
		System.out.println();
	}

	public static void main(String[] args) {
		String helloStr = "Hello World, my name is Tu. I'm a developer";
		String helloArr[] = helloStr.split("\\.");
		String newHelloStr = Arrays.toString(helloArr);
		System.out.println(Arrays.toString(newHelloStr.split(" ")));
	}
}
