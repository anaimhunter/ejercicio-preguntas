public class Pregunta
{
    private String texto;
    private String respuesta;
    
    public Pregunta()
    {
        texto ="";
        respuesta= "";
    }
    
    public void asignarTexto(String Pregunta)
    {
        texto = Pregunta;
    }
    
    public void asignarRespuesta(String Respuesta)
    {
        respuesta =Respuesta;
    }
    
    public boolean checaRespuesta(String Respuesta)
    {
        return true;
    }
    public void imprimete()
    {
        //imprime texto 
    }
}
