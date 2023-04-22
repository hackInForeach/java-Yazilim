public class Conditionals {
    public static void main(String[] args) {

        int number = 20;

        if (number < 20) {
            System.out.printf("%d sayısı %d den küçük", number, 20);
        } else if (number > 20) {
            System.out.printf("%d sayısı %d den büyük", number, 20);
        } else {
            System.out.printf("%d sayısı %d sayısına eşit", number, 20);
        }
    }
}
