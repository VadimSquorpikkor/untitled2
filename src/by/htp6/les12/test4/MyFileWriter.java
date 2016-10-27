package by.htp6.les12.test4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("src/by/htp6/les12/resources/t2.txt");
	
		writer.write("my text\n");
		writer.write("my text2\n");
		writer.write("my text3\n");
		
		writer.close();
		
	}

}
