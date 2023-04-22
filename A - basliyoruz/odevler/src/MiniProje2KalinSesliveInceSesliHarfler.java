public class MiniProje2KalinSesliveInceSesliHarfler {
    public static void main(String[] args) {

        char chr = 'a';

        switch (chr) {
            case 'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U':
                System.out.printf("Girile harf: \"%c\" ince sesli", chr);
                break;
            case 'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü':
                System.out.printf("Girile harf: \"%c\" kalın sesli", chr);
                break;
            default:
                System.out.printf("Girilen harf : \"%c\" sessiz bir harf.",chr);
        }

    }
}
