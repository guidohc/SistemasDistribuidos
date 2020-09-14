package Practica01;

public class Paciente implements Datos_Generales{
	String IdPaciente;
	String dni;
	String NombreApellido;
	String direccion;
	String telefono;



	public String getIdPaciente() {
		return IdPaciente;
	}



	public void setIdPaciente(String idPaciente) {
		IdPaciente = idPaciente;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombreApellido() {
		return NombreApellido;
	}



	public void setNombreApellido(String nombreApellido) {
		NombreApellido = nombreApellido;
	}



	public String getDirreccion() {
		return direccion;
	}



	public void setDirreccion(String dirreccion) {
		this.direccion = dirreccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}





	@Override
	public void NuevoHospital(String nombre, String Direccion, String Telefono, String fax) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void NuevoPaciente(String idPaciente, String DNI, String nombreApellido, String Direccion, String Telefono) {
		IdPaciente = idPaciente;
		dni=DNI;
		NombreApellido = nombreApellido;
		direccion = Direccion;
		telefono = Telefono;
	}



	@Override
	public void NuevoPersonal(String DNI, String Direcion, String Telefono, String Cargo) {
		// TODO Auto-generated method stub
		
	}




	
	
}

