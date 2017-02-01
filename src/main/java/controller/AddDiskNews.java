package controller;

import beans.News;
import service.BookNewsService;
import service.DiskNewsService;
import service.ServiceException;
import service.ServiceFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class AddDiskNews implements Command {
    String response = null;
    public String execute(News news){
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        DiskNewsService diskNewsService = serviceFactory.getDiskNewsService();
        try {
            diskNewsService.addDiskNews(news);
            response = "Диск успешно добавлен";
        } catch (ServiceException e){
            response = "Ошибка при добавлении диска";
        }
        return response;
    }

}
