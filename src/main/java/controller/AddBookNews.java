package controller;

import beans.News;
import service.BookNewsService;
import service.ServiceException;
import service.ServiceFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class AddBookNews implements Command {
    String response = null;
    public String execute(News news){
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BookNewsService bookNewsService = serviceFactory.getBookNewsService();
        try {
            bookNewsService.addBookNews(news);
            response = "Книга успешно добавлена";
        } catch (ServiceException e){
            response = "Ошибка при добавлении книги";
        }
        return response;
    }
}
