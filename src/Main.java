

public class Main {

	public static void main(String[] args) {
		Secretario secretario1 = new Secretario("Antoin", "9183kamd", 1, 193129887);
		Transportador transportador1 = new Transportador("Maria", "estudo", 0, 3728173);
		Secretario secretario2 = new Secretario("Jose", "kaskf1e", 1, 1398397);
		Transportador transportador2 = new Transportador("Joana", "senhafacil", 0, 665718);
		Secretario secretario3 = new Secretario("Joao", "98kako", 1, 81723098);
		Transportador transportador3 = new Transportador("Francisco", "senhadificil", 0, 479183);
		Transportador transportador4 = new Transportador("Chiquim", "programar", 0, 498192);
		Transportador transportador5 = new Transportador("Chico", "irmaodochiquim", 0, 498192);
		Hash hash = new Hash();
		hash.add(secretario1);
		hash.add(secretario2);
		hash.add(secretario3);
		hash.add(transportador1);
		hash.add(transportador2);
		hash.add(transportador3);
		hash.add(transportador4);
		hash.add(transportador5);

		
		new Display(hash);
	}

}
