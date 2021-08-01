/**
 * Interfaz
 */
public interface CreaFigura{

  public static Figura creador(String figura){

     if ( figura.equals("RAYO") )
       return new Rayo();

     else if ( figura.equals("CORAZON") )
       return new Corazon();

     else if ( figura.equals("ESTRELLA") )
       return new Estrella();

    return null;
  }
}