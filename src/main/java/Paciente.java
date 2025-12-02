public class Paciente{
		String nombre;
		int edad;
		String genero;
		String hora;
		String medico;
		Diagnostico diagnostico;

		//metodo constructor
		Paciente(String nom, int edad, String gene){
				nombre=nom;
				this.edad=edad;
				genero=gene;
			
		}
		public void entrada(String tiempo){
			System.out.println(tiempo);
			System.out.println("La persona "+nombre+" ingreso al hospital a las " +tiempo);
		}
		public void asignarmedico(String medico){
		this.medico=medico;
		System.out.println("Se asigno "+ medico + " al "+ nombre);
		}

		public void asignardiagnostico(Diagnostico d) {
        		this.diagnostico = d;
   	 }

   		public String detallepaciente() {
        	String datos = "Paciente: " + nombre +
                       ", edad " + edad +
                       ", genero " + genero;
       			 if (diagnostico != null) {
            			datos += "\n" + diagnostico.detallediagnostico();
        }
        		return datos;
   }

}