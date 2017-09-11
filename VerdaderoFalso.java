
/**
 * La clase VerdaderoFalso reprsenta el tipo de pregunta en la que 
 * la respuesta es Verdadera o Falsa
 */
public class VerdaderoFalso extends Pregunta
{
   public VerdaderoFalso()
   {
       
   }
   
   /**
    * Imprime la pregunta y las opciones de verdadero o falso
    */@Override
   public void imprimete()
   {
       System.out.println(texto);
       System.out.println("Verdadero");
       System.out.println("Falso");
   }
}
