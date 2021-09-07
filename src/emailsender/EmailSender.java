/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailsender;

import com.email.durgesh.Email;


/**
 *
 * @author egeba
 */
public class EmailSender
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        try {
             Email email = new Email("ege.barisan.01@gmail.com","*****");
            
            email.setFrom("ege.barisan.01@gmail.com","Hello");
            
            email.setSubject("Helloo!");
            
            email.setContent("<h2>this message </h2>", "text/html");
            
            email.addRecipient("mkuz138@gmail.com");
            
            email.send();
            
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
    
}
