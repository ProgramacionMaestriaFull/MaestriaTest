public class TratamientoGrave implements EstrategiaTratamiento {

    public TratamientoMedico crearTratamiento(Diagnostico diagnostico) {
                TratamientoMedico t = new TratamientoMedico(
                "Especialista",
                0,                      
                "Hospitalización y observación"
        );

        Medicamentos m = new Medicamentos(
                true,
                20,
                "Antibiótico de amplio espectro"
        );
        t.asignarMedicamentos(m);
        return t;
    }
}
