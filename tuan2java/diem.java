package GitHub.PTHTTH_NHOM1_HANG.tuan2java;

import java.util.Scanner;

public class diem {
    float x;
    float y;
    void toado(float hoanhdo, float tungdo){
        this.x =hoanhdo;
        this.y=tungdo;
    }
    void nhaptoado(){
        float hoanhdo, tungdo;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap toa do (x,y): ");
        hoanhdo = s.nextFloat();
        tungdo = s.nextFloat();
        toado(hoanhdo,tungdo);
        s.close();

    }
    void intoado() {
        System.out.println(" Toa do (x,y):("+x+","+y+")");

    }
    void khoangcach(){
        double kc;
        kc=Math.sqrt((x*x)+(y*y));
        System.out.println("Khoang cach tu diem --> goc toa do: "+kc);
    }
    public static void main(String[] arStrings){
        diem A = new diem();
        A.nhaptoado();
        A.intoado();
        A.khoangcach();
    }

}
