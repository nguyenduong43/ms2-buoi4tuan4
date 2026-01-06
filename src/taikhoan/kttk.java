package taikhoan;

public class kttk {
    private static TaiKhoan taikhoan;
    public static String[] tkTrue=new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] tkFalse = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        taikhoan = new TaiKhoan();
        for(String tk:tkTrue){
            System.out.println("taikhoan "+tk+":"+taikhoan.kt(tk));
        }
        for(String tk:tkFalse){
            System.out.println("taikhoan "+tk+":"+taikhoan.kt(tk));
        }
    }
}
