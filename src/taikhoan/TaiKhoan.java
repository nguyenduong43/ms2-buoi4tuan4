package taikhoan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaiKhoan {
    public TaiKhoan() {}
    private static final String tendangnhap="^[_a-z0-9]{6,}$";
    public boolean kt(String tk)
    {
        Pattern pattern = Pattern.compile(tendangnhap);
        Matcher matcher = pattern.matcher(tk);
        return matcher.matches();
    }
}
