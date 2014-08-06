package co.edu.unbosque.test;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.io.IOUtils;
import org.testng.annotations.Test;

/**
 * @author Alejandro Leon
 */
public class IOUtilsOutOfMemoryErrorTest {
 
    @Test(expectedExceptions = {OutOfMemoryError.class})
    public void generandoOutOfMemoryError() throws IOException{
        InputStream in=new InputStream() {
            @Override
            public int read() throws IOException {
                return 1;
            }
        };
        byte x[]=IOUtils.toByteArray(in);
    }
}
