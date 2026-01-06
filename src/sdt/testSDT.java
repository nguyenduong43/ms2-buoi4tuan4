package sdt;

import lophocj.LopHoc;

public class testSDT {
    private static SoDienThoai sodienthoai;
    public static  String[] sdtTrue=new String[]{"(84)-(0978489648)"};
    public static  String[] sdtFalse=new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        sodienthoai=new SoDienThoai();
        for(String sdt:sdtTrue){
            System.out.println("sdt "+sdt+":"+sodienthoai.kt(sdt));
        }
        for(String sdt:sdtFalse){
            System.out.println("sdt "+sdt+":"+sodienthoai.kt(sdt));
        }
    }
}
