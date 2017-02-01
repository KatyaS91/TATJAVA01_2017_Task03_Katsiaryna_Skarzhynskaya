package dao;


import beans.News;

import java.io.*;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class SQLBookNewsDAO implements BookNewsDAO {

    public void putBookNews(News news) throws DAOException{

        String title = news.getTitle();
        String name = news.getName();
        String description = news.getDescription();

        try {
            File file = new File("C:\\Users\\Katsiaryna_Skarzhyns\\IdeaProjects\\BooksNewsCatalog.txt");
            FileWriter writer = new FileWriter(file, true);
            String text = "\n"+ title + " " + name + " " + description + "\n";
            writer.write(text);
            writer.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public News selectAllBookNews(News news) throws DAOException{
        return null;
    }
}
