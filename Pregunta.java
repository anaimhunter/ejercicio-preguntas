public class Pregunta
{
    protected String texto;
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
    
    public boolean checarRespuesta(String Respuesta)
    {
        if(respuesta == Respuesta)
        {
            return true;
        }
        return false;
    }
    
    public void imprimete()
    {
        System.out.println(texto);
    }
}
