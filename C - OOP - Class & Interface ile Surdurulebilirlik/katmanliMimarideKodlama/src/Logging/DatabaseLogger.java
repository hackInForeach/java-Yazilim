package Logging;

public class DatabaseLogger implements Logger{
    public void log(String data){
        System.out.println("Veri tabanına gönderildi: "+data);
    }
}
