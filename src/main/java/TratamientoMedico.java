public class TratamientoMedico{
			String profesionalsalud;
			int horasdieta;
			String reposo;
			Medicamentos medicamento;

		TratamientoMedico(String profesionalsalud, int horasdieta, String reposo){
					this.profesionalsalud=profesionalsalud;
					this.horasdieta= horasdieta;
					this.reposo=reposo;
		}

		public void asignarMedicamentos(Medicamentos medicamento) {
        			this.medicamento = medicamento;
    		}

		public String detalleTratamiento() {
        			String texto = "Profesional: " + profesionalsalud +
                       					", reposo: " + reposo +
                      					 ", horas de dieta: " + horasdieta;

        		int hora = 1;
				while (hora <= horasdieta) {	
   						 if (hora == horasdieta) {
     						        texto += "\n - Hora " + hora + ": última hora de dieta.";
    								} else {
        								texto += "\n - Hora " + hora + ": mantener la dieta una hora más.";
    								}

    										hora++;
			    	}
					 if (medicamento != null) {
            				texto += "\n" + medicamento.detallemedicamento();
        				}
				return texto;
			}
}