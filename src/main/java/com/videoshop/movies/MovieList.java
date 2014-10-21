package com.videoshop.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: natalianavarro
 * Date: 10/16/14
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieList{

    List<Movie> collection;

    public MovieList(){
        this.collection = new ArrayList<Movie>();
    }

    public int size(){
        return this.collection.size();
    }

    public void add(Movie movie){
        this.collection.add(movie);
    }
}