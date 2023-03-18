package mx.uv.fiee.iinf.poo.collections;

/**
 * Clase que modela la información que será almacenada en el objeto
 * que representará nuestra colección
 */
public class Film {
    private String title;
    private int year;

    public Film (String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear () { return this.year; }
    public String getTitle () { return this.title; }

    @Override
    public String toString () {
        return "Titulo: '" + title + "'" +", Año: " + year +".";
    }
}
