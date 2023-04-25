package Logging;

public class MailLogger implements BaseLogger {
    public void add(String data) {
        System.out.println("Mail'e gönderildi : " + data);
    }
}
