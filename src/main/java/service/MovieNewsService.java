package service;

import beans.MovieNews;
import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface MovieNewsService {
    void addMovieNews(News news) throws ServiceException;
    MovieNews selectAllMovieNews(News news) throws ServiceException;
}
