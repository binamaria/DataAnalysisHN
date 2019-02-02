package Servlet;

import dao.FetchInfo;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


@WebServlet(name = "Servlet.SampleServlet")
public class SampleServlet extends HttpServlet {

    protected void infoRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String servletPath = request.getServletPath();
        RequestDispatcher requestDispatcher = null;
        String redirectPage = "index.jsp";

        switch(servletPath){
            case "/index":
                FetchInfo testObj = new FetchInfo();
                JsonObject retVal = testObj.getInfo();
                JsonArray array =retVal.getJsonArray("hits");

                HashMap<String, String> map16Onsite = new HashMap<String, String>();
                HashMap<String, String> map16Remote = new HashMap<String, String>();
                HashMap<String, String> map17Onsite = new HashMap<String, String>();
                HashMap<String, String> map17Remote = new HashMap<String, String>();
                HashMap<String, String> map18Onsite = new HashMap<String, String>();
                HashMap<String, String> map18Remote = new HashMap<String, String>();

//Iterating through json array and setting values
                for (JsonValue value: array) {

                    String id = value.asJsonObject().getString("objectID");
                    String[] onsiteRemoteVal = testObj.getRemoteOnsiteData(id);

                    String dateJson = value.asJsonObject().getString("created_at");
                    String dataVals []= dateJson.split("-");
                    String year = dataVals[0];
                    String month = dataVals[1];
//Populating hashmaps based on the year,month
                    if(Integer.parseInt(year) == 2016){
                        switch (Integer.parseInt(month)){
                            case 2:
                                map16Onsite.put("Feb", onsiteRemoteVal[0]);
                                map16Remote.put("Feb", onsiteRemoteVal[1]);
                                break;

                            case 3:
                                map16Onsite.put("Mar", onsiteRemoteVal[0]);
                                map16Remote.put("Mar", onsiteRemoteVal[1]);
                                break;

                            case 4:
                                map16Onsite.put("Apr", onsiteRemoteVal[0]);
                                map16Remote.put("Apr", onsiteRemoteVal[1]);
                                break;

                            case 5:
                                map16Onsite.put("May", onsiteRemoteVal[0]);
                                map16Remote.put("May", onsiteRemoteVal[1]);
                                break;

                            case 6:
                                map16Onsite.put("Jun", onsiteRemoteVal[0]);
                                map16Remote.put("Jun", onsiteRemoteVal[1]);
                                break;

                            case 7:
                                map16Onsite.put("Jul", onsiteRemoteVal[0]);
                                map16Remote.put("Jul", onsiteRemoteVal[1]);
                                break;

                            case 8:
                                map16Onsite.put("Aug", onsiteRemoteVal[0]);
                                map16Remote.put("Aug", onsiteRemoteVal[1]);
                                break;

                            case 9:
                                map16Onsite.put("Sep", onsiteRemoteVal[0]);
                                map16Remote.put("Sep", onsiteRemoteVal[1]);
                                break;

                            case 10:
                                map16Onsite.put("Oct", onsiteRemoteVal[0]);
                                map16Remote.put("Oct", onsiteRemoteVal[1]);
                                break;

                            case 11:
                                map16Onsite.put("Nov", onsiteRemoteVal[0]);
                                map16Remote.put("Nov", onsiteRemoteVal[1]);
                                break;

                            case 12:
                                map16Onsite.put("Dec", onsiteRemoteVal[0]);
                                map16Remote.put("Dec", onsiteRemoteVal[1]);
                                break;

                            default:
                                map16Onsite.put("","");
                                map16Remote.put("","");
                                break;
                        }

                    }else if(Integer.parseInt(year) == 2017){
                        switch (Integer.parseInt(month)){
                            case 1:
                                map17Onsite.put("Jan", onsiteRemoteVal[0]);
                                map17Remote.put("Jan", onsiteRemoteVal[1]);
                                break;
                            case 2:
                                map17Onsite.put("Feb", onsiteRemoteVal[0]);
                                map17Remote.put("Feb", onsiteRemoteVal[1]);
                                break;

                            case 3:
                                map17Onsite.put("Mar", onsiteRemoteVal[0]);
                                map17Remote.put("Mar", onsiteRemoteVal[1]);
                                break;

                            case 4:
                                map17Onsite.put("Apr", onsiteRemoteVal[0]);
                                map17Remote.put("Apr", onsiteRemoteVal[1]);
                                break;

                            case 5:
                                map17Onsite.put("May", onsiteRemoteVal[0]);
                                map17Remote.put("May", onsiteRemoteVal[1]);
                                break;

                            case 6:
                                map17Onsite.put("Jun", onsiteRemoteVal[0]);
                                map17Remote.put("Jun", onsiteRemoteVal[1]);
                                break;

                            case 7:
                                map17Onsite.put("Jul", onsiteRemoteVal[0]);
                                map17Remote.put("Jul", onsiteRemoteVal[1]);
                                break;

                            case 8:
                                map17Onsite.put("Aug", onsiteRemoteVal[0]);
                                map17Remote.put("Aug", onsiteRemoteVal[1]);
                                break;

                            case 9:
                                map17Onsite.put("Sep", onsiteRemoteVal[0]);
                                map17Remote.put("Sep", onsiteRemoteVal[1]);
                                break;

                            case 10:
                                map17Onsite.put("Oct", onsiteRemoteVal[0]);
                                map17Remote.put("Oct", onsiteRemoteVal[1]);
                                break;

                            case 11:
                                map17Onsite.put("Nov", onsiteRemoteVal[0]);
                                map17Remote.put("Nov", onsiteRemoteVal[1]);
                                break;

                            case 12:
                                map17Onsite.put("Dec", onsiteRemoteVal[0]);
                                map17Remote.put("Dec", onsiteRemoteVal[1]);
                                break;

                            default:
                                map17Onsite.put("","0");
                                map17Remote.put("","0");
                                break;

                        }

                    }else{

                        switch (Integer.parseInt(month)){
                            case 1:
                                map18Onsite.put("Jan", onsiteRemoteVal[0]);
                                map18Remote.put("Jan", onsiteRemoteVal[1]);
                                break;

                            case 2:
                                map18Onsite.put("Feb", onsiteRemoteVal[0]);
                                map18Remote.put("Feb", onsiteRemoteVal[1]);
                                break;

                            default:
                                map17Onsite.put("","0");
                                map17Remote.put("","0");
                                break;

                        }
                    }
                }
//Setting attributes for the request object
                request.setAttribute("map16Onsite", map16Onsite);
                request.setAttribute("map16Remote", map16Remote);
                request.setAttribute("map17Onsite", map17Onsite);
                request.setAttribute("map17Remote", map17Remote);
                request.setAttribute("map18Onsite", map18Onsite);
                request.setAttribute("map18Remote", map18Remote);
                redirectPage = "index.jsp";
                break;

            default:
                redirectPage = "index.jsp";
                break;
        }

        requestDispatcher = request.getRequestDispatcher(redirectPage);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        infoRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        infoRequest(request, response);
    }

    @Override
    public String getServletInfo(){
        return "A very short description.";
    }

}
