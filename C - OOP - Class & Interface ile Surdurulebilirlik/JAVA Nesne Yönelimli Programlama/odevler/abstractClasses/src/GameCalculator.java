public abstract class GameCalculator {//abstrac sınıflar newlenemez!!
    public abstract void hesapla();//bu clası kim exten ediyorsa bu metodu kullanmak
    //zoruda ve kedi metodunu yazmak zorunda
    /*
    abstrac sınıflar: tanımlı olduğu sınıfı extend edenlerin abstract metodunu kendinegöre kullanması zounludur

    aynı şekilde final tanımlı metodlar ise olduğu gibi kullanılması zoruludur.
    bu tip kurallar ezilemez.
     */


    public final void gameOver(){//final ezilemeyen ve değişmeyecek kural
        System.out.println("Oyun bitti.");
    }
}
