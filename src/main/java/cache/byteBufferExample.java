package cache;

import java.nio.ByteBuffer;

public class byteBufferExample {

    public static void main(String[] args) {


        ByteBuffer bbf =ByteBuffer.allocate(100);

        try
        {

            bbf.put((byte)10);

            System.out.println(bbf.array().toString());
        }catch( Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
