package library;

import java.util.Date;


public class IssuedBook {
    int id;
    private String bookCallNo;
    private String studentName;
    private String studentContact;
    private Date issueDate;
    private Date returnDate;

    public IssuedBook(String bookCallNo, String studentName, String studentContact, Date issueDate, Date returnDate) {
        this.bookCallNo = bookCallNo;
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
    
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookCallNo() {
        return bookCallNo;
    }

    public void setBookCallNo(String bookCallNo) {
        this.bookCallNo = bookCallNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    
    
    
}

