package file_io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub	
			Person p = new Person("polo", 21);
			p.toString();			
			String path = "C:\\Users\\002HK3744\\eclipse-workspace\\file_io\\src\\hello.txt";
			ObjectOutputStream ostream = null;
			ObjectInputStream istream= null;
			
			ostream = new ObjectOutputStream(new FileOutputStream(path));
			ostream.writeObject(p);
			ostream.close();
			System.out.println("object serialized...");
			
			istream = new ObjectInputStream(new FileInputStream(path));
			Object obj = istream.readObject();
			System.out.println(obj);
			istream.close();
	}

}
