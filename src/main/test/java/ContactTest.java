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
  public void Contact_returnsFirstName_true() {
    Contact myContact = new Contact("Mary", "Barry", "June", "Boar");
    assertEquals("Steve", myContact.getFirstName());
  }

}
