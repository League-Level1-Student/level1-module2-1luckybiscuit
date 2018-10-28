import javax.swing.JOptionPane;

public class Sims {
	public static void main(String[] args) {
	Person Jimothy = new Person();
	Person Jimothan = new Person();
	Person Jimoclese = new Person();
	Jimothy.setName("Jimothy");
	Jimothy.setPower("Biggay");
	Jimothan.setName("Jimothan");
	Jimothan.setPower("Superhomo");
	Jimoclese.setName("Jimoclese");
	Jimoclese.setPower("Omegay");
	JOptionPane.showMessageDialog(null, 	Jimothy.toString()+"\n"+Jimothan.toString()+"\n"+Jimoclese.toString());
	}
	
	
}
