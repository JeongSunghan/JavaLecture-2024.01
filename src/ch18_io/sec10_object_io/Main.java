package ch18_io.sec10_object_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		String filename = "C:/Workspace/Java/lesson/src/ch18_io/sec10_object_io/product.ser";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
		Product p1 = new Product("노트북", 1500000);
		Product p2 = new Product("모니터", 200000);
		Product p3 = new Product("마우스", 100000);
		List<Product> list = new ArrayList<Product>();
		list.add(p1); list.add(p2); list.add(p3); 
//		oos.writeObject(p1); oos.writeObject(p2); oos.writeObject(p3);
		oos.writeObject(list);
		oos.flush(); oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
//		Product p = (Product) ois.readObject(); System.out.println(p);
//		p = (Product) ois.readObject(); System.out.println(p);
//		p = (Product) ois.readObject(); System.out.println(p);
		List<Product> inList = (List<Product>) ois.readObject();
		inList.forEach(x -> System.out.println(x));
		ois.close();
	}

}
