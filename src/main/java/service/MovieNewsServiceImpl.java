package service;

import beans.MovieNews;
import beans.News;
import dao.BookNewsDAO;
import dao.DAOException;
import dao.DAOFactory;
import dao.MovieNewsDAO;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class MovieNewsServiceImpl implements MovieNewsService {
    public void addMovieNews(News news) throws ServiceException{
        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            MovieNewsDAO movieNewsDAO = daoObjectFactory.getMovieNewsDAO();
            movieNewsDAO.putMovieNews(news);

        } catch (DAOException e){
            System.out.println(e.getMessage());
        }

    }
    public MovieNews selectAllMovieNews(News news) throws ServiceException{
        return null;
    }
}
