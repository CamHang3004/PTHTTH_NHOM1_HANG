package GitHub.PTHTTH_NHOM1_HANG.tuan2java;

import java.util.Scanner;

//Bài 4: Viết chương trình tính tổng của dãy số từ 1 đến n. (Với n được nhập từ bàn phím)
public class bai4 {
    public static void main(String[] args) {
        int n;
        System.out.println("NHAP n: ");
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        int tong=0;
        for (int i=1;i<=n;i++){
            tong += i;
            s.close();
        }
        System.out.println("TONG CAC GIA TRỊ TU 1 --> n là: "+tong);
    }
    
}
