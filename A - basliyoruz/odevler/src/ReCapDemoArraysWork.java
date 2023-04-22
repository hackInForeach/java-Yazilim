public class ReCapDemoArraysWork {
    public static void main(String[] args) {

        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double enBuyukSayi = myList[0];

        for (int i = 0; i < myList.length; i++) {
            System.out.printf(" %.1f ", myList[i]);
            total += myList[i];
            if (enBuyukSayi > myList[i]) {
                enBuyukSayi = myList[i];
            }

        }
        System.out.printf("En büyük sayı : %.1f", enBuyukSayi);
        System.out.print("(Finished : ForLoop)");
        System.out.printf(" Total : %.1f", total);


        total = 0;
        System.out.println("\n");
        for (double list : myList) {
            System.out.printf(" %.1f ", list);
            total += list;
            if (enBuyukSayi > list) {
                enBuyukSayi = list;
            }
        }
        System.out.printf("En büyük sayı : %.1f", enBuyukSayi);
        System.out.print("(Finished : ForEachLoop)");
        System.out.printf(" Total : %.1f", total);

    }

}
