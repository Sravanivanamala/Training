package file_io;
import java.io.*;
public class BinaryReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\002HK3744\\eclipse-workspace\\file_io\\src\\hello.txt";
		FileInputStream is = null;
		try {
			is = new FileInputStream(path);
			byte[] content = new byte[is.available()];
			is.read(content);
			System.out.println(new String(content));
			
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				is.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
