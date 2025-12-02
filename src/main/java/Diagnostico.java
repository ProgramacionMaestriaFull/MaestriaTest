	public class Diagnostico{
		String sintoma;
		String descripcion;
		String enfermedad;
		int duracion;
		ExamenesMedicos examenes;

		//metodo constructor
		Diagnostico(String sintoma, String descripcion, String enfermedad, int duracion){
				this.sintoma=sintoma;
				this.descripcion=descripcion;
				this.enfermedad=enfermedad;
				if (duracion <= 3) {
           			 this.duracion = 4;   // si es 3 o menos, lo subo a 4
        		} else {
            				this.duracion = duracion;
        			}
   		 }


		
		public void asignarExamenes(ExamenesMedicos e){
    					this.examenes = e;
		}


		public String detallediagnostico() {
        		String texto = "Enfermedad: " + enfermedad +
                       				", sintomas: " + sintoma +
                      				 ", descrpcion: " + descripcion;

      			  if (examenes != null) {
            			texto += "\n" + examenes.detalleExamenes();
        		}

       			 return texto;
   	 }

		public int duracionenfermedad(){
		return duracion;

		}
}