package controller;

import beans.News;
import service.MovieNewsService;
import service.ServiceException;
import service.ServiceFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 2/2/2017.
 */
public class FindMovieNews implements Command {
    String response = null;

    public String execute(News news) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MovieNewsService movieNewsService = serviceFactory.getMovieNewsService();
        try {
            News x = movieNewsService.selectAllMovieNews(news);
            response = x.toString();
        } catch (ServiceException e) {
            response = "Невозможно найти новости о фильмах";
        }
        return response;
    }
}
