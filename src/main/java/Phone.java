import java.util.ArrayList;

public class Phone {
  private static ArrayList<Phone> instances = new ArrayList<Phone>();
  // private static ArrayList<Contact> mContacts;

  private String mAreaCode;
  private String mPhoneNumber;
  private String mType;
  private int mId;

  public Phone(String areaCode, String phoneNumber, String type) {
    mAreaCode = areaCode;
    mPhoneNumber = phoneNumber;
    mType = type;
    instances.add(this);
    mId = instances.size();
    // mContacts = new ArrayList<Contact>();
  }

  public String getAreaCode() {
    return mAreaCode;
  }

  public String getPhoneNumber() {
    return mPhoneNumber;
  }
  public int getId() {
    return mId;
  }

  public String getType() {
    return mType;
  }

  // public ArrayList<Contact> getContacts() {
  //   return mContacts;
  // }
  //
  // public void addPhone(Contact contact) {
  //   mContacts.add(contact);
  // }

  public static ArrayList<Phone> all() {
    return instances;
  }

  public static Phone find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e){
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}
