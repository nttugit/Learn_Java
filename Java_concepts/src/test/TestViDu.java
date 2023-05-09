package test;

import code_a.ViDu;

// ko the import class cung ten, nhung van su dung duoc
//import code_b.ViDu;
public class TestViDu {
	public static void main(String[] args) {
		ViDu vd = new ViDu(1, 2);
		code_b.ViDu vd2 = new code_b.ViDu(1, 2, 3);
		System.out.println(vd.getA());
		System.out.println(vd2.getC());
	}

}
