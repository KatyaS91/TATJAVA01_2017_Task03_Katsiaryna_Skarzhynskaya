package beans;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class News {
    String title;
    String name;
    String description;
    String allNews;

    public String getAllNews() {
        return allNews;
    }

    public void setAllNews(String allNews) {
        this.allNews = allNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", allNews='" + allNews + '\'' +
                '}';
    }



}
