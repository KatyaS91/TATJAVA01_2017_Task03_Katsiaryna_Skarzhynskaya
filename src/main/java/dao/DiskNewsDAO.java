package dao;

import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface DiskNewsDAO {

    void putDiskNews(News news) throws DAOException;

    DiskNewsDAO selectAllDiskNews(News news) throws DAOException;
}
