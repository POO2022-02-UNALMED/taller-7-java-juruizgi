package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;
    
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    public int cantidadLetras(){
        return letras.length;
    }
    
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    @Override
    public String toString(){
        String letra = "";
        for (String l: this.letras){
            letra+= l+", ";
        }
        return letra;
    }
    
    public void setLetras(String[] letras){
        this.letras = letras;
    }
    
    public String[] getLetras(){
        return letras;
    }
    
    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    
}
