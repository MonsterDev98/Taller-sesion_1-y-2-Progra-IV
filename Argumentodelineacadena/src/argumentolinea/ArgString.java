package argumentolinea;

public class ArgString {
    private String oracion;
    private int tamañocad;
    private String[] orainv= new String[this.tamañocad];
            
    public ArgString(String oracion, int tamañocad){
        this.oracion = oracion;
        this.tamañocad = tamañocad;
                         
    }
    public void Covertircad(){
        
        orainv = this.oracion.split(" ");
    }
    public void mostrar(){
        
        Covertircad();
        for(int i = 0; i <= tamañocad; i++){
            System.out.println(orainv[i]);
        }
        
    }
    
}
