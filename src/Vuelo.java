public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asientos;

    // Constructores
    public Vuelo (){
    }

    public Vuelo ( String numero, String origen, String destino){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
    }
// Vuelo con capacida creada 
    public Vuelo ( String numero, String origen, String destino, int capacidadMaxima){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        // El vuelo crea sus asientos
        asientos = new Asiento[capacidadMaxima];
        for (int i = 0; i < capacidadMaxima; i++){
            asientos[i] = new Asiento("A" + (i+1));
        }
    }

    //getters

    public String getNumero(){
        return numero;
    }

    public String getOrigen(){
        return origen;
    }

    public String getDestino(){
        return destino;
    }

    // metodos

    public void mostrarInfo(){
        System.out.println("----- Vuelo" + numero + "----");
        System.out.println("Ruta: " + origen + "->" + destino);
        System.out.println("Capacidad: " + capacidadMaxima + " asientos.");
    }
    // Mostrar estado del asiento

    public void mostrarAsientos(){
         System.out.println("Estado de asientos - Vuelo " + numero + ":");
         for (Asiento a : asientos){
            a.mostrarEstado();
         }
    }
    //Buscar asiento por codigo

    public void embarcar (String codigoAsiento){
        for (Asiento a : asientos){
            if (a.getCodigo().equals(codigoAsiento)){
                if (a.isOcupado()){
                    System.out.println("El asiento " + codigoAsiento + " ya está ocupado.");
                } else {
                    a.ocupar();
                }
                return;
            }
        }
         System.out.println("Asiento " + codigoAsiento + " no encontrado en vuelo " + numero + ".");
    }

    public void desembarcar(String codigoAsiento){
        for (Asiento a: asientos){
            if (a.getCodigo().equals(codigoAsiento)){
                if (!a.isOcupado()){
                    System.out.println("El asiento " + codigoAsiento + " ya está libre.");
                } else {
                    a.liberar();
                }
                return;
            }
        }
        System.out.println("Asiento "+codigoAsiento + " no encontrado en vuelo " + numero + ".");
    }
}
