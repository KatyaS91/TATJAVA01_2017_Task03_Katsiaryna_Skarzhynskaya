package service;

import beans.DiskNews;
import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface DiskNewsService {

    void addDiskNews(News news) throws ServiceException;
    DiskNews selectAllDiskNews(DiskNews news) throws ServiceException;
}
