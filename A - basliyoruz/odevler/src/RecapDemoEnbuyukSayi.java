public class RecapDemoEnbuyukSayi {
    public static void main(String[] args){

        int num1 = 10,num2 = 20,num3 = 30;
        int enBuyuk = num1;

        if (num2>enBuyuk){
            enBuyuk=num2;
        } if (num3>enBuyuk) {
            enBuyuk=num3;
        }
        System.out.printf("En büyük sayı : %d",enBuyuk);

    }

}
