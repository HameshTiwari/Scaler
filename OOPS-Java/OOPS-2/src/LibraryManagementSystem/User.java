package LibraryManagementSystem;
abstract public class User {
    String userId;
    String name;
    String contactInfo;
    private static int totalUsers =0;

    public User()
    {
        userId=generateUniqueID();
        /*
        this.name="DefaultName";
         */
        /*
        this.contactInfo="defaultNumber";
         */
    }

    public User(String name,String contactInfo)
    {
        this.userId=generateUniqueID();
        this.name=name;
        this.contactInfo=contactInfo;
    }

    public User (User NewUser)
    {
        this.userId=generateUniqueID();
        this.name=NewUser.name;
        this.contactInfo=NewUser.contactInfo;
    }


    public String getContactInfo() {
        return contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    /*public void setUserId(String userId) {
        this.userId = userId;
    }*/
    private final String generateUniqueID(){
        totalUsers++;
        return "User-"+totalUsers;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

}
