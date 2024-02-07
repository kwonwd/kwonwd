package test05_object_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class StudentListReaderTest {
	public static void main(String[] args) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.dat"))){
			Object obj =ois.readObject();
			
			List<Student> list = (List<Student>) obj;
			System.out.println(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
