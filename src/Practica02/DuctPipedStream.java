package Practica02;
import java.io.*;

public class DuctPipedStream {
	
	public void rw() {
		try (PipedInputStream in = new PipedInputStream();
			 PipedOutputStream out = new PipedOutputStream()) {
			
			in.connect(out);
			out.write("message".getBytes("UTF8"));
			out.flush();
			
			byte[] res = new byte[in.available()];
			in.read(res);
			
			System.out.println(new String(res, "UTF8"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void rw1() {
		
		StringBuilder sb = new StringBuilder();
		
		try (PipedOutputStream out = new PipedOutputStream();
			 PipedInputStream in = new PipedInputStream(out)) {
			
			out.write("hello".getBytes("UTF8"));
			out.flush();
			
			int data; 
			while (in.available() > 0) {
				data = in.read();
				sb.append((char) data);
			}
			
			System.out.println(new String(sb));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void rwOdj() {
		try (PipedOutputStream out = new PipedOutputStream();
			 PipedInputStream in = new PipedInputStream(out);
			 ObjectOutputStream outputStream = new ObjectOutputStream(out);
			 ObjectInputStream inputStream = new ObjectInputStream(in)) {
			
			outputStream.writeObject("Java vision");
			outputStream.flush();
			
			String result = (String) inputStream.readObject();
			System.out.println(result);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args ) {
		DuctPipedStream ductPiped = new DuctPipedStream();
		ductPiped.rwOdj();
	}
	
}
