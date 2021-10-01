package GitHub.PTHTTH_NHOM1_HANG.tuan2java;
import java.util.Scanner;
class bai2
{
    public static void main(String args[])
    {
        int temp;
        boolean notIsPrime=false;
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                notIsPrime=true;
                break;
            }
        }
        if(!notIsPrime)
            System.out.println(num + " Là số nguyên tố!");
        else
            System.out.println(num + " Không phải là số nguyên tố!");
    }
}

