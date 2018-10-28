import javax.swing.JOptionPane;

public class Person {
	String name;
	String superpower;
	String getName() {
		return name;
	}
	String getPower() {
		return superpower;
	}
	void setName(String nick) {
		name = nick;
	}
	void setPower(String oof) {
		superpower = oof;
	}
	public String toString() {
		return name + " has mad " + superpower + " skills";
	}
}
