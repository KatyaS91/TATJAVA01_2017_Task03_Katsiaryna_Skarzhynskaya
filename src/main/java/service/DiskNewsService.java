package service;

import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface DiskNewsService {

    void addDiskNews(News news) throws ServiceException;

    News selectAllDiskNews(News news) throws ServiceException;
}
