package com.epam.FourthModuleTasks.FourthModuleFourthTask;

import java.io.*;

public class FourthModuleFourthTask {
    public static void main(String[] args) {

//        Creating object of FilmCollection
//
//        Actor firstActor = new Actor("Robert Downey Jr.");
//        Actor secondActor = new Actor("Chris Evans");
//        FilmCollection collection = new FilmCollection();
//        collection.addFilm("Iron Man", firstActor);
//        collection.addFilm("Captain America: Civil War",secondActor);

//        Serialize object of FilmCollection
//
//        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"))) {
//            oos.writeObject(collection);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Deserialize object FilmCollection
//
        FilmCollection deserializedFilmCollection = new FilmCollection();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file"))) {
            try {
                deserializedFilmCollection = (FilmCollection) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(deserializedFilmCollection);


    }

}
