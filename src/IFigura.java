/**
 * Interfaz
 */
public interface IFigura {

    public void setColorBorde(String colorBorde);
    public void setColorRelleno(String colorRelleno);
    public void setRectangulo(Rectangulo rectangulo);
    public String getColorRelleno();
    public String getColorBorde();
    public Rectangulo getRectangulo();

    public void draw();
}