public class MiniProje5SayiBulma {
    public static void main(String[] args) {

        byte[] numbers = {1, 2, 5, 7, 9, 0};
        int search = 1;
        boolean varMi = false;
        for (int i = 0; i < numbers.length; i += 1) {
            if (search == numbers[i]) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.printf("Aradığını \"%d\" sayısı dizide mevcut.", search);
        } else {
            System.out.printf("Aradığını \"%d\" sayısı dizide yok.", search);
        }
    }
}
