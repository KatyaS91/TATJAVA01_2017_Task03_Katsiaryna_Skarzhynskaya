package controller;

import beans.News;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public interface Command {
    String execute(News news);
}
