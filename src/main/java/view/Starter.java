package view;

import beans.BookNews;
import beans.DiskNews;
import beans.MovieNews;
import beans.News;
import controller.Controller;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class Starter {
    public static void main(String[] args){

        News bookNews = new BookNews();
        bookNews.setTitle("Айвенго");
        bookNews.setName("Вышло новое издание книги");
        bookNews.setDescription("Some text about it");

        Controller controller = new Controller();
        System.out.println(controller.executeTask("ADD_BOOK_NEWS", bookNews));

        News diskNews = new DiskNews();
        diskNews.setTitle("Риголетто");
        diskNews.setName("Вышел сборник арий из оперы Верди");
        diskNews.setDescription("Some text about it");
        System.out.println(controller.executeTask("ADD_DISK_NEWS", diskNews));

        News movieNews = new MovieNews();
        movieNews.setTitle("Хатико");
        movieNews.setName("В кинотеатре домонстрирую фильм Хатико на языке оргигнала");
        movieNews.setDescription("Some text about it");
        System.out.println(controller.executeTask("ADD_MOVIE_NEWS", movieNews));

        News selectAllBooks = new BookNews();
        controller.executeTask("FIND_BOOK_NEWS", selectAllBooks);
        System.out.println("Все новости о книгах: " + selectAllBooks.getAllNews());

        News selectAllDisks = new DiskNews();
        controller.executeTask("FIND_DISK_NEWS", selectAllDisks);
        System.out.println("Все новости о дисках: " + selectAllDisks.getAllNews());

        News selectAllMovies = new MovieNews();
        controller.executeTask("FIND_MOVIE_NEWS", selectAllMovies);
        System.out.println("Все новости о дисках: " + selectAllMovies.getAllNews());

    }

}
