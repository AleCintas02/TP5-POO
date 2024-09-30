/**
 * La clase CuentaCorriente representa una cuenta corriente con un límite de descubierto.
 * Permite realizar depósitos y extracciones, y mantiene información sobre el número de cuenta, saldo, límite de descubierto y el titular de la cuenta.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class CuentaCorriente extends CuentaBancaria
{

    private double limiteDescubierto;

    /**
     * Constructor para la clase CuentaCorriente.
     * Inicializa el número de cuenta, el saldo a 0.0, el límite de descubierto a 500.0, y el titular.
     * 
     * @param p_nroCuenta Número de cuenta de la cuenta corriente.
     * @param p_titular Persona titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500.0);
    }
    
    /**
     * Constructor para la clase CuentaCorriente con saldo inicial.
     * Inicializa el número de cuenta, el saldo, el límite de descubierto a 500.0, y el titular.
     * 
     * @param p_nroCuenta Número de cuenta de la cuenta corriente.
     * @param p_titular Persona titular de la cuenta.
     * @param p_saldo Saldo inicial de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500.0);
    }
    
    /**
     * Establece el límite de descubierto.
     * 
     * @param p_limiteDescubierto Límite de descubierto de la cuenta corriente.
     */
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    /**
     * Obtiene el límite de descubierto de la cuenta.
     * 
     * @return Límite de descubierto de la cuenta corriente.
     */
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Verifica si se puede extraer una cantidad dada de la cuenta, considerando el límite de descubierto.
     * 
     * @param p_importe Importe a extraer.
     * @return True si se puede extraer, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe){
        return p_importe <= (this.getSaldo() + this.getLimiteDescubierto()); 
    }
    
    /**
     * Extrae una cantidad de la cuenta si es posible.
     * 
     * @param p_importe Importe a extraer.
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extracción sobrepasa el límite de descubierto!");
        }
    }
    
    /**
     * Realiza la extracción de una cantidad de la cuenta.
     * 
     * @param p_importe Importe a extraer.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Muestra la información de la cuenta corriente, incluyendo el número de cuenta, saldo, límite de descubierto y titular.
     */
    public void mostrar(){
        System.out.println("- Cuenta Corriente –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}
