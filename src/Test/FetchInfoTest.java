package Test;

import dao.FetchInfo;

import javax.json.JsonArray;
import javax.json.JsonObject;

import static org.junit.Assert.*;
import org.junit.Test;

public class FetchInfoTest {


   //will check if the status code of the response from the server is 200. Else the test will fail.
    @Test
    public void getCode(){
        FetchInfo fetch1Obj = new FetchInfo();
assertEquals(200,fetch1Obj.getCode());
    }

    //checks if the title of the first item in the response is "Ask HN: Who is hiring? (February 2018)". Else the test will fail.
    @Test
    public void getData(){
        FetchInfo fetch1Obj = new FetchInfo();
        JsonObject jsonObject = fetch1Obj.getInfo();
        JsonArray jsonArray = jsonObject.getJsonArray("hits");
        assertTrue(jsonArray.getJsonObject(0).getString("title").contentEquals("Ask HN: Who is hiring? (February 2018)"));

    }
    //checks the python jobs for the id-11012044,it should not be 10. Else the test will fail.
    @Test
    public void ProgLanguages(){
        FetchInfo fetch1 = new FetchInfo();
        String[] projectData = fetch1.getProgrammingJobData("11012044");
        assertTrue(projectData[0].contentEquals("10"));


    }
}