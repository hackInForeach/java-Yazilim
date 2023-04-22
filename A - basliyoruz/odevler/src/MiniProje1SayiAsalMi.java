public class MiniProje1SayiAsalMi {
    public static void main(String[] args){

        int num1=11;
        if (num1>1){
            boolean asal=true;
            for (int i=2;i<num1;i+=1){
                if (num1%i==0){
                    asal=false;
                    break;
                }
            }if (asal){
                System.out.printf("%d sayısı asal.",num1);
            }else {
                System.out.printf("%d sayısı asal değil.",num1);
            }
        }else {
            System.out.println("1 den büyük bir sayı gir.");
        }

    }
}
