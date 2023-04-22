public class ArraysDemo {
    public static void main(String[] args) {

        String[] students = {
                "Doğukan", "Engin", "Salih", "Ahmet"
        };

        for (int i = 0; i < students.length; i++) {
            System.out.printf(" %s ", students[i]);
        }
        System.out.print("(Finished : ForLoop)");
        System.out.println("\n");
        for (String student : students) {
            System.out.printf(" %s ", student);
        }
        System.out.print("(Finished : ForEachLoop)");

    }
}
