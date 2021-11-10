package file_io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\002HK3744\\eclipse-workspace\\file_io\\src\\hello.txt";
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(path , true));
			writer.newLine();
			writer.write("There's not a thing that i would change");
			writer.newLine();
			writer.write("cause yor are amazing, just the way you are");
			
		System.out.println("Writing to file completed.");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(writer != null)
					writer.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
