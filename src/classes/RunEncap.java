package classes;

public class RunEncap {

	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setAge(20);
		encap.setIdNum("1234ms");
		encap.setName("James");
		
		System.out.println("Name : "+encap.getName()+"\nAge : "+encap.getAge()+"\nIdNum : "+encap.getIdNum());
	}
	
}
