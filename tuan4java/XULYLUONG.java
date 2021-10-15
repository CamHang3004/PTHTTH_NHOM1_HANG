package GitHub.PTHTTH_NHOM1_HANG.tuan4java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class XULYLUONG extends Thread {
    Socket s;

    public XULYLUONG(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            while (true) {
                int ch = is.read();
                System.out.println((char) ch);
                if (ch == -1)
                    break;
                os.write(ch);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
