public class CustomerManager {
    //1.yol
    private ICustomerDal iCustomerDal;
    //2.yol
    public CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal=iCustomerDal;
    }
    public void add(){
        //iş kodları brda yazılır
        iCustomerDal.add();
    }
}
