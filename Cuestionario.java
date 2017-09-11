import java.util.Scanner;
 public class Cuestionario
 {
     Pregunta pregunta;
     
     public Cuestionario(Pregunta PreguntaIn)
     {
        pregunta= PreguntaIn;
     }
     
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