public class Medicamentos{
		boolean requieremedicamentos;
		int cantidadmedicamentos;
		String medicamento;

		Medicamentos(boolean requieremedicamentos, int cantidadmedicamentos, String medicamento){     		
					this.requieremedicamentos = requieremedicamentos;
        				this.cantidadmedicamentos = cantidadmedicamentos;
        				this.medicamento = medicamento;
		}
			
		public String detallemedicamento() {
        			if (!requieremedicamentos || cantidadmedicamentos <= 0 || medicamento == null || medicamento.isEmpty()) {
           				 return "El paciente no requiere medicamentos.";
        } else {
            		return "Medicamento: " + medicamento +
                   		", cantidad: " + cantidadmedicamentos + " tabletas.";
       		 }
    	}
}