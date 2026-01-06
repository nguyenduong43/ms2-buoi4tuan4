package lophocj;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LopHoc {
    private static final String name_class="^[CAP][0-9]{4}[GHIK]$";
    public boolean kt(String name)
    {
        Pattern pattern = Pattern.compile(name_class);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
