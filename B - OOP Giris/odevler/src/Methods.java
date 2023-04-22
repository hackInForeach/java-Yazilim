public class Methods {
    public static void main(String[] args) {

        sayiBulmaca();

    }

    public static void sayiBulmaca(){
        byte[] numbers = {1, 2, 5, 7, 9, 0};
        int search = 1;
        boolean varMi = false;
        for (byte number:numbers) {
            if (search == number) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            messageGive("Aradığını sayısı dizide mevcut."+search);
        } else {
            messageGive("Aradığını sayısı dizide mevcut değil."+search);
        }
    }

    public static void messageGive(String message){

        System.out.printf(message);

    }
}
