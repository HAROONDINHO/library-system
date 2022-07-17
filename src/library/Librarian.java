package library;


public class Librarian {
    private String name;
    private String password;
    private String mail;
    private String address;
    private String city;
    private String contactNo;
    Integer id;

   

    public Librarian(String name, String password, String mail, String address, String city, String contactNo) {
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.address = address;
        this.city = city;
        this.contactNo = contactNo;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
