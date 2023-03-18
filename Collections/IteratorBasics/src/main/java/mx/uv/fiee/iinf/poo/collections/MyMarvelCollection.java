package mx.uv.fiee.iinf.poo.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyMarvelCollection implements Iterable<Film> {
    private Film[] films;
    private int numFilms;

    public MyMarvelCollection(Film[] films) {
        this.films = films;
        this.numFilms = 0;
    }

    public void add(Film film) {
        if (numFilms == films.length) {
            System.out.println("La colección está llena");
        }

        films[numFilms] = film;
        numFilms++;
    }

    @Override
    public Iterator<Film> iterator() {
        return new FilmIterator(this.films, this.numFilms);
    }

    private static class FilmIterator implements Iterator<Film> {

        private Film[] films;
        private int index;
        private int numFilms;

        public FilmIterator(Film[] films, int numFilms) {
            this.films = films;
            this.index = 0;
            this.numFilms = numFilms;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.numFilms;
        }

        @Override
        public Film next() {
            if (!hasNext()) {
                    throw new NoSuchElementException();
            }
            return this.films[this.index++];
        }
    }
}

