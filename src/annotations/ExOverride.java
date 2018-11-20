package annotations;

public class ExOverride {

	public static void main(String[] args) {
		new Enfant().afficheMessage();
		new Parent().afficheMessage();
		new GrandParent().afficheMessage();
	}
	
}

class GrandParent{
	void afficheMessage() {
		System.out.println("Invoque la méthode de la classe GrandParent");
	}
}

class Parent extends GrandParent{
	@Override
	void afficheMessage() {
		System.out.println("Invoque la méthode de la classe Parent");
	}	
}


class Enfant extends Parent{
	@Override
	void afficheMessage() {
		System.out.println("Invoque la méthode de la classe Enfant");
	}
}