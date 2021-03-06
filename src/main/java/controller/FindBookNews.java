package controller;

import beans.News;
import service.BookNewsService;
import service.ServiceException;
import service.ServiceFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class FindBookNews implements Command {

    String response = null;

    public String execute(News news) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BookNewsService bookNewsService = serviceFactory.getBookNewsService();
        try {
            News x = bookNewsService.findAllBookNews(news);
            response = x.toString();
        } catch (ServiceException e) {
            response = "Невозможно найти новости о книгах";
        }
        return response;
    }

}
