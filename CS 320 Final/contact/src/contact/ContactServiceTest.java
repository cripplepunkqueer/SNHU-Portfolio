package contact;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactServiceTest {

	public static List<Appt> appts = new ArrayList<>();

	public class ContactServiceTest {
		@Test
		
		public void addTest() {
			ContactService cs = new ContactService();
			Contact test1 = new Contact("8675309", "Jenny", "Tutone", "5555555555", "22222 Got Your Number On The Wall Ave.");
			assertEquals(true.cs.addContact(test1));
		}

		@Test
		public void deleteTest() {
			ContactService cs = new ContactService();
			
			Contact test1 = new Contact("8675309", "Jenny", "Tutone", "5555555555", "22222 Got Your Number On The Wall Ave.");
			Contact test2 = new Contact("5555555", "Frank", "Nfurter", "9000000000", "42 Frankenstein Pl");
			Contact test3 = new Contact("2222222", "Mr", "Rogers", "1234567890", "143 Mr. Rogers Address");

			cs.addContact(test1);
			cs.addContact(test2);
			cs.addContact(test3);
			
			assertEquals(true, cs.deleteContact("5555555"));
			assertEquals(false, cs.deleteContact("5555556"));
			assertEquals(false, cs.deleteContact("5555555"));
		
		}
		
		@Test
		public void updateTest() {
			ContactService cs = new ContactService();
			
			Contact test1 = new Contact("8675309", "Jenny", "Tutone", "5555555555", "22222 Got Your Number On The Wall Ave.");
			Contact test2 = new Contact("5555555", "Frank", "Nfurter", "9000000000", "42 Frankenstein Pl");
			Contact test3 = new Contact("2222222", "Mr", "Rogers", "1234567890", "143 Mr. Rogers Address");

			cs.addContact(test1);
			cs.addContact(test2);
			cs.addContact(test3);
			
			assertEquals(true, cs.updateContact("8675309", "Jenny", "Tutone", "5555555555", "22222 Got Your Number On The Wall Ave."));
			assertEquals(false, cs.updateContact("8675306", "Jennie", "Twotone", "5555555557", "22223 Got Your Number On The Wall Ave."))
			
		}
		
	}