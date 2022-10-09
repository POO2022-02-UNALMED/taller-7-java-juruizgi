package comunicacion;

public class Periodico extends Escrito {

    private String fecha;
    private String primicia;
    private String interpretacion;
    
    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
        
    }
    
    
    
    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    
    public String getInterpretacion(){
        return interpretacion;
    }
    
    @Override
    String interpretacion(){
       return interpretacion; 
    }
    
    @Override
    int palabrasTotales(int palabrasPaginas){
        return getPaginas()*palabrasPaginas*10;
    }
    
    @Override
    public String toString(){
        return getOrigen()+"\n"+
                getTitulo()+"\n"+
                getAutor()+"\n"+
                getPaginas()+"\n"+
                fecha+"\n"+
                primicia; 
    }
    
}
