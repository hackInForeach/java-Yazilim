public class Main {
    public static void main(String[] args) {
    //UNUTMA SEN İNSANLARIN HAYATINI PROGRAMLIYORSUN DEĞİŞİME DİRENMEYEN PRORAM YAZABİLMELİSİN!!

        // Bir kişinin sadece bir Base i olur.!

        KrediUI krediUI=new KrediUI();

        krediUI.KrediHesapla(new AskerKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());






    }
}