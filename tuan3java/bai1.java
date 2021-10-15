package GitHub.PTHTTH_NHOM1_HANG.tuan3java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;
import java.util.FileWriter;
import javax.swing.JOptionPane;

 class FileWrite extends Thread{

    private static final int xsize = 1024;
    private int x;
    private String name;
    public void FileWriter(String ten) {
        this.name = ten;
    }
    public void nhap(){
        try{
            FileWriter fra = new FileWriter(name);
            BufferedWriter bw= new BufferedWriter(fra);
            Random rd = new Random();
            for (int i=0;i<=xsize;i++)
                {
                    x=rd.nextInt(xsize);
                    if(i==9)
                    bw.write(String.valueOf(x));
                    else
                    bw.write(String.valueOf(x)+",");
                }
                fra.close();
                bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Thong bao loi",
            JOptionPane.INFORMATION_MESSAGE);
        }
        }
    
public class bai1{
    public static void main(String[] args){
        FileWrite f1 = new FileWrite();
        f1.start();
        FileWrite f2 = new FileWrite();
        f2.start();
        FileWrite f3 = new FileWrite();
        f3.start();
    }
}
}