package com.epam.FourthModuleTasks.FourthModuleFourthTask;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class FilmCollection implements Serializable {
    private Map<String,Actor> filmCollection;

    public FilmCollection() {
        filmCollection = new HashMap();
    }

    public void addFilm(String filmName, Actor mainActor){
        if (!(filmCollection.containsKey(filmName))) {
            filmCollection.put(filmName,mainActor);
        }
        else {
            System.out.println("This film already in this collection!");
        }
    }

    public void removeFilm(String filmName) {
        if (filmCollection.containsKey(filmName)){
            filmCollection.remove(filmName);
        }
        else {
            System.out.println("There is no such film in this collection!");
        }
    }

    public void changeMainActor(String filmName, Actor newMainActor){
        if (filmCollection.containsKey(filmName)){
            filmCollection.put(filmName,newMainActor);
        }
        else {
            System.out.println("There is no such film in this collection!");
        }
    }

    @Override
    public String toString() {
        if (filmCollection.isEmpty()) {
            return "This collection is empty!";
        }
        else {
            StringBuilder films = new StringBuilder();
            for(Map.Entry<String, Actor> film : filmCollection.entrySet())
            {
                films.append("Film: \'" + film.getKey() + "\'; Main actor: " + film.getValue().getFullName() + ";\n");
            }
            return films.toString();
        }
    }
}
