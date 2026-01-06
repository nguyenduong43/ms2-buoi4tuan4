package sdt;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoDienThoai {
    private static final String sodienthoai="^\\([0-9]{2}\\)-\\([0]{1}[0-9]{9}\\)$";
    public boolean kt(String sdt)
    {
        Pattern pattern = Pattern.compile(sodienthoai);
        Matcher matcher = pattern.matcher(sdt);
        return matcher.matches();
    }
}
