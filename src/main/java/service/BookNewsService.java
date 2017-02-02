package service;

import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface BookNewsService {

    void addBookNews(News news) throws ServiceException;

    News findAllBookNews(News news) throws ServiceException;
}
