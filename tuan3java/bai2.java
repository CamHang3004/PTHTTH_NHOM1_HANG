package GitHub.PTHTTH_NHOM1_HANG.tuan3java;

import java.io.File;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

 
  class fileReader extends Thread {
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
    FileReader f1 = new FileReader("D:/doc.txt");
    f1.start;
    FileReader f2 = new FileReader("D:/doc2.txt");
    f2.start;
    FileReader f3 = new FileReader("D:/doc3.txt");
    f3.start;
    

 }}