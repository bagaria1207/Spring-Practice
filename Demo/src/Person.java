
public class Person {
	String name;
	Address address;
	
//	Tight Coupling
//	public Person(){
//		name = "xyz";
//		address = new Address("Pune", "411040");
//	}
	
	
//  Loose Coupling
//	As Perosn class does not depend on Address object;
	public Person(String str, Address adr){
		this.name = str;
		this.address = adr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
