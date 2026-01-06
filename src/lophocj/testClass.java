package lophocj;

public class testClass {
    private static LopHoc lophoc;
    public static String[] classTrue=new String[]{"C1234G","P4567H"};
    public static String[] classFalse=new String[]{"a1423","A123","A1234A"};

    public static void main(String[] args) {
        lophoc=new LopHoc();
        for(String name:classTrue){
            System.out.println("name class "+name+":"+lophoc.kt(name));
        }
        for(String name:classFalse){
            System.out.println("name class "+name+":"+lophoc.kt(name));
        }
    }
}
