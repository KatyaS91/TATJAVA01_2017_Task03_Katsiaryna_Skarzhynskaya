package service;

import beans.DiskNews;
import beans.News;
import dao.BookNewsDAO;
import dao.DAOException;
import dao.DAOFactory;
import dao.DiskNewsDAO;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class DiskNewsServiceImpl implements DiskNewsService {
    public void addDiskNews(News news) throws ServiceException{
        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            DiskNewsDAO diskNewsDAO = daoObjectFactory.getDiskNewsDAO();
            diskNewsDAO.putDiskNews(news);

        } catch (DAOException e){
            System.out.println(e.getMessage());
        }

    }
    public DiskNews selectAllDiskNews(DiskNews news) throws ServiceException{
        return null;
    }
}
