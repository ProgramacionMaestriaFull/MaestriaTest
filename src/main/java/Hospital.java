public class Hospital{
	public static void main(String args []){
			//TODO LO DE PACIENTE
	
			for (int i = 1; i <= 3; i++) {
            	
			Paciente paciente =PacienteFactory.crearPacienteUrgencias(
					"paciente "+i,
					20 + i,
					"femenino",
					"15:0"+i,
					"medico " +i
				);	

			//ACA LO DE DIAGNOSTICO
			int Ingresosdias= 3+i;
		 	Diagnostico diag = new Diagnostico(
                    							"dolor cabeza " + i,
                   							"reposo y líquidos",
                    							"gripe leve " + i,
		    							Ingresosdias + i);
           		EstrategiaTratamiento estrategia;
        			    if (diag.duracionenfermedad() <= 5) {
               			      estrategia = new TratamientoLeve();
          	 	 } else {
              			    estrategia = new TratamientoGrave();
            		}

            		PlanificadorTratamiento planificador =
                    		new PlanificadorTratamiento(estrategia);

            		TratamientoMedico tratamientop =
                   		 planificador.generarTratamiento(diag);
			  
			ExamenesMedicos examen = new ExamenesMedicos(true, true, true, false);
			
			examen.asignartratamiento(tratamientop);
		  	paciente.asignardiagnostico(diag);
			diag.asignarExamenes(examen);
 			String detalles = paciente.detallepaciente();
            		System.out.println(detalles);	
            		System.out.println("------------------");	
        	}
	}	
}