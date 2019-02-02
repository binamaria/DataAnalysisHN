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
import java.util.HashMap;

@WebServlet(name = "JobPostingServlet")
public class JobPostingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String servletPath = request.getServletPath();
        RequestDispatcher rd = null;
        String redirectPage = "index.jsp";

        switch(servletPath){
            case "/jobPosting":
                FetchInfo getJobPostingData = new FetchInfo();
                JsonObject jsonData = getJobPostingData.getData();
                JsonArray arr =jsonData.getJsonArray("hits");
                HashMap<String, String> map16JobPosting = new HashMap<String, String>();
                HashMap<String, String> map17JobPosting = new HashMap<String, String>();
                HashMap<String, String> map18JobPosting = new HashMap<String, String>();

                for (JsonValue a: arr) {

                    String id = a.asJsonObject().getString("objectID");
                    String jobPostNum = getJobPostingData.getJobPostingData(id);

                    String dateJson = a.asJsonObject().getString("created_at");
                    String dataVals []= dateJson.split("-");
                    String year = dataVals[0];
                    String month = dataVals[1];

                    if(Integer.parseInt(year) == 2016){
                        switch (Integer.parseInt(month)){
                            case 2:
                                map16JobPosting.put("Feb", jobPostNum);
                                break;

                            case 3:
                                map16JobPosting.put("Mar", jobPostNum);
                                break;

                            case 4:
                                map16JobPosting.put("Apr", jobPostNum);
                                break;

                            case 5:
                                map16JobPosting.put("May", jobPostNum);
                                break;

                            case 6:
                                map16JobPosting.put("Jun", jobPostNum);
                                break;

                            case 7:
                                map16JobPosting.put("Jul", jobPostNum);
                                break;

                            case 8:
                                map16JobPosting.put("Aug", jobPostNum);
                                break;

                            case 9:
                                map16JobPosting.put("Sep", jobPostNum);
                                break;

                            case 10:
                                map16JobPosting.put("Oct", jobPostNum);
                                break;

                            case 11:
                                map16JobPosting.put("Nov", jobPostNum);
                                break;

                            case 12:
                                map16JobPosting.put("Dec", jobPostNum);
                                break;

                            default:
                                map16JobPosting.put("","");
                                break;

                        }

                    }else if(Integer.parseInt(year) == 2017){
                        switch (Integer.parseInt(month)){
                            case 1:
                                map17JobPosting.put("Jan", jobPostNum);
                                break;
                            case 2:
                                map17JobPosting.put("Feb", jobPostNum);
                                break;

                            case 3:
                                map17JobPosting.put("Mar", jobPostNum);
                                break;

                            case 4:
                                map17JobPosting.put("Apr", jobPostNum);
                                break;

                            case 5:
                                map17JobPosting.put("May", jobPostNum);
                                break;

                            case 6:
                                map17JobPosting.put("Jun", jobPostNum);
                                break;

                            case 7:
                                map17JobPosting.put("Jul", jobPostNum);
                                break;

                            case 8:
                                map17JobPosting.put("Aug", jobPostNum);
                                break;

                            case 9:
                                map17JobPosting.put("Sep", jobPostNum);
                                break;

                            case 10:
                                map17JobPosting.put("Oct", jobPostNum);
                                break;

                            case 11:
                                map17JobPosting.put("Nov", jobPostNum);
                                break;

                            case 12:
                                map17JobPosting.put("Dec", jobPostNum);
                                break;

                            default:
                                map17JobPosting.put("","0");
                                break;
                        }
                    }else{

                        switch (Integer.parseInt(month)){
                            case 1:
                                map18JobPosting.put("Jan", jobPostNum);
                                break;

                            case 2:
                                map18JobPosting.put("Feb", jobPostNum);
                                break;

                            default:
                                map18JobPosting.put("","0");
                                break;

                        }
                    }
                }

                request.setAttribute("map16JobPosting", map16JobPosting);
                request.setAttribute("map17JobPosting", map17JobPosting);
                request.setAttribute("map18JobPosting", map18JobPosting);

                redirectPage = "jobposting.jsp";
                break;

            default:
                redirectPage = "jobposting.jsp";
                break;
        }

        rd = request.getRequestDispatcher(redirectPage);
        rd.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo(){
        return "A very short description.";
    }
}
