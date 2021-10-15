package GitHub.PTHTTH_NHOM1_HANG.tuan3java;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

 
 public class FileTReader extends Thread {
     String name;
     public void FileRead(String ten){this.name = ten;}
     public  void load() {
         try{
             FileReader fvao= new FileReader(name);
             BufferedReader br=new BufferedReader(fvao);
             int c;
             while ((c=br.read()) != -1){System.out.println(this.name+" "+c);}
             br.close();
             fvao.close();
         }catch (IOException ex){
             JOptionPane.showMessageDialog(null, ex.toString(), "Thông báo lỗi", JOptionPane.INFORMATION_MESSAGE);
         }
     }
 }
 public class bai2 {
 public static void main(String[] args) {
    FileRead f1 = new FileRead("D:/doc.txt");
    f1.start();
    FileRead f2 = new FileRead("D:/doc2.txt");
    f2.start();
    FileRead f3 = new FileRead("D:/doc3.txt");
    f3.start();
    

 }}