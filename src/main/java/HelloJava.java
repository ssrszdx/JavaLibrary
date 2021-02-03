class HelloJava  {

    public static void main(String args[]) throws Exception {
        //-----------------------------part 1  ---------------
        System.out.println("hello java");
        HFile s= new HFile();
        s.getFileList();
        //----------------------------part 2 ------------------
        UserDao dao= new UserDao();
        UserDaoProxy proxy= new UserDaoProxy(dao);
        proxy.save();
        //---------------------------part 3 --------------------
        HUser user= new HUser();
        user.getSex();
    }


}
