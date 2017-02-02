package controller;

import beans.News;
import service.DiskNewsService;
import service.ServiceException;
import service.ServiceFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 2/2/2017.
 */
public class FindDiskNews implements Command {
    String response = null;

    public String execute(News news) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        DiskNewsService diskNewsService = serviceFactory.getDiskNewsService();
        try {
            News x = diskNewsService.selectAllDiskNews(news);
            response = x.toString();
        } catch (ServiceException e) {
            response = "Невозможно найти новости о дисках";
        }
        return response;
    }
}
