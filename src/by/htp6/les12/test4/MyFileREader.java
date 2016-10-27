package by.htp6.les12.test4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileREader {

	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			reader = new FileReader("src/by/htp6/les12/resources/t2.txt");
			
			
			char[] mas = new char[15];
			reader.read(mas);
			String str = new String(mas);
			System.out.println(str);
			System.out.println("---------------------");
			
			System.out.println(reader.read(mas));
			str = new String(mas);
			System.out.println(str);
			System.out.println("---------------------");
		    
			int x = reader.read(mas);
			str = new String(mas, 0, x);
			System.out.println(str);
			System.out.println("---------------------");
		/*	char ch;
			ch = (char) reader.read();
			while((int)ch != -1){
				System.out.print(ch);
				ch = (char) reader.read();
			}*/
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}

	}
	
	
	public int myRead(FileReader r, char[] mas) throws IOException{
		
		r.read();
		
		return 0;
	}
	
	
	public String myRead2(String file) throws IOException{
		
		
		
		return "";
	}

}
