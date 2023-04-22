public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc=dortIslem.topla(3,3);
        int sonuc1=dortIslem.cikar(3,3);
        int sonuc2=dortIslem.carp(3,3);
        int sonuc3=dortIslem.bol(3,3);

        System.out.printf(
                        "\nToplam: %d" +
                        "\nFark  : %d" +
                        "\nÇarpım: %d" +
                        "\nBölüm : %d",sonuc,sonuc1,sonuc2,sonuc3
        );




    }
}