package generic;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Box myBox = new Box<String>("secret string");
		System.out.println(myBox.getValue());
		
		Box myBox2 = new Box<Integer>(120);
		myBox2.setValue(120);
		System.out.println(myBox2.getValue());
		
		ArrayList<String> myArrayList = new ArrayList<String>();
	}
}
