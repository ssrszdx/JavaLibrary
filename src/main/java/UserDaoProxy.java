public class UserDaoProxy implements IUserDao{

    private  IUserDao userdao;

    public UserDaoProxy(UserDao userdao)
    {
        this.userdao = userdao;
    }

    @Override
    public void save() {
        System.out.println("hello UserDaoProxy class ,save sucess");
        userdao.save();
    }
}
