public abstract class Figura implements IFigura{

    protected String colorBorde;// = "Negro";
    protected String colorRelleno;// = "Blanco";
    protected Rectangulo rectangulo;
 
    public String getColorBorde(){
        return colorBorde;
    }
 

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
        System.out.println("Se ha cambiado el color del borde.");
    }

    public String getColorRelleno(){
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
        System.out.println("Se ha cambiado el color del relleno.");
    }

    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
        System.out.println("Se ha cambiado el rectángulo.");
    }

    public void draw(){
    }
    
    // public String toString()
    //     {
    //         return("El relleno es de color " +
    //                this.getColorRelleno()+", y el borde es "+ this.getColorBorde()+".");
    //     }

}



