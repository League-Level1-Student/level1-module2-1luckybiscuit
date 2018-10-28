
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		Smurf ette = new Smurf("Smurfette");
		Smurf papa = new Smurf("Papa");
		handy.eat();
		handy.getName();
		ette.getName();
		papa.getName();
		System.out.println(papa.getHatColor()+"\n"+ette.getHatColor()+"\n"+papa.isGirlOrBoy()+"\n"+ette.isGirlOrBoy());
		
	}
}
