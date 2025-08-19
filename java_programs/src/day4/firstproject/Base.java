package day4.firstproject;

public class Base {
	
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault() {
		System.out.println("Default access the value");
		System.out.println("value of Default: "+varDefault);
	}
	
	public void methodPublic() {
		System.out.println("Public access the value");
		System.out.println("value of Public: "+varPublic);
	}
	private void methodPrivate() {
		System.out.println("Private access the value");
		System.out.println("value of Private: "+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access the value");
		System.out.println("value of Protected: "+varProtected);
	}

}
