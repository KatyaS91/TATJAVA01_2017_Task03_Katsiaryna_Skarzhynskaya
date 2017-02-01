package controller;

import beans.News;
import service.DiskNewsService;
import service.MovieNewsService;
import service.ServiceException;
import service.ServiceFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class AddMovieNews implements Command{
    String response = null;
    public String execute(News news){
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MovieNewsService movieNewsService = serviceFactory.getMovieNewsService();
        try {
            movieNewsService.addMovieNews(news);
            response = "Фильм успешно добавлен";
        } catch (ServiceException e){
            response = "Ошибка при добавлении фильма";
        }
        return response;
    }

}
