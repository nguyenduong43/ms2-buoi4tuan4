package email;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ktemail {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Email="^[A-Z][A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public ktemail() {
        pattern=Pattern.compile(Email);
    }
    public boolean validate(String email){
        matcher=pattern.matcher(email);
        return matcher.matches();
    }
}