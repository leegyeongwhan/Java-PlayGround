package pak1;

public class Myparent {
	private int prv; // 같은 클래스
	public int pub; // 접근제한업음 한소스파일명이랑 같아야함
	int deu; // 같은패키지
	protected int pro; // 같은패키지 +자손클래스(다른패키지)

	public void printMember() {
		System.out.println(prv);
		System.out.println(pub);
		System.out.println(deu);
		System.out.println(pro);

	}

}

class MyparentTest {
	public static void main(String[] args) {
		Myparent mp = new Myparent();
		// System.out.println(mp.prv); //private 는 같은 클래스에서만
		System.out.println(mp.pub);
		System.out.println(mp.deu);
		System.out.println(mp.pro);
	}

}
