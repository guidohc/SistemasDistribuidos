package Practica01;

public class Hospital implements Datos_Generales {
	public String Nombre;
	public String Fax;
	public String direccion;
	public String telefono;
	
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getFax() {
		return Fax;
	}


	public void setFax(String fax) {
		Fax = fax;
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


	@Override
	public void NuevoHospital(String nombre, String Direccion, String Telefono, String fax) {
		Nombre = nombre;
		direccion=Direccion;
		telefono=Telefono;
		Fax = fax;
	}




	@Override
	public void NuevoPaciente(String idPaciente, String DNI, String nombreApellido, String Direccion, String Telefono) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void NuevoPersonal(String DNI, String Direcion, String Telefono, String Cargo) {
		// TODO Auto-generated method stub
		
	}










}

