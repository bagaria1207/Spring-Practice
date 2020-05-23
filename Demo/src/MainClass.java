
public class MainClass {
	public static void main(String[] args) {
		Address addr = new Address("Pune", "411040");
		Person p = new Person("Rahul", addr);
		
		System.out.println("Name : "+p.getName()+
						   "\nCity : "+ p.getAddress().getCity()+
						   "\nPincode : "+ p.getAddress().getPincode());
	}
}
