package edu.femxa.herencia;

public class Alumno extends Persona
{
	@Override
	public void mostrarPersona() {
		// TODO Auto-generated method stub
		super.mostrarPersona();
		//System.out.println("Ha llamado al metodo de Alumno");//Poliformismo: llamar al metodo mas exacto,(padre-hijo) primero al hijo si mas exacto
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str_dev = null;
		
		str_dev = (this.getNombre() + " " +this.getEdad() + " " + this.nota);
		
		return str_dev;
		//return super.toString();//va al toString del padre
	}
	
	private int nota;

	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean bar = false;
		Alumno alumno_object = null;
		alumno_object = (Alumno)obj;//conversion de un tipo Object a un tipo Alumno y lo definimos como alumno_object
		if (this.getNombre().equals(alumno_object.getNombre()) && (this.getEdad() == alumno_object.getEdad()) && (this.nota == alumno_object.nota))
		{
			bar = true;
		}
		
		return bar;
	}
	
}
