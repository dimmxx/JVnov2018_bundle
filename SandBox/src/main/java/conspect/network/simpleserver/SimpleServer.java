package conspect.network.simpleserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(88);

        while (true){
            Socket socket = serverSocket.accept();
            try(InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream()){

                byte[] request = HttpUtils.

            } catch (){

            }finally {
                socket.close();
            }


        }





    }






}
