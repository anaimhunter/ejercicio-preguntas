import java.util.Scanner;
public class Cuestionario
 {
    Pregunta pregunta;
    /**
     * Constructor de la clase Cuestionario
     * @param PreguntaIn Parametro que representa la pregunta a realizar
     */ 
    public Cuestionario(Pregunta PreguntaIn)
    {
       pregunta= PreguntaIn;
    }
    
    /**
     * Realiza la pregunta e indica si es correcta o incorrecta
     * @param pregunta Parametro que representa la pregunta a realizar
     */
    public void aplicarPregunta(Pregunta pregunta)
    {
        pregunta.imprimete();
        System.out.print("Respuesta:");
        Scanner entrada = new Scanner(System.in);//permite leer el teclado
        String respuesta = entrada.nextLine();
        if(pregunta.checarRespuesta(respuesta))
        {
            System.out.println("Respuesta correcta");
        }
        else
        {
            System.out.println("Respuesta incorrecta");
        }
    }
 }