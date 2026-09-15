public class Asiento{
    private String codigo;
    private boolean ocupado;
    
    // constructor

    public Asiento(String codigo){
        this.codigo = codigo;
        this.ocupado = false;
    }

    //Getters

    public String getCodigo(){
        return codigo;
    }
     
    public boolean isOcupado(){
        return  ocupado;
    }

    //Metodos

    public  void ocupar(){
        if (ocupado){
            System.out.println("El asiento " + codigo + " ya está ocupado.");
        }else{
            ocupado = true;
            System.out.println("Asiento " + codigo + " ocupado.");
        }
    }

    public void liberar(){
        if (!ocupado){
            System.out.println("El asiento " + codigo + " ya está libre.");
        }else{
            ocupado = false;
            System.out.println("Asiento " + codigo + " liberado.");
        }
    }

    public  void mostrarEstado(){
        System.out.println("Asiento " + codigo + ":" + (ocupado ? "ocupado" : "libre"));
    }
}