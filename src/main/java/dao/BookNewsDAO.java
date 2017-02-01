package dao;

import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface BookNewsDAO {

    void putBookNews(News news) throws DAOException;
    News selectAllBookNews(News news) throws DAOException;
}
