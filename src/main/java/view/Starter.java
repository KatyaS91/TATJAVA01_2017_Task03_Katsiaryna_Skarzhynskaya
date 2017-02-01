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
        movieNews.setName("В кинотеатре домонстрируюь фильм Хатико на языке оргигнала");
        movieNews.setDescription("Some text about it");
        System.out.println(controller.executeTask("ADD_MOVIE_NEWS", movieNews));
    }

}
