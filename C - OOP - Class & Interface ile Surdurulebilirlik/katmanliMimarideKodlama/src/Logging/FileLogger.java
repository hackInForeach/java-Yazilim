package Logging;

public class FileLogger implements Logger{
    public void log(String data){
        System.out.println("Dosyaya gönderildi: "+data);
    }
}
