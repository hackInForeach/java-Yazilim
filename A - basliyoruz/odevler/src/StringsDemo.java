public class StringsDemo {
    public static void main(String[] args){

        String message = "Bugün hava çok güzel.";

        //metnin eleman sayısını bulmak için:
        System.out.printf("Eleman sayısı : %s",message.length());

        System.out.println("\n");

        // n inci elemanı bulmak için:
        System.out.printf("5. eleman : %c",message.charAt(4));

        System.out.println("\n");

        //iki metni birleştirmek için:
        System.out.println(message.concat(" Yaşasın!"));
        //daha sonra kullanılacaksa bir değişkene aktarılmalı

        System.out.println("\n");

        // örn: "b" ile başlıyorm:
        System.out.println(message.startsWith("B"));

        System.out.println("\n");

        // örn: "." ile bitiyormu:
        System.out.println(message.endsWith("."));

        System.out.println("\n");

        char[] charakter= new char[5];
        //belirlenne aralıktaki karakterleri al ve isteniler yerden başlayarak ata:
        message.getChars(0,5,charakter,0);

        System.out.println(charakter);

        System.out.println("\n");

        //bu eleman veya metin kaçıncı sırada:(ilk gördüğü yerde durur)
        System.out.println(message.indexOf('a'));

        System.out.println("\n");

        // aramaya en sondan başlamak için:
        System.out.println(message.lastIndexOf("a"));

        System.out.println("\n");

        //değerleri değiştirmek için: kullanabilmek için değişkene ata
        System.out.println(message.replace(" ","_"));

        System.out.println("\n");

        // bi metnin içerisinde parça alamak için:
        System.out.println(message.substring(4,10));

        System.out.println("\n");

        //kelimeleri istenilen koşıla göre ayırmak için:
        for (String kelime:message.split(" ")){
            System.out.println(kelime);
        }

        System.out.println("\n");

        //metni küçük harfe çevirme:
        System.out.println(message.toLowerCase());

        System.out.println("\n");

        //metni büyük harfe çevitme:
        System.out.println(message.toUpperCase());

        System.out.println("\n");

        //başta ve sondaki gereksiz boşlukları temizlemek için:
        String message1 = "   Bugün hava çok güzel.       ";
        System.out.println(message1.trim());
    }
}
