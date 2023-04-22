public class DortIslem {
    public int topla(int number1,int number2){
        return number1+number2;
    }
    //over loading:
    public int topla(int number1,int number2,int number3){
        return number1+number2+number3;
        //bi sıkıntı çıkmaz. Nedeni method imzalarının aynı olmasıdır." topla"
    }
}
