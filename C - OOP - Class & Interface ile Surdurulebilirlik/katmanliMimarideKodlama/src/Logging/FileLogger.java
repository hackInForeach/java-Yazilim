package Logging;

public class FileLogger implements BaseLogger {
    public void add(String data) {
        System.out.println("Dosyaya loglandı : " + data);
    }
}
