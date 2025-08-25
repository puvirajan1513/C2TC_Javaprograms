package day19;

public class WithoutLambdaExpr {

	public static void main(String[] args) {
		 IStatement s=new IStatement() {
	        	public String show()
	        	{
	        		return "Welcome to Lambda Expression";
	        	}};
	        	
	        	System.out.println(s.show());
	        

	}

}
