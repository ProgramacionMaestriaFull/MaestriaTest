public class ExamenesMedicos{
		boolean laboratorio;
		boolean imagenes;
		boolean electrocardiograma;
		boolean examenespecial;
		TratamientoMedico tratamiento;

		ExamenesMedicos(boolean laboratorio, boolean imagenes, boolean electro,boolean examenespecial ){
					this.laboratorio=laboratorio;
					this.imagenes=imagenes;
					electrocardiograma = electro;
					this.examenespecial=examenespecial;
			}
		
		 public void asignartratamiento(TratamientoMedico tratamiento){
      				  this.tratamiento = tratamiento;
    		}
		
		public String detalleExamenes(){
			String texto = "Exámenes requeridos: ";
				if (laboratorio)        texto += "laboratorio ";
        			if (imagenes)           texto += "imágenes ";
        			if (electrocardiograma) texto += "ECG ";
        			if (examenespecial)     texto += "examen especial ";

        				if (!laboratorio && !imagenes && !electrocardiograma && !examenespecial) {
        					texto += "ninguno";
    					 }
				       		 if (tratamiento != null) {
           						 texto += "\nTratamiento a seguir: " + tratamiento.detalleTratamiento();
        					}
        			return texto;
			}
			
}