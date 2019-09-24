package conspect.network.simpleserver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class HttpUtils {

    public static boolean isRequestEnd(byte[] request, int length){
        if(length < 4){
            return false;
        }
        return request[length - 4] == '\r' &&
                request[length - 3] == '\n' &&
                request[length - 2] == '\r' &&
                request[length - 1] == '\n';
    }


    public static byte[] readRequestFully(InputStream inputStream) throws IOException {
        byte[] buff = new byte[8192];
        int headerLen = 0;
        while (true){
            int count = inputStream.read(buff, headerLen, buff.length - headerLen);
            if(count < 0){
                throw new RuntimeException("Incoming connection is closed");
            } else {
                headerLen += count;
            }

            if(isRequestEnd(buff, headerLen)) return Arrays.copyOfRange(buff, 0 , headerLen);
            if(headerLen == buff.length) throw new RuntimeException("Too large HTTP header");


        }





    }


}
