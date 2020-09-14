package Practica02;
import java.io.*;

public class DuctOrd {
	
	public static void main(String[] args) throws IOException{
		 try {
			 FileReader Numeros = new FileReader("OrderNumber");
			 // do the reversing and sorting
			 Reader NumerosOrdenados = Ordenar(Numeros);
			 BufferedReader br = new BufferedReader(NumerosOrdenados);
			 String input;
			 PrintWriter stdout = new PrintWriter(System.out, true);
			 while ((input = br.readLine()) != null) {
				 stdout.println(input);
			 }
			 br.close();
			 
		 } catch (Exception e) {
			 System.err.println("RhymingWords: " + e);
		 }
	}

			 public static Reader Ordenar(Reader source) {
				 PipedWriter pw = null;
				 PipedReader pr = null;
				 try {
					 BufferedReader br = new BufferedReader(source);
					 pw = new PipedWriter();
					 pr = new PipedReader(pw);
					 PrintWriter output = new PrintWriter(pw);
					 
					 new DuctOrdThread(output, br).start();
				 } catch (Exception e) {
					 System.err.println("RhymingWords sort: " + e);
				 }
					 return pr;
			 }
	
}
