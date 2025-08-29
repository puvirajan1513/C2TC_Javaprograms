package abstract_example;


public class TNSCGDemo {

	public static void main(String[] args) {
		
		Trainer t=new softSkillTrainer();
		t.session();
		t.check();
		
		Trainer tt=new TechTrainer();
		tt.session();
		tt.check();

	}

}
