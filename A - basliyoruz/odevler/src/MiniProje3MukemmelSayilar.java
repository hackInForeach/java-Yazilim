public class MiniProje3MukemmelSayilar {
    public static void main(String[] args) {
        int total = 1;
        int j = 1;
        while (true) {
            for (int i = 2; i < j; i += 1) {
                if (j % i == 0) {
                    total += i;
                }
            }
            if (total == j) {
                System.out.printf("\nMükemmel sayı: %d = %d", j, total);
            }
            total = 1;
            j += 1;
        }
    }
}
