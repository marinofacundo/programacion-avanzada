import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
//		File fdir = new File ("D:\\","Nuevo");
//		fdir.mkdir();
//		File f = new File("D:\\Nuevo\\archivo.txt");
//		// file pueden ser un directorio o un archivo.
////		f.isFile();
////		f.isDirectory();
////		f.exists();
////		f.mkdir();
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		f.list();
////		f.listFiles();
//		try {
////			FileWriter fw = new FileWriter(f,true);
////			BufferedWriter bw = new BufferedWriter(fw);
////			bw.write("Hola putos");
////			bw.flush();
////			bw.close(); //cerrarlo para que se pueda modificar el archivo por afuera
//			FileReader fr = new FileReader(f);
//			BufferedReader br = new BufferedReader(fr);
//			String s = null; //br.readLine();
////			System.out.println(s);
//			
//			while ((s =br.readLine()) != null) {
////				s = br.readLine();
//				System.out.println(s);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		File origen = new File("C:\\Users\\Public\\Pictures\\Sample Pictures","Desierto.JPEG");
//	    File destino = new File("C:\\Users\\alumno\\Desktop","prueba.JPEG");
//	    
//	    try {
//	    FileInputStream fis = new FileInputStream(origen);
//	    BufferedInputStream bis = new BufferedInputStream(fis);
//	    
//	    FileOutputStream fos = new FileOutputStream(destino);
//	    BufferedOutputStream bos = new BufferedOutputStream(fos);
//	    
//	    int size = 1024;
//	    byte[] buff = new byte[size];
//	    
//	    int len;
//	    
//	    while ((len = bis.read(buff, 0, size)) > -1) {
//			bos.write(buff, 0, len);			
//		}
//	    bis.close();
//	    bos.flush();
//	    bos.close();
//	    } catch (IOException e) {
//			e.printStackTrace();
//		}
		
		Lectores l = new Lectores();
		l.leer();
	}
}
