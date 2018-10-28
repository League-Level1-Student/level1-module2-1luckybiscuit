
public class CcreatureRunner {
	public static void main(String[] args) {
		SeaCreature sb = new SeaCreature("Spongebob");
		SeaCreature pk = new SeaCreature("Patrick");
		SeaCreature sw = new SeaCreature("Squidward");
		sb.getName();
		pk.getName();
		sw.getName();
		sb.eat();
		pk.eat();
		sw.eat();
		sb.laugh();
		pk.laugh();
		sw.laugh();
	}
}
