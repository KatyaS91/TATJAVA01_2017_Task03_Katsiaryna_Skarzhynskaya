package controller;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public enum CommandName {

    ADD_BOOK_NEWS("Add book news"),
    ADD_DISK_NEWS("Add disk news"),
    ADD_MOVIE_NEWS("Add movie news"),
    FIND_BOOK_NEWS("Find book news"),
    FIND_DISK_NEWS("Find disk news"),
    FIND_MOVIE_NEWS("Find movie news"),
    WRONG_REQUEST("");

    private String name;

    CommandName(String name){
        this.name = name;
    }

}
