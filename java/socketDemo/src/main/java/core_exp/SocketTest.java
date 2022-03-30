package core_exp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        //try的用法-可以不与catch绑定，可以抛出去
        //try 加一个小括号

        //打开我们这边的socket，就是和他通信
        try (Socket s = new Socket("time-a.nist.gov",13);){
            //所有的别人的响应信息都会放到socket的输入流
            //解析拿到别人给我们的信息
            s.setSoTimeout(2);
            Scanner in = new Scanner(s.getInputStream(),"utf-8");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
    }
}
