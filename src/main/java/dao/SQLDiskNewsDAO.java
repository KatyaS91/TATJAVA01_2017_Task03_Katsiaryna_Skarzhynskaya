package dao;

import beans.News;

import java.io.*;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class SQLDiskNewsDAO implements DiskNewsDAO {

    public void putDiskNews(News news) throws DAOException{
        String title = news.getTitle();
        String name = news.getName();
        String description = news.getDescription();

        try {
            File file = new File("C:\\Users\\Katsiaryna_Skarzhyns\\IdeaProjects\\DiskNewsCatalog.txt");
            FileWriter writer = new FileWriter(file, true);
            String text = title + " " + name + " " + description + "\n";
            writer.write(text);
            writer.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    /*    public News selectAllDiskNews(News news) throws DAOException{
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\\\Users\\\\Katsiaryna_Skarzhyns\\\\IdeaProjects\\\\DiskNewsCatalog.txt"));
                String line = null;
                try {
                    while ((line = reader.readLine()) !=null){
                        news.setAllNews(line);
                    }
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }

            } catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
            return news;
        }*/
    public News selectAllDiskNews(News news) throws DAOException {
        try {
            FileInputStream reader = new FileInputStream("C:\\\\Users\\\\Katsiaryna_Skarzhyns\\\\IdeaProjects\\\\DiskNewsCatalog.txt");
            byte[] str = new byte[reader.available()];
            reader.read(str);
            String content = new String(str);
            news.setAllNews(content);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return news;
    }
}
