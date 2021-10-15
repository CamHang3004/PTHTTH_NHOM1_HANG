package GitHub.PTHTTH_NHOM1_HANG.tuan4java;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSERVERSS {
    public static void main(String[] args) {
        ServerSocket ss;
        try {
            ss = new ServerSocket(6789);
            System.out.println("SERVER song song DA~ DUOC TAO");
            while (true) {
                Socket s = ss.accept();

                XULYLUONG p = new XULYLUONG(s);
                p.start();

                // ss.close();

            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }
}
