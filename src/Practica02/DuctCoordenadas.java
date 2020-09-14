package Practica02;
import java.io.*;
import javax.swing.JOptionPane;

public class DuctCoordenadas {

	int X,Y,Z;
	
	public void Traslation() {
		try {
			File outputFile = new File("Coordinate");
			FileWriter tx = new FileWriter(outputFile);
			int c;
			int Tx=Integer.parseInt(JOptionPane.showInputDialog("Distance X "+"Coordinate Current: "+ this.X ));
			int Ty=Integer.parseInt(JOptionPane.showInputDialog("Distance Y "+"Coordinate Current: "+ this.Y ));
			int Tz=Integer.parseInt(JOptionPane.showInputDialog("Distance Z "+"Coordinada Current: "+ this.Z ));
			String cad="New coordinate X: "+(this.X+Tx)+"\n";
			String cad1="New coordinate Y: "+(this.Y+Ty)+"\n";
			String cad2="New coordinate Z: "+(this.Z+Tz)+"\n";
			StringReader X= new StringReader(cad);
			StringReader Y= new StringReader(cad1);
			StringReader Z= new StringReader(cad2);
			
			while ((c = X.read()) != -1) {
				tx.write(c);
			}
				X.close();
			while ((c = Y.read()) != -1) {
				tx.write(c);
			}
				Y.close();
			while ((c = Z.read()) != -1) {
				tx.write(c);
			}
			Z.close();
			tx.close();
		} catch (FileNotFoundException e) {
				System.err.println("FileStreamsTest: " + e);
		} catch (IOException e) {
				System.err.println("FileStreamsTest: " + e);
		}
	}
	
	public void Rotation() { 
		try {
			File outputFile = new File("Coordinate");
			FileWriter tx = new FileWriter(outputFile);
			
			int c;
			int opt=Integer.parseInt(JOptionPane.showInputDialog("1. Rotate by X \n" + "2. Rotate by Y \n" + "3. Rotate by Z"));  
	 
			switch(opt) {
				case 1:
					int Tx=Integer.parseInt(JOptionPane.showInputDialog("Angle X "));
		
					String x1="New coordinate X: "+(this.X)+"\n";
					String x2="New coordinate Y: "+(this.Y*Math.cos(Tx)-this.Z*Math.sin(Tx))+"\n";
					String x3="New coordinate Z: "+(this.Y*Math.sin(Tx)+this.Z*Math.cos(Tx))+"\n";
					StringReader X= new StringReader(x1);
					StringReader Y= new StringReader(x2);
					StringReader Z= new StringReader(x3);

				while ((c = X.read()) != -1) {
					tx.write(c);
				}
				X.close();
				while ((c = Y.read()) != -1) {
					tx.write(c);
				}
				Y.close();
				while ((c = Z.read()) != -1) {
					tx.write(c);
				}
				Z.close();
				tx.close();
				break;
	 
	 
				case 2:
					int Ty=Integer.parseInt(JOptionPane.showInputDialog("Angle Y "));
	
					String y1="New coordinate X: "+(this.Z*Math.sin(Ty) + this.X*Math.cos(Ty))+"\n";
					String y2="New coordinate Y: "+(this.Y)+"\n";
					String y3="New coordinate Z: "+(this.Z*Math.cos(Ty) - this.X*Math.sin(Ty))+"\n";
					StringReader XY= new StringReader(y1);
					StringReader YY= new StringReader(y2);
					StringReader ZY= new StringReader(y3);

					while ((c = XY.read()) != -1) {
						tx.write(c);
					}
					XY.close();
					while ((c = YY.read()) != -1) {
						tx.write(c);
					}
					YY.close();
					while ((c = ZY.read()) != -1) {
						tx.write(c);
					}
					ZY.close();
					tx.close();
					break;
				
				case 3:
					int Tz=Integer.parseInt(JOptionPane.showInputDialog("Angle Z "));
	 
					String m1="Nueva coordenada de X: "+(this.X*Math.cos(Tz) - this.Y*Math.sin(Tz))+"\n";
					String m2="Nueva coordenada de Y: "+(this.X*Math.sin(Tz) + this.Y*Math.cos(Tz))+"\n";
					String m3="Nueva coordenada de Z: "+(this.Z)+"\n";
					StringReader XZ= new StringReader(m1);
					StringReader YZ= new StringReader(m2);
					StringReader ZZ= new StringReader(m3);

					while ((c = XZ.read()) != -1) {
						tx.write(c);
					}	
					XZ.close();
					while ((c = YZ.read()) != -1) {
						tx.write(c);
					}
					YZ.close();
					while ((c = ZZ.read()) != -1) {
						tx.write(c);
					}
					ZZ.close();
					tx.close();
					break;
				}
			} catch (FileNotFoundException e) {
				System.err.println("FileStreamsTest: " + e);
			} catch (IOException e) {
				System.err.println("FileStreamsTest: " + e);
		}
     
    }
	
	public void Escalation() {
		 try {
			File outputFile = new File("Coordinate");
			FileWriter tx = new FileWriter(outputFile);
			int c;
			int Tx=Integer.parseInt(JOptionPane.showInputDialog("Scale X "+"Current Coordinate: "+ this.X ));
			int Ty=Integer.parseInt(JOptionPane.showInputDialog("Scale Y "+"Current Coordinate: "+ this.Y ));
			int Tz=Integer.parseInt(JOptionPane.showInputDialog("Scale Z "+"Current Coordinate: "+ this.Z ));
			String m1="New Coordinate X: "+(this.X*Tx)+"\n";
			String m2="New Coordinate Y: "+(this.Y*Ty)+"\n";
			String m3="New Coordinate Z: "+(this.Z*Tz)+"\n";
			StringReader X= new StringReader(m1);
			StringReader Y= new StringReader(m2);
			StringReader Z= new StringReader(m3);

			while ((c = X.read()) != -1) {
				tx.write(c);
			}
			X.close();
			while ((c = Y.read()) != -1) {
				tx.write(c);
			}
			Y.close();
			while ((c = Z.read()) != -1) {
				tx.write(c);
			}
			Z.close();
			tx.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("FileStreamsTest: " + e);
			} catch (IOException e) {
			System.err.println("FileStreamsTest: " + e);
			}
    	  	 
    }
	
}
