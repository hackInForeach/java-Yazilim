public class MiniProje4ArkadasSayilar {
    public static void main(String[] args) {
        int number = 220;
        int number1 = 284;
        int total = 0;
        int total1 = 0;
        for (int i = 1; i < number; i += 1) {
            if (number % i == 0) {
                total += i;
            }
        }
        for (int i = 1; i < number1; i += 1) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        if (total == number1 && total1 == number) {
            System.out.printf("%d ile %d arkadaş sayılardır", number, number1);
        } else {
            System.out.printf("%d ile %d arkadaş sayı değildir", number, number1);
        }
    }
}
