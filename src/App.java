public class App {

    public static void main(String[] args) throws Exception {

        Lienzo lienzo = new Lienzo();

        //Creo tres figuras y las añado al lienzo

        Figura figura1 = CreaFigura.creador("CORAZON");
        figura1.setColorRelleno("Rojo");
        figura1.setColorBorde("Negro");

        lienzo.addFigura(figura1, new Rectangulo(new Point(0, 100) , new Point(20, 120)));

        Figura figura2 = CreaFigura.creador("ESTRELLA");
        figura2.setColorRelleno("Rojo");
        figura2.setColorBorde("Negro");

        lienzo.addFigura(figura2, new Rectangulo(new Point(150, 250) , new Point(180, 280)));
        
        Figura figura3 = CreaFigura.creador("RAYO");
        figura3.setColorRelleno("Amarillo");
        figura3.setColorBorde("Negro");

        lienzo.addFigura(figura3, new Rectangulo(new Point(280, 330) , new Point(300, 310)));


        /*Supongamos que me he equivocado en los parámetros de una (el fondo de estrella, por ejemplo). 
        La selecciono y le cambio el color de borde.*/

        Point click = new Point(160, 260);
        Figura escogida = lienzo.getSeleccion(click);

        if(escogida != null){
            System.out.println("Se ha seleccionado una figura " + escogida.getClass().getName() + " con atributos: \n" + 
            "Color de borde: " + escogida.getColorBorde() + ".\n" + 
            "Color de relleno: " + escogida.getColorRelleno() + ".\n" + 
            "Tamaño: " + escogida.getRectangulo().getWidth() + "x" + escogida.getRectangulo().getHeight()+ ".\n");
        }
        
        if(escogida != null){
            escogida.setColorBorde("Amarillo");
            escogida.setColorRelleno("Blanco");
            escogida.draw();
        }
    }   

}