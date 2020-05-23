package com.psl.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Address;
import com.psl.pojo.Person;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Person person = (Person)context.getBean("person");
//		List<Address> list = person.getAddressList();
//		for(Address s : list){
//			System.out.println(s.getCity()+" "+s.getPincode());
//		}
		
		
//		Map<String, Address> map = person.getAddressmap();
//		Set<String> keys = map.keySet();
//		for(String key : keys){
//			System.out.println("key = "+key);
//			System.out.print("Value = ");
//			System.out.println("City " + map.get(key).getCity());
//			System.out.println("Pincode "+map.get(key).getPincode());
//			System.out.println("\n\n");
//		}
		
		Set<Address> setPerson = person.getAddressSet();
		for(Address s : setPerson){
			System.out.println(s.getCity()+" "+s.getPincode());
		}
	}
}
