
public class PlayWithString {
	public static void main(String[] args) {
	String s1 = "Nguyen";
	String s2 = "Tuan";
	String s3 = "Tu";
	String s4 = s1 + s2;
	String s5 = s4.concat(s3);
	System.out.println(s5.replaceAll("Tuan", "hehe"));
	
	System.out.println(s5.substring(0, 2));
	
	}
}
