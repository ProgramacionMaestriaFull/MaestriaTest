public class TratamientoLeve implements EstrategiaTratamiento {

    public TratamientoMedico crearTratamiento(Diagnostico diagnostico) {
               TratamientoMedico t = new TratamientoMedico(
                "Médico general",
                8,                     
                "Reposo en casa"
       		 );

        Medicamentos m = new Medicamentos(
                true,
                10,
                "Analgésico suave"
        );
        t.asignarMedicamentos(m);
        return t;
    }
}
