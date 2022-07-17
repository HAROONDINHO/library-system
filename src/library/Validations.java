package library;


public class Validations {
    
    public static boolean validMail (String email)
    {
        int i, atCount = 0;
        if (email.equals(""))
            return true;
        

        for (i = 0; i < email.length(); i++)
        {
            if (email.charAt(i) == '@')
                atCount++;
        }
        if (atCount != 1)
            return false;
        
        if (!email.contains("@gmail.com") && !email.contains("@yahoo.com")&&!email.contains("@hotmail.com"))
            return false;
        
        if(!(email.charAt(email.length()-1)=='m' && email.charAt(email.length()-2)=='o' && email.charAt(email.length()-3)=='c' && email.charAt(email.length()-4)=='.'))
            return false;
        
        return true;
    }
    
    public static boolean validNumber (String number) 
    {
        int i;
        for (i = 0; i < number.length(); i++)
        {
            if (!Character.isDigit(number.charAt(i)))
                return false;
        }
        return true;
    }
    
     public static boolean validId (String ID) 
    {
        int i;
        for (i = 0; i < ID.length(); i++)
        {
            if (!Character.isDigit(ID.charAt(i)))
                return false;
        }
        return true;
    }
    
    public static boolean validQuantity (String quantity) 
    {
        int i;
        
        if (quantity.equals(""))
            return false;
        for (i = 0; i < quantity.length(); i++)
        {
            if (!Character.isDigit(quantity.charAt(i)))
                return false;
        }
        return true;
    }
    
    public static boolean empty (String field)
    {
        if(field.equals(""))
            return true;
        else return false;
    }
 
}
