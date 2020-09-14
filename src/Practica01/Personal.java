package Practica01;

public class Personal implements Datos_Generales {
	String dni;
	String direccion;
	String telefono;
	String cargo;

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDirrecion() {
		return direccion;
	}
	public void setDirrecion(String dirrecion) {
		this.direccion = dirrecion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public void NuevoHospital(String nombre, String Direccion, String Telefono, String fax) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void NuevoPaciente(String idPaciente, String DNI, String nombreApellido, String Direccion, String Telefono) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void NuevoPersonal(String DNI, String Direcion, String Telefono, String Cargo) {
		dni=DNI ;
		direccion=Direcion ;
		telefono = Telefono;
		cargo = Cargo;
	}
	
	
	

	
	
}