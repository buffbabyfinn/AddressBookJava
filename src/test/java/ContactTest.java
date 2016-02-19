import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Contact_instantiatesCorrectly_true() {
    Contact myContact = new Contact("Mary", "Barry", "June", "Boar");
    assertEquals(true, myContact instanceof Contact);
  }

  @Test
  public void Contact_returnsFirstName_Mary() {
    Contact myContact = new Contact("Mary", "Barry", "June", "Boar");
    assertEquals("Mary", myContact.getFirstName());
  }

  @Test
  public void Contact_returnsLastName_Barry() {
    Contact myContact = new Contact("Mary", "Barry", "June", "Boar");
    assertEquals("Barry", myContact.getLastName());
  }

  @Test
  public void Contact_returnsBirthMonth_June() {
    Contact myContact = new Contact("Mary", "Barry", "June", "Boar");
    assertEquals("June", myContact.getBirthMonth());
  }

  @Test
  public void Contact_returnsZodiacSign_Boar() {
    Contact myContact = new Contact("Mary", "Barry", "June", "Boar");
    assertEquals("Boar", myContact.getZodiacSign());
  }

  @Test
  public void Contact_returnsContactId_1() {
    Contact myContact = new Contact("Mary", "Barry", "June", "Boar");
    assertEquals(Contact.all().size(), myContact.getId());
  }

  @Test
  public void Contact_correctlyIdentifiesAllContacts() {
    Contact firstContact = new Contact("Mary", "Barry", "June", "Boar");
    Contact secondContact = new Contact("Steve", "Hunter", "February", "Goat");
    assertEquals(Contact.find(secondContact.getId()), secondContact);
  }

  @Test
  public void find_returnsNullWhenNoTaskFound_null() {
    assertTrue(Contact.find(999) == null);
  }



}
