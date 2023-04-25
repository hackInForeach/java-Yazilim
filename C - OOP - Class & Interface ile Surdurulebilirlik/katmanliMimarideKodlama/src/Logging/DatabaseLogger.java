package Logging;

public class DatabaseLogger implements BaseLogger{
    public void add(String data) {
        System.out.println("Veri tabanına loglandı : " + data);
    }
}
