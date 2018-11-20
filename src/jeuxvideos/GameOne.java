package jeuxvideos;

public class GameOne {

	public static void main(String[] args) {
		
		String[] consoleslastofus = {"PS4"};
		JeuxVideo lastofus = new JeuxVideo( consoleslastofus , "The Last Of Us") ;
		
		String[] consolesmariokart = {"3DS", "Switch", "Wii" , "GameBoy"};
		JeuxVideo mariokart = new JeuxVideo( consolesmariokart, "Mario Kart");

		System.out.println(lastofus+"\n\n"
				+mariokart+"\n\nEgaux : "
				+lastofus.equals(mariokart));
	}

}
