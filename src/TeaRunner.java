
public class TeaRunner {
	public static void main(String[] args) {
	TeaBag beatag = new TeaBag(TeaBag.MINT);
	Kettle ket = new Kettle();
	ket.boil();
	Cup head = new Cup();
	head.makeTea(beatag, ket.getWater());
	}
}
