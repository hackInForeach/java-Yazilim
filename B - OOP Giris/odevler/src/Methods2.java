public class Methods2 {
    public static void main(String[] argumans) {
        //void: gider bir iş yapar örn: git tahtayı sil
        //return etmesi için: bir sonuç döndürmeli
        //string olan bir değere void, void olanı dadeğişkene atayamazsın

        String message= "Bu gün hava çok güzel.";

        //parametresiz method ama bir değer return ediyor
        String newMessage=ctiyGive();
        System.out.println(newMessage);

        //parametreli method
        int number=plus(4,5);
        System.out.println(number);

        int number1=pluses(2,3,4,1,2,3,4,1);
        System.out.println(number1);


    }

    public static void add(){

    }
    public static void delete(){

    }
    public static void update(){

    }
    public static int plus(int number1,int number2){

        return number1+number2;
    }
    //Variable Arguments
    public static int pluses(int... numbers){ // birde fazla işlem için int...
        int plus=0;
        for (int number:numbers){
            plus+=number;
        }
        return plus;
    }

    public static String ctiyGive(){

        return "İstanbul";
    }

}
