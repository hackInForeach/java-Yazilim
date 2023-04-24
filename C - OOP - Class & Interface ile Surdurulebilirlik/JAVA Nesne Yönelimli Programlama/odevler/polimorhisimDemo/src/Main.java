public class Main {
    public static void main(String[] args) {

//        BaseLogger[] baseLoggers=new BaseLogger[]{
//                new DataBaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()
//        };
//        for (BaseLogger baseLogger :baseLoggers) {baseLogger.log("Log mesajı.");}



        CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
        customerManager.add();


    }
}