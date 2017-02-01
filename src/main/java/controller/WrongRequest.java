package controller;


import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class WrongRequest implements Command{
    public String execute(News news){
        return "Неправильный запрос";
    }
}
