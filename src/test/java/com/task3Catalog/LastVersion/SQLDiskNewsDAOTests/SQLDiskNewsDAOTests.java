package com.task3Catalog.LastVersion.SQLDiskNewsDAOTests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Katsiaryna_Skarzhyns on 2/2/2017.
 */
public class SQLDiskNewsDAOTests {
    @Test(expectedExceptions = FileNotFoundException.class)
    public void testFindFile() throws FileNotFoundException {
        FileInputStream reader = new FileInputStream("C:\\\\Users\\\\Katsiaryna_Skarzhyns\\\\IdeaProjects\\\\DiskNews.txt");
    }
}
