import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PhoneTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Contact_instantiatesCorrectly_true() {
    Phone newPhone = new Phone("456", "333-1234", "Cell");
    assertEquals(true, newPhone instanceof Phone);
  }

  @Test
  public void getId_returnsCategoryId_1() {
    Phone testPhone = new Phone("456", "333-1234", "Cell");
    assertTrue(Phone.all().size() == testPhone.getId());
  }

  @Test
  public void getTasks_initiallyReturnsEmptyArrayList() {
    Phone testPhone = new Phone("456", "333-1234", "Cell");
    assertTrue(testPhone.getContacts() instanceof ArrayList);
  }

  @Test
  public void addPhone_addsPhoneToList() {
    Phone testPhone = new Phone("456", "333-1234", "Cell");
    Phone secondPhone = new Phone("456", "333-1234", "Cell");
    testCategory.addTask(testTask);
    assertTrue(testCategory.getTasks().contains(testTask));
  }


}
