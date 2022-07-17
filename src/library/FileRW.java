package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileRW {
    

        
        
        public static int readAdmins(Admin admins[]) throws FileNotFoundException{
           int count = 0;
           File f = new File("Admins.txt");
           Scanner s = new Scanner(f);
           while(s.hasNextLine())
           {
               String x = s.nextLine();
               String tokens[] = x.split("/");
               admins[count] = new Admin(tokens[0], tokens[1]);
               count++;
           }
           return count;
       }
        
        
        
       public static int readLibrarians(Librarian librarians[]) throws FileNotFoundException{
           int count = 0;
           File f = new File("Librarians.txt");
           Scanner s = new Scanner(f);
           while(s.hasNextLine())
           {
               String x = s.nextLine();
               String tokens[] = x.split("/");
               librarians[count] = new Librarian(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
               librarians[count].setId(count+1);
               count++;
           }
           return count;
       }
       
       
       
       public static void writeLibrarians(Librarian librarians[], int count) throws FileNotFoundException{
           File f = new File ("Librarians.txt");
           try(PrintWriter p = new PrintWriter(f))  {
               int i;
               for (i=0; i<count; i++)
               {
                  p.println(librarians[i].getName()+"/"+librarians[i].getPassword()+"/"+librarians[i].getMail()+"/"+librarians[i].getAddress()+"/"+librarians[i].getCity()+"/"+librarians[i].getContactNo());                  
               }
               p.close();
           }
       }
       
       
       
       public static int readStudents(Student students[]) throws FileNotFoundException{
           int count = 0;
           File f = new File("Students.txt");
           Scanner s = new Scanner(f);
           while(s.hasNextLine())
           {
               String x = s.nextLine();
               String tokens[] = x.split("/");
               students[count] = new Student(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
               count++;
           }
           return count;
       }
       
       
       
       public static void writeStudents(Student students[], int count) throws FileNotFoundException{
           File f = new File ("Students.txt");
           try(PrintWriter p = new PrintWriter(f))  {
               int i;
               for (i=0; i<count; i++)
               {
                   p.println(students[i].getName()+"/"+students[i].getPassword()+"/"+students[i].getMail()+"/"+students[i].getAddress()+"/"+students[i].getCity()+"/"+students[i].getContactNo());                  
               }
               p.close();
           }
       }
       
       
       
       public static int readBooks(Book books[]) throws FileNotFoundException, ParseException{
           int count = 0;
           File f = new File("Books.txt");
           Scanner s = new Scanner(f);
           
           while(s.hasNextLine())
           {
               String x = s.nextLine();
               String tokens[] = x.split("/");
               Date dd=new SimpleDateFormat("dd-MM-yyyy").parse(tokens[5]); 
               books[count] = new Book(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], dd);
               count++;
           }
           return count;
       }
       
       
      public static void writeBooks(Book books[], int count) throws FileNotFoundException{
           DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
           File f = new File ("Books.txt");
           try(PrintWriter p = new PrintWriter(f))  {
               int i;
               String s;
               for (i=0; i<count; i++)
               {  
                  s=dateFormat.format(books[i].getAddedDate());
                  p.println(books[i].getCallNo()+"/"+books[i].getName()+"/"+books[i].getAuthor()+"/"+books[i].getPublisher()+"/"+books[i].getQuantity()+"/"+s);                  
               }
               p.close();
           }
       }
       
       
        
       
        public static int readIssuedBooks(IssuedBook issuedBooks[]) throws FileNotFoundException, ParseException{
           int count = 0;
           File f = new File("IssuedBooks.txt");
           Scanner s = new Scanner(f);
           
           while(s.hasNextLine())
           {
               String x = s.nextLine();
               String tokens[] = x.split("/");
               Date issued=new SimpleDateFormat("dd-MM-yyyy").parse(tokens[3]);
               Date returns=new SimpleDateFormat("dd-MM-yyyy").parse(tokens[4]); 
               issuedBooks[count] = new IssuedBook(tokens[0], tokens[1], tokens[2], issued, returns);
               issuedBooks[count].id= count+1 ;
               count++;
           }
           return count;
       }
        
        
        public static void writeIssuedBooks(IssuedBook issuedBooks[], int count) throws FileNotFoundException{
           DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
           File f = new File ("IssuedBooks.txt");
           try(PrintWriter p = new PrintWriter(f))  {
               int i;
               String s, t;
               for (i=0; i<count; i++)
               {  
                   s=dateFormat.format(issuedBooks[i].getIssueDate());
                   t=dateFormat.format(issuedBooks[i].getReturnDate());
                   p.println(issuedBooks[i].getBookCallNo()+"/"+issuedBooks[i].getStudentName()+"/"+issuedBooks[i].getStudentContact()+"/"+s+"/"+t);                  
               }
               p.close();
           }
       }
        
        
        
       

     
         
}   
    
    

