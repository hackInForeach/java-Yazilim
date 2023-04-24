public class Main {
    public static void main(String[] args) {


        BaseCrediManager[] baseCrediManager=new BaseCrediManager[]{
                new TarimCrediManager(),new TeacherCrediManager(),new HighSchoolCrediManager()
        };
        for (BaseCrediManager baseCrediManager1:baseCrediManager) {
            System.out.println(baseCrediManager1.hesapla(1000));
        }


    }
}