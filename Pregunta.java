/**
 * La clase Pregunta representa un objeto con texto y respuesta.
 * @author Ana M.Hunter
 * @version 9/11/17
 */
public class Pregunta
{
    protected String texto;
    private String respuesta;
    
    /**
     * Constructor de la clase Pregunta
     */
    public Pregunta()
    {
        texto ="";
        respuesta= "";
    }
    
    /**
     * Asigna la pregunta
     * @param Pregunta Parametro que representa la pregunta a realizar
     */
    public void asignarTexto(String Pregunta)
    {
        texto = Pregunta;
    }
   
    /**
     * Asigna las respuesta correcta
     */
    public void asignarRespuesta(String Respuesta)
    {
        respuesta =Respuesta;
    }
    
    /**
     * Checa si la respuesta que se introduce es la correcta
     * @param Repuesta Parametro que representa la respuesta a checar
     * @return Regresa true si las respuestas son iguales si no regresa false.
     */
    public boolean checarRespuesta(String Respuesta)
    {
        if(respuesta == Respuesta)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Imprime la pregunta
     */
    public void imprimete()
    {
        System.out.println(texto);
    }
}
