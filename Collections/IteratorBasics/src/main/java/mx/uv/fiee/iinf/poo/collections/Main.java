package mx.uv.fiee.iinf.poo.collections;

public class Main {

    public static void main(String [] args) {
        var filmVector = new Film [10];

        var myCol = new MyMarvelCollection (filmVector);
	myCol.add (new Film ("Ironman", 2008));
	myCol.add (new Film ("Captain America", 2010));
	myCol.add (new Film ("The Avengers", 2012));


        for (Film film: myCol) {
            System.out.println(film.toString());
        }
    }

}
