import java.util.Scanner;
// Ctrl + F11 de chay chuong trinh
public class ViDu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double mang1[];
		double[] mang2;
		
		mang1 = new double[] {3,1,4,1,2};
		
//		for(int i =0; i < mang1.length - 1; i++) {
//			System.out.print("Nhap gia tri thu " + (i+1) + ": ");
//			mang1[i] = scanner.nextDouble();
//		}
	
		for(int i =0; i < mang1.length + 1; i++) {
			System.out.println(mang1[i]);
		}
		
		
		scanner.close();
	}
	
}
