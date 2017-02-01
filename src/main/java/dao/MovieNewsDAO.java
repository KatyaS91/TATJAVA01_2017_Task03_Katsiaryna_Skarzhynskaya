package dao;

import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface MovieNewsDAO {

    void putMovieNews(News news) throws DAOException;
    MovieNewsDAO selectAllMovieNews(News news) throws DAOException;
}
