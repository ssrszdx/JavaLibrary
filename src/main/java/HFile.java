import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HFile {
    private final String no="00001";
    public  void getCountOfNum()
    {
        Scanner canner = new Scanner(System.in);
        int x=canner.nextInt();
    }
    public boolean  getOrderList(String contactid , String date)
    {
        boolean flag= true;
        if (contactid== null)
            System.out.println("this contact is un");
        return flag;
    }

    public void getFileList() throws  Exception{
        try{
            String basePath=String.format("C:/Users/01/Downloads");
            String[] list=new File(basePath).list();
            System.out.println(Arrays.toString(list));


        }
         catch (Exception e)
        {
            System.out.println(e.getStackTrace());
            throw new IOException(e);
        }
    }
}
