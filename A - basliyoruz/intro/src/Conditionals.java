public class Conditionals {
    public static void main(String[] args){
        int vade = 12;

        double dolarDun = 18.152;
        double dolarBugun = 18.151;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu="down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu="up.svg";
            System.out.println(okYonu);
        } else {
            okYonu="equal.svg";
            System.out.println(okYonu);
        }
    }
}
