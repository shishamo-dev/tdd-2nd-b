import junit.framework.TestCase;

import java.io.*;
import org.junit.Test;
import java.util.Map;

public class Kadai2_2Test extends TestCase {
    Kadai2_2 kadai;

    public void setUp() {
        kadai = new Kadai2_2();
    }

    public void testCalc_area() {

        assertEquals(314, kadai.calc_area(10));
        assertEquals(196350, kadai.calc_area(250));
        assertEquals(31416, kadai.calc_area(100));
        assertEquals(7, kadai.calc_area(1.5));

    }

//    public void testInput() {
//        try {
//            kadai.fileInput();
//            fail();
//        } catch (FileNotFoundException e) {
//        } catch (IOException e) {
//
//        }
//    }

    public void testInput() throws FileNotFoundException, IOException {
        //ByteArrayInputStream in = new ByteArrayInputStream("10\n250\n100\n1.5".getBytes());
    	StringBuffer sb = new StringBuffer();
    	sb.append("10").append(System.lineSeparator())
    	.append("250").append(System.lineSeparator())
    	.append("100").append(System.lineSeparator())
    	.append("1.5").append(System.lineSeparator());

        ByteArrayInputStream stream = new ByteArrayInputStream(sb.toString().getBytes());


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
//        kadai.printResult();
        kadai.fileInput(stream, out);

        assertEquals("314" + System.lineSeparator() + "196350"
                + System.lineSeparator() + "31416" + System.lineSeparator()
                + "7" + System.lineSeparator(), out.toString());





        //String s = kadai.fileInput();

    }

    public void testOutput()throws IOException {

    }

}