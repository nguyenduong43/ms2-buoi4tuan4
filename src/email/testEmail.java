package email;
import java.util.*;
public class testEmail {
    public static final String[] validEmail = new String[]{"a@gmail.com", "AbC@yahoo.com", "Abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        ktemail email = new ktemail();
        for (String s : validEmail) {
            System.out.println("email: " + s+":"+email.validate(s));
        }
        for (String s : invalidEmail) {
            System.out.println("email: " + s+":"+email.validate(s));
        }
    }
}
