package dao;

import javax.json.JsonArray;
import javax.json.JsonObject;

import javax.json.JsonValue;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

public class FetchInfo {
    static String path = "http://hn.algolia.com/api/v1/";

    //To fetch the data from the server by calling the api
    public static JsonObject getInfo(){

        Client client = ClientBuilder.newClient();

        WebTarget target = client.target(path + "search_by_date?query=Ask%20HN:%20Who%20is%20Hiring?&tags=author_whoishiring&numericFilters=created_at_i%3E1454284799,created_at_i%3C1519776000&hitsPerPage=50");
        JsonObject str = target.request(MediaType.APPLICATION_JSON_TYPE).get(JsonObject.class);


        return str;
    }

//To find the status code of the response from the server
    public int getCode (){

        Client client = ClientBuilder.newClient();

        WebTarget target = client.target(path + "search_by_date?query=Ask%20HN:%20Who%20is%20Hiring?&tags=author_whoishiring&numericFilters=created_at_i%3E1454284799,created_at_i%3C1519776000&hitsPerPage=50");

        Invocation.Builder builder = target.request(MediaType.APPLICATION_XML);

        int status = builder.get().getStatus();
        int code = status;

        return code;
    }


//To fetch the data showing the number of jobs that require onsite or remote work over the period
    public String[] getRemoteOnsiteData(String id){
        String[] returnValue = new String[2];
        int onsiteCounter =0;
        int remoteCounter = 0;
        List<String> vals = new ArrayList<String>();
        vals.add("onsite");
        vals.add("remote");

        try{

            Client client = ClientBuilder.newClient();
                      String storyUrl = "https://hn.algolia.com/api/v1/search_by_date?query=Jobs%20Posting&tags=(story_"+id+")";
                      System.out.println("storyyyurl"+storyUrl+"idddddd"+id);
            WebTarget target = client.target(storyUrl);
            JsonObject str = target.request(MediaType.APPLICATION_JSON_TYPE).get(JsonObject.class);
                      JsonArray jsonValues = str.getJsonArray("hits");
                      //Iterating through the Json array to set the onsite and remote counter.
            for (JsonValue value:jsonValues) {


                JsonValue comment = value.asJsonObject().getValue("/comment_text");

                for (String word: vals) {
                    if(comment.toString().toLowerCase().contains(word)){
                        if(word == "onsite"){
                            onsiteCounter ++;
                        }else{
                            remoteCounter ++;
                        }
                    }
                }
            }
//Sleep for 1000 millisec to avoid continous calling to server
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        //Populating array
        returnValue[0] = Integer.toString(onsiteCounter);
        returnValue[1] = Integer.toString(remoteCounter);

        return returnValue;
    }

//To fetch data for showing the change in job postings over two year period
    public String getJobPostingData(String id){
        String returnStr = "";
        int jobCounter = 0;

        try{
            Client client = ClientBuilder.newClient();

            String Url = "https://hn.algolia.com/api/v1/search_by_date?query=Jobs%20Posting&tags=(story_"+id+")";
            WebTarget target = client.target(Url);
            JsonObject str = target.request(MediaType.APPLICATION_JSON_TYPE).get(JsonObject.class);

            JsonArray jsonValues = str.getJsonArray("hits");

            jobCounter = jsonValues.size();

            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);


        }

        returnStr = Integer.toString(jobCounter);

        return returnStr;

    }

    //Fetching data to show the number of jobs that ask for all of the "common" programming languages
    public String[] getProgrammingJobData(String id){
        String[] returnVal = new String[10];
        //Initializing counters
        int pythonCounter =0;
        int phpCounter = 0;
        int javaCounter = 0;
        int cppCounter = 0;
        int cSharpCounter = 0;
        int jsCounter = 0;
        int goCounter = 0;
        int swiftCounter = 0;
        int rubyCounter = 0;
        int arduinoCounter = 0;

        //Populating commLangs list with common programming languages
        List<String> commLangs = new ArrayList<String>();
        commLangs.add("python");
        commLangs.add("php");
        commLangs.add("java");
        commLangs.add("c++");
        commLangs.add("c#");
        commLangs.add("javascript");
        commLangs.add("go");
        commLangs.add("swift");
        commLangs.add("ruby");
        commLangs.add("arduino");

        try{

            Client client = ClientBuilder.newClient();

            String Url = "https://hn.algolia.com/api/v1/search_by_date?query=Jobs%20Posting&tags=(story_"+id+")";
            WebTarget target = client.target(Url);
            JsonObject str = target.request(MediaType.APPLICATION_JSON_TYPE).get(JsonObject.class);

            JsonArray jsonValues = str.getJsonArray("hits");
            //Iterating through the Json array and setting each language conters
            for (JsonValue x:jsonValues) {

                JsonValue comment = x.asJsonObject().getValue("/comment_text");

                for (String word: commLangs) {
                    if(comment.toString().toLowerCase().contains(word)){
                        if(word == "python"){
                            pythonCounter ++;
                        }else if(word == "php"){
                            phpCounter ++;
                        }else if(word == "java"){
                               javaCounter++;
                        }else if(word == "c++"){
                            cppCounter++;
                        }else if(word == "c#"){
                            cSharpCounter++;
                        }else if(word == "javascript"){
                            jsCounter++;
                        }else if(word == "go"){
                            goCounter++;
                        }else if(word == "swift"){
                            swiftCounter++;
                        }else if(word == "ruby"){
                            rubyCounter++;
                        }else{
                            arduinoCounter++;
                        }
                    }
                }
            }

            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        returnVal[0] = Integer.toString(pythonCounter);
        returnVal[1] = Integer.toString(phpCounter);
        returnVal[2] = Integer.toString(javaCounter);
        returnVal[3] = Integer.toString(cppCounter);
        returnVal[4] = Integer.toString(cSharpCounter);
        returnVal[5] = Integer.toString(jsCounter);
        returnVal[6] = Integer.toString(goCounter);
        returnVal[7] = Integer.toString(swiftCounter);
        returnVal[8] = Integer.toString(rubyCounter);
        returnVal[9] = Integer.toString(arduinoCounter);

        return returnVal;
    }
}


