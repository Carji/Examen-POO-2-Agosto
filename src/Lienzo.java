import java.util.ArrayList;
import java.util.List;

public class Lienzo extends Figura implements ILienzo{
     
    public List<Figura> lista = new ArrayList<Figura>();

    public List<Figura> getFiguras(){
        return this.lista;
    }

    public void addFigura(Figura forma, Rectangulo rectangulo){

        forma.setRectangulo(rectangulo);
        this.lista.add(forma);
        forma.draw();
    }

    public Figura getSeleccion(Point punto){

        for(Figura forma : lista){

            if(punto.getY() >= forma.getRectangulo().getTop() 
            && punto.getX() <= forma.getRectangulo().getRight() 
            && punto.getX() >= forma.getRectangulo().getLeft() 
            && punto.getY() <= forma.getRectangulo().getBottom()){

                return forma;
            }
        }
        return null;
    }
}


