public class PacienteFactory{
	
	public static Paciente crearPacienteUrgencias(
		String nombre,
		int edad,
		String genero,
		String horaEntrada,
		String nombreMedico){

		Paciente paciente=new  Paciente(nombre, edad, genero);
		paciente.entrada(horaEntrada);
		paciente.asignarmedico(nombreMedico);
		return paciente;
	}
}