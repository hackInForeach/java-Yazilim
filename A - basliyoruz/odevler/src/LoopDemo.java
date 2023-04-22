public class LoopDemo {
    public static void main(String[] args) {

        //For
        for (int i = 2; i < 10; i += 2) {
            System.out.printf(" %d ",i);
        }
        System.out.println("Finished : ForLoop");

        //While
        int i=2;
        while (i<10){
            System.out.printf(" %d ",i);
            i+=2;
        }
        System.out.println("Finished : WhileLoop");

        //Do-While
        int j=2;
        do {
            System.out.printf(" %d ",j);
            j+=2;
        }while (j<10);
        System.out.println("Finished : Do-WhileLoop");


    }
}
