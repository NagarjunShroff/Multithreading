package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		if(f.exists()) {
			f.delete();
		}
		if (!f.exists()) {
			f.createNewFile();
		} 
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		for (int j = 0; j < 1000000; j++) {
			bw.write(MessageFormat.format("{0},11/27/14,05:12:59,57 leases expired and 0 leases deleted,,,,,0,6,,,,,,,,,0",
					new Object[] { String.valueOf(j) }));
			bw.newLine();
		}
 bw.close();
	}

}
