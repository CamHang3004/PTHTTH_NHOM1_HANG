package GitHub.PTHTTH_NHOM1_HANG.tuan4java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPECHOSERVER {
    public final static int serverPort=7;
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Server da duoc tao");
            while(true){
                try{
                    Socket s= ss.accept();
                    OutputStream os =s.getOutputStream();
                    InputStream is=s.getInputStream();
                    int ch = 0;
                    while(true){
                        ch=is.read();
                        if(ch== -1)    break;
                        System.out.println((char)ch);
                        os.write(ch);
                    }
                    s.close();
                }catch(IOException ie1){
                    System.out.println("Connection Error: "+ie1);
                }ss.close();
        }
    }catch(IOException ie){
        System.out.println("Server Creation Error: "+ie);
    }
}
}

