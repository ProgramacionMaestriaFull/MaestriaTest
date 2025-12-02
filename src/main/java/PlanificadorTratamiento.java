public class PlanificadorTratamiento {

    private EstrategiaTratamiento estrategia;

    public PlanificadorTratamiento(EstrategiaTratamiento estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaTratamiento estrategia) {
        this.estrategia = estrategia;
    }

    public TratamientoMedico generarTratamiento(Diagnostico diagnostico) {
        return estrategia.crearTratamiento(diagnostico);
    }
}
