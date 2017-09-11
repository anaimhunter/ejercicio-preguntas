import java.util.ArrayList;

/**
 * La clase OpcionMultiple repsenta el tipo de pregunta de opcion multiple.
 */
public class OpcionMultiple extends Pregunta
{
    private ArrayList<String> respuestas;
    private int numeroRespuestas;
    /**
     * El constructor de la clase OpcionMultiple
     * @param numRespuestas Parametro que representa el numero de opciones
     */
   public OpcionMultiple(int numRespuestas)
   {
      respuestas = new ArrayList<String>();
      numeroRespuestas = numRespuestas;
   }
    
   /**
    * Agrega las opciones de las respuestas a la lista
    * @param opcion Parametro que representa la opcion de respuesta
    * @return Regresa verdadero si se pudo agregar si no falso.
    */
   public boolean agregaOpcion(String opcion)
   {
      if(numeroRespuestas == respuestas.size())
      { 
          return false;
      }
      respuestas.add(opcion);
      return true;
   }
    
    /**
    * Imprime la pregunta y las opciones de respuestas
    */@Override
   public void imprimete()
   {
       System.out.println(texto);
       for (int i=0; i<respuestas.size();i++)
       {
         System.out.println(respuestas.get(i));  
       }
   }
    
}