package dao;

import beans.News;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class SQLMovieNewsDAO implements MovieNewsDAO {

    public void putMovieNews(News news) throws DAOException{
        String title = news.getTitle();
        String name = news.getName();
        String description = news.getDescription();

        try {
            File file = new File("C:\\Users\\Katsiaryna_Skarzhyns\\IdeaProjects\\MovieNewsCatalog.txt");
            FileWriter writer = new FileWriter(file, true);
            String text = title + " " + name + " " + description + "\n";
            writer.write(text);
            writer.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public MovieNewsDAO selectAllMovieNews(News news) throws DAOException{
        return null;
    }
}
