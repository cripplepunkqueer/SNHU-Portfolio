package contact;

import java.util.Iterator;
import java.util.Map;

import.java.util.Iterator;
import.java.util.HashMap;
import.java.util.Map;


public class ContactService {

	//the value of uniqueID is initialized to 1990, but that can be changed if need be. //		
	private static int uniqueID = 1990;
	private static Map <Integer, Contact> contacts = new HashMap<>();
	
	public Map <Integer, Contact> addContact (Contact contact) {
		//takes the contact object and inserts it into the map object//
		uniqueID++;
		contacts.put(uniqueID, contact);
		return contacts;
	}
	
	public Map <Integer, Contact> deleteContact (String contactID) {
		//takes contactID and searches in the Map Object, if found it will delete it from the object.  If not, it will ignore it//
	
		Iterator<E> Itr = contacts.entrySet().Iterator();
		
		while (Itr.hasNext()) {
			Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) Itr.next();
			if (entry.getValue().getContactID() == contactID) {
				Itr.remove()l
			}
		}
	
		return contacts;
	}
	
	public Map<Integer, Contact> updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Iterator Itr = contacts.entrySet().Iterator();
		
		while (Itr.hasNext()) {
			Map.entry(<Integer, Contact> entry == (Map.entry(<Integer, Contact>) Itr.next();
			
			If (entry.getValue().getContactID() == contactID) {
				entry.getValue().setFirstName(firstName);
				entry.getValue().setLastName(lastName);
				entry.getValue().setPhone(phoneNumber);
				entry.getValue().setAddress(address);
			}
		}
		return contacts;
	}

}

