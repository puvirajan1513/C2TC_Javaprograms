package day4.firstproject;

public class Executor {

	public static void main(String[] args) {
		Base b1=new Base();
		
		b1.methodDefault();
		//b1.methodPrivate();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		b1.varProtected=30;
		b1.methodProtected();
		
		b1.varPublic=50;
		b1.methodPublic();
		

	}

}
