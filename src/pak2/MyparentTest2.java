package pak2;

import pak1.Myparent;

class Mtchlid extends Myparent{
	public void printMember() {
//같은클래스만		System.out.println(prv);
		System.out.println(pub);
	//디폴트	System.out.println(deu);
		System.out.println(pro);

	}

}

class MyparentTest2 {
	public static void main(String[] args) {
		Myparent mp = new Myparent();
		// System.out.println(mp.prv); //private 는 같은 클래스에서만
		System.out.println(mp.pub);
		//System.out.println(mp.deu);
		//System.out.println(mp.pro);
	}

}