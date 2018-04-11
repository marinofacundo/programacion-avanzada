import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectores {
  public void leer (){

	  try (BufferedReader br = new BufferedReader(new FileReader("D:\\Nuevo\\archivo.txt"))){
//al declarar el buffered reader dentro del try se implementa la interfaz closeable 
//la cual se encarga de cerrar el objeto al terminar la ejecucion del tryCatch
	      br.readLine();

} catch (IOException e) {
	e.printStackTrace();
//	log4j  framework que realiza el log automaticamente una vez seteado y sin usar el manejo de archivos
 }
  }
}
