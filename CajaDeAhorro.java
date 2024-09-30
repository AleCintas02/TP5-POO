/**
 * La clase CajaDeAhorro representa una cuenta de ahorros con funcionalidades para depositar y extraer dinero.
 * Mantiene información sobre el número de cuenta, saldo, extracciones posibles y el titular de la cuenta.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class CajaDeAhorro extends CuentaBancaria
{

    private int extraccionesPosibles;

    
    /**
     * Constructor para la clase CajaDeAhorro.
     * Inicializa el número de cuenta, el saldo a 0.0, las extracciones posibles a 10, y el titular.
     * 
     * @param p_nroCuenta Número de cuenta de la caja de ahorro.
     * @param p_titular Persona titular de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
        
    }
    
    /**
     * Constructor para la clase CajaDeAhorro con saldo inicial.
     * Inicializa el número de cuenta, el saldo, las extracciones posibles a 10, y el titular.
     * 
     * @param p_nroCuenta Número de cuenta de la caja de ahorro.
     * @param p_titular Persona titular de la cuenta.
     * @param p_saldo Saldo inicial de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);

    }



    
    /**
     * Establece el número de extracciones posibles.
     * 
     * @param p_extraccionesPosibles Número de extracciones posibles.
     */
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    
    /**
     * Obtiene el número de extracciones posibles.
     * 
     * @return Número de extracciones posibles.
     */
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    
    /**
     * Verifica si se puede extraer una cantidad dada de la cuenta.
     * 
     * @param p_importe Importe a extraer.
     * @return True si se puede extraer, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe){
        return p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0; 
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
            if(this.getExtraccionesPosibles() == 0){
                System.out.println("No tiene habilitadas más extracciones!");
                
            }else{
                if(p_importe > this.getSaldo()){
                     System.out.println("No puede extraer más que el saldo!");
                }
            }
        } 
    }
    
    /**
     * Realiza la extracción de una cantidad de la cuenta.
     * 
     * @param p_importe Importe a extraer.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * Muestra la información de la caja de ahorro, incluyendo el número de cuenta, saldo, titular y extracciones posibles.
     */
    public void mostrar(){
        System.out.println("- Caja de Ahorro –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}
