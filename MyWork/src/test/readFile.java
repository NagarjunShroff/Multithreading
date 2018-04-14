package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.tika.detect.AutoDetectReader;
import org.apache.tika.exception.TikaException;

public class readFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, TikaException {
		// TODO Auto-generated method stub
		File file =new File("E:\\dhcp1.txt");
		//Path path = Paths.get("E:\\dhcp1.txt");
		InputStream Input = new FileInputStream(file);
		AutoDetectReader detector = new AutoDetectReader(Input);
		String Charset = detector.getCharset().toString();
			Input.close();
	System.out.println(Charset);
		/*File file =new File("E:\\dhcp1.txt");
		FileInputStream fi = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fi);
		String s = isr.getEncoding();
		System.out.println("encoding:file "+s);
		fi.close();
		isr.close();*/
	}

}
