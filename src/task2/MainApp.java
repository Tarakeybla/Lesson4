package task2;

public class MainApp {
    public static void main(String[] args) {
        PhoneTable phoneTableClass = new PhoneTable();
        phoneTableClass.add("123","Петр");
        phoneTableClass.add("456","Петр");
        phoneTableClass.add("789","Григорий");
        phoneTableClass.add("222","Игнат");
        phoneTableClass.add("333","Ольга");
        phoneTableClass.add("444","Елена");
        phoneTableClass.add("555","Мария");
        phoneTableClass.add("999","Игорь");

        System.out.println(phoneTableClass.get("Петр"));
        System.out.println(phoneTableClass.get("999"));
    }
}
