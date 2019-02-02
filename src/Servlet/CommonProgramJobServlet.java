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

@WebServlet(name = "ProgrammingJobServlet")
public class ProgrammingJobServlet extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            String servletPath = request.getServletPath();
            RequestDispatcher rd = null;
            String redirectPage = "progJobs.jsp";

            switch(servletPath){
                case "/proJobs":
                    FetchInfo getProJob = new FetchInfo();
                    JsonObject retVal = getProJob.getData();
                    JsonArray arr =retVal.getJsonArray("hits");

                    HashMap<String, String> map16Python = new HashMap<String, String>();
                    HashMap<String, String> map16Php = new HashMap<String, String>();
                    HashMap<String, String> map16Java = new HashMap<String, String>();
                    HashMap<String, String> map16Cpp= new HashMap<String, String>();
                    HashMap<String, String> map16CSharp = new HashMap<String, String>();
                    HashMap<String, String> map16JS = new HashMap<String, String>();
                    HashMap<String, String> map16Go = new HashMap<String, String>();
                    HashMap<String, String> map16Swift = new HashMap<String, String>();
                    HashMap<String, String> map16Ruby = new HashMap<String, String>();
                    HashMap<String, String> map16Arduino = new HashMap<String, String>();

                    HashMap<String, String> map17Python = new HashMap<String, String>();
                    HashMap<String, String> map17Php = new HashMap<String, String>();
                    HashMap<String, String> map17Java = new HashMap<String, String>();
                    HashMap<String, String> map17Cpp= new HashMap<String, String>();
                    HashMap<String, String> map17CSharp = new HashMap<String, String>();
                    HashMap<String, String> map17JS = new HashMap<String, String>();
                    HashMap<String, String> map17Go = new HashMap<String, String>();
                    HashMap<String, String> map17Swift = new HashMap<String, String>();
                    HashMap<String, String> map17Ruby = new HashMap<String, String>();
                    HashMap<String, String> map17Arduino = new HashMap<String, String>();

                    HashMap<String, String> map18Python = new HashMap<String, String>();
                    HashMap<String, String> map18Php = new HashMap<String, String>();
                    HashMap<String, String> map18Java = new HashMap<String, String>();
                    HashMap<String, String> map18Cpp= new HashMap<String, String>();
                    HashMap<String, String> map18CSharp = new HashMap<String, String>();
                    HashMap<String, String> map18JS = new HashMap<String, String>();
                    HashMap<String, String> map18Go = new HashMap<String, String>();
                    HashMap<String, String> map18Swift = new HashMap<String, String>();
                    HashMap<String, String> map18Ruby = new HashMap<String, String>();
                    HashMap<String, String> map18Arduino = new HashMap<String, String>();



                    for (JsonValue a: arr) {

                        String id = a.asJsonObject().getString("objectID");
                        String[] progJobs = getProJob.getProgrammingJobData(id);

                        String dateJson = a.asJsonObject().getString("created_at");
                        String dataVals []= dateJson.split("-");
                        String year = dataVals[0];
                        String month = dataVals[1];

                        if(Integer.parseInt(year) == 2016){
                            switch (Integer.parseInt(month)){
                                case 2:
                                    map16Python.put("Feb", progJobs[0]);
                                    map16Php.put("Feb", progJobs[1]);
                                    map16Java.put("Feb", progJobs[2]);
                                    map16Cpp.put("Feb", progJobs[3]);
                                    map16CSharp.put("Feb", progJobs[4]);
                                    map16JS.put("Feb", progJobs[5]);
                                    map16Go.put("Feb", progJobs[6]);
                                    map16Swift.put("Feb", progJobs[7]);
                                    map16Ruby.put("Feb", progJobs[8]);
                                    map16Arduino.put("Feb", progJobs[9]);
                                    break;

                                case 3:
                                    map16Python.put("Mar", progJobs[0]);
                                    map16Php.put("Mar", progJobs[1]);
                                    map16Java.put("Mar", progJobs[2]);
                                    map16Cpp.put("Mar", progJobs[3]);
                                    map16CSharp.put("Mar", progJobs[4]);
                                    map16JS.put("Mar", progJobs[5]);
                                    map16Go.put("Mar", progJobs[6]);
                                    map16Swift.put("Mar", progJobs[7]);
                                    map16Ruby.put("Mar", progJobs[8]);
                                    map16Arduino.put("Mar", progJobs[9]);
                                    break;

                                case 4:
                                    map16Python.put("Apr", progJobs[0]);
                                    map16Php.put("Apr", progJobs[1]);
                                    map16Java.put("Apr", progJobs[2]);
                                    map16Cpp.put("Apr", progJobs[3]);
                                    map16CSharp.put("Apr", progJobs[4]);
                                    map16JS.put("Apr", progJobs[5]);
                                    map16Go.put("Apr", progJobs[6]);
                                    map16Swift.put("Apr", progJobs[7]);
                                    map16Ruby.put("Apr", progJobs[8]);
                                    map16Arduino.put("Apr", progJobs[9]);
                                    break;

                                case 5:
                                    map16Python.put("May", progJobs[0]);
                                    map16Php.put("May", progJobs[1]);
                                    map16Java.put("May", progJobs[2]);
                                    map16Cpp.put("May", progJobs[3]);
                                    map16CSharp.put("May", progJobs[4]);
                                    map16JS.put("May", progJobs[5]);
                                    map16Go.put("May", progJobs[6]);
                                    map16Swift.put("May", progJobs[7]);
                                    map16Ruby.put("May", progJobs[8]);
                                    map16Arduino.put("May", progJobs[9]);
                                    break;

                                case 6:
                                    map16Python.put("Jun", progJobs[0]);
                                    map16Php.put("Jun", progJobs[1]);
                                    map16Java.put("Jun", progJobs[2]);
                                    map16Cpp.put("Jun", progJobs[3]);
                                    map16CSharp.put("Jun", progJobs[4]);
                                    map16JS.put("Jun", progJobs[5]);
                                    map16Go.put("Jun", progJobs[6]);
                                    map16Swift.put("Jun", progJobs[7]);
                                    map16Ruby.put("Jun", progJobs[8]);
                                    map16Arduino.put("Jun", progJobs[9]);
                                    break;

                                case 7:
                                    map16Python.put("Jul", progJobs[0]);
                                    map16Php.put("Jul", progJobs[1]);
                                    map16Java.put("Jul", progJobs[2]);
                                    map16Cpp.put("Jul", progJobs[3]);
                                    map16CSharp.put("Jul", progJobs[4]);
                                    map16JS.put("Jul", progJobs[5]);
                                    map16Go.put("Jul", progJobs[6]);
                                    map16Swift.put("Jul", progJobs[7]);
                                    map16Ruby.put("Jul", progJobs[8]);
                                    map16Arduino.put("Jul", progJobs[9]);
                                    break;

                                case 8:
                                    map16Python.put("Aug", progJobs[0]);
                                    map16Php.put("Aug", progJobs[1]);
                                    map16Java.put("Aug", progJobs[2]);
                                    map16Cpp.put("Aug", progJobs[3]);
                                    map16CSharp.put("Aug", progJobs[4]);
                                    map16JS.put("Aug", progJobs[5]);
                                    map16Go.put("Aug", progJobs[6]);
                                    map16Swift.put("Aug", progJobs[7]);
                                    map16Ruby.put("Aug", progJobs[8]);
                                    map16Arduino.put("Aug", progJobs[9]);
                                    break;

                                case 9:
                                    map16Python.put("Sep", progJobs[0]);
                                    map16Php.put("Sep", progJobs[1]);
                                    map16Java.put("Sep", progJobs[2]);
                                    map16Cpp.put("Sep", progJobs[3]);
                                    map16CSharp.put("Sep", progJobs[4]);
                                    map16JS.put("Sep", progJobs[5]);
                                    map16Go.put("Sep", progJobs[6]);
                                    map16Swift.put("Sep", progJobs[7]);
                                    map16Ruby.put("Sep", progJobs[8]);
                                    map16Arduino.put("Sep", progJobs[9]);
                                    break;

                                case 10:
                                    map16Python.put("Oct", progJobs[0]);
                                    map16Php.put("Oct", progJobs[1]);
                                    map16Java.put("Oct", progJobs[2]);
                                    map16Cpp.put("Oct", progJobs[3]);
                                    map16CSharp.put("Oct", progJobs[4]);
                                    map16JS.put("Oct", progJobs[5]);
                                    map16Go.put("Oct", progJobs[6]);
                                    map16Swift.put("Oct", progJobs[7]);
                                    map16Ruby.put("Oct", progJobs[8]);
                                    map16Arduino.put("Oct", progJobs[9]);
                                    break;

                                case 11:
                                    map16Python.put("Nov", progJobs[0]);
                                    map16Php.put("Nov", progJobs[1]);
                                    map16Java.put("Nov", progJobs[2]);
                                    map16Cpp.put("Nov", progJobs[3]);
                                    map16CSharp.put("Nov", progJobs[4]);
                                    map16JS.put("Nov", progJobs[5]);
                                    map16Go.put("Nov", progJobs[6]);
                                    map16Swift.put("Nov", progJobs[7]);
                                    map16Ruby.put("Nov", progJobs[8]);
                                    map16Arduino.put("Nov", progJobs[9]);
                                    break;

                                case 12:
                                    map16Python.put("Dec", progJobs[0]);
                                    map16Php.put("Dec", progJobs[1]);
                                    map16Java.put("Dec", progJobs[2]);
                                    map16Cpp.put("Dec", progJobs[3]);
                                    map16CSharp.put("Dec", progJobs[4]);
                                    map16JS.put("Dec", progJobs[5]);
                                    map16Go.put("Dec", progJobs[6]);
                                    map16Swift.put("Dec", progJobs[7]);
                                    map16Ruby.put("Dec", progJobs[8]);
                                    map16Arduino.put("Dec", progJobs[9]);
                                    break;

                                default:
                                    map16Python.put("", "0");
                                    map16Php.put("", "0");
                                    map16Java.put("", "0");
                                    map16Cpp.put("", "0");
                                    map16CSharp.put("", "0");
                                    map16JS.put("", "0");
                                    map16Go.put("", "0");
                                    map16Swift.put("", "0");
                                    map16Ruby.put("", "0");
                                    map16Arduino.put("", "0");
                                    break;

                            }

                        }else if(Integer.parseInt(year) == 2017){
                            switch (Integer.parseInt(month)){
                                case 1:
                                    map17Python.put("Jan", progJobs[0]);
                                    map17Php.put("Jan", progJobs[1]);
                                    map17Java.put("Jan", progJobs[2]);
                                    map17Cpp.put("Jan", progJobs[3]);
                                    map17CSharp.put("Jan", progJobs[4]);
                                    map17JS.put("Jan", progJobs[5]);
                                    map17Go.put("Jan", progJobs[6]);
                                    map17Swift.put("Jan", progJobs[7]);
                                    map17Ruby.put("Jan", progJobs[8]);
                                    map17Arduino.put("Jan", progJobs[9]);
                                    break;
                                case 2:
                                    map17Python.put("Feb", progJobs[0]);
                                    map17Php.put("Feb", progJobs[1]);
                                    map17Java.put("Feb", progJobs[2]);
                                    map17Cpp.put("Feb", progJobs[3]);
                                    map17CSharp.put("Feb", progJobs[4]);
                                    map17JS.put("Feb", progJobs[5]);
                                    map17Go.put("Feb", progJobs[6]);
                                    map17Swift.put("Feb", progJobs[7]);
                                    map17Ruby.put("Feb", progJobs[8]);
                                    map17Arduino.put("Feb", progJobs[9]);
                                    break;

                                case 3:
                                    map17Python.put("Mar", progJobs[0]);
                                    map17Php.put("Mar", progJobs[1]);
                                    map17Java.put("Mar", progJobs[2]);
                                    map17Cpp.put("Mar", progJobs[3]);
                                    map17CSharp.put("Mar", progJobs[4]);
                                    map17JS.put("Mar", progJobs[5]);
                                    map17Go.put("Mar", progJobs[6]);
                                    map17Swift.put("Mar", progJobs[7]);
                                    map17Ruby.put("Mar", progJobs[8]);
                                    map17Arduino.put("Mar", progJobs[9]);
                                    break;

                                case 4:
                                    map17Python.put("Apr", progJobs[0]);
                                    map17Php.put("Apr", progJobs[1]);
                                    map17Java.put("Apr", progJobs[2]);
                                    map17Cpp.put("Apr", progJobs[3]);
                                    map17CSharp.put("Apr", progJobs[4]);
                                    map17JS.put("Apr", progJobs[5]);
                                    map17Go.put("Apr", progJobs[6]);
                                    map17Swift.put("Apr", progJobs[7]);
                                    map17Ruby.put("Apr", progJobs[8]);
                                    map17Arduino.put("Apr", progJobs[9]);
                                    break;

                                case 5:
                                    map17Python.put("May", progJobs[0]);
                                    map17Php.put("May", progJobs[1]);
                                    map17Java.put("May", progJobs[2]);
                                    map17Cpp.put("May", progJobs[3]);
                                    map17CSharp.put("May", progJobs[4]);
                                    map17JS.put("May", progJobs[5]);
                                    map17Go.put("May", progJobs[6]);
                                    map17Swift.put("May", progJobs[7]);
                                    map17Ruby.put("May", progJobs[8]);
                                    map17Arduino.put("May", progJobs[9]);

                                case 6:
                                    map17Python.put("Jun", progJobs[0]);
                                    map17Php.put("Jun", progJobs[1]);
                                    map17Java.put("Jun", progJobs[2]);
                                    map17Cpp.put("Jun", progJobs[3]);
                                    map17CSharp.put("Jun", progJobs[4]);
                                    map17JS.put("Jun", progJobs[5]);
                                    map17Go.put("Jun", progJobs[6]);
                                    map17Swift.put("Jun", progJobs[7]);
                                    map17Ruby.put("Jun", progJobs[8]);
                                    map17Arduino.put("Jun", progJobs[9]);
                                    break;

                                case 7:
                                    map17Python.put("Jul", progJobs[0]);
                                    map17Php.put("Jul", progJobs[1]);
                                    map17Java.put("Jul", progJobs[2]);
                                    map17Cpp.put("Jul", progJobs[3]);
                                    map17CSharp.put("Jul", progJobs[4]);
                                    map17JS.put("Jul", progJobs[5]);
                                    map17Go.put("Jul", progJobs[6]);
                                    map17Swift.put("Jul", progJobs[7]);
                                    map17Ruby.put("Jul", progJobs[8]);
                                    map17Arduino.put("Jul", progJobs[9]);
                                    break;

                                case 8:
                                    map17Python.put("Aug", progJobs[0]);
                                    map17Php.put("Aug", progJobs[1]);
                                    map17Java.put("Aug", progJobs[2]);
                                    map17Cpp.put("Aug", progJobs[3]);
                                    map17CSharp.put("Aug", progJobs[4]);
                                    map17JS.put("Aug", progJobs[5]);
                                    map17Go.put("Aug", progJobs[6]);
                                    map17Swift.put("Aug", progJobs[7]);
                                    map17Ruby.put("Aug", progJobs[8]);
                                    map17Arduino.put("Aug", progJobs[9]);
                                    break;

                                case 9:
                                    map17Python.put("Sep", progJobs[0]);
                                    map17Php.put("Sep", progJobs[1]);
                                    map17Java.put("Sep", progJobs[2]);
                                    map17Cpp.put("Sep", progJobs[3]);
                                    map17CSharp.put("Sep", progJobs[4]);
                                    map17JS.put("Sep", progJobs[5]);
                                    map17Go.put("Sep", progJobs[6]);
                                    map17Swift.put("Sep", progJobs[7]);
                                    map17Ruby.put("Sep", progJobs[8]);
                                    map17Arduino.put("Sep", progJobs[9]);
                                    break;

                                case 10:
                                    map17Python.put("Oct", progJobs[0]);
                                    map17Php.put("Oct", progJobs[1]);
                                    map17Java.put("Oct", progJobs[2]);
                                    map17Cpp.put("Oct", progJobs[3]);
                                    map17CSharp.put("Oct", progJobs[4]);
                                    map17JS.put("Oct", progJobs[5]);
                                    map17Go.put("Oct", progJobs[6]);
                                    map17Swift.put("Oct", progJobs[7]);
                                    map17Ruby.put("Oct", progJobs[8]);
                                    map17Arduino.put("Oct", progJobs[9]);
                                    break;

                                case 11:
                                    map17Python.put("Nov", progJobs[0]);
                                    map17Php.put("Nov", progJobs[1]);
                                    map17Java.put("Nov", progJobs[2]);
                                    map17Cpp.put("Nov", progJobs[3]);
                                    map17CSharp.put("Nov", progJobs[4]);
                                    map17JS.put("Nov", progJobs[5]);
                                    map17Go.put("Nov", progJobs[6]);
                                    map17Swift.put("Nov", progJobs[7]);
                                    map17Ruby.put("Nov", progJobs[8]);
                                    map17Arduino.put("Nov", progJobs[9]);
                                    break;

                                case 12:
                                    map17Python.put("Dec", progJobs[0]);
                                    map17Php.put("Dec", progJobs[1]);
                                    map17Java.put("Dec", progJobs[2]);
                                    map17Cpp.put("Dec", progJobs[3]);
                                    map17CSharp.put("Dec", progJobs[4]);
                                    map17JS.put("Dec", progJobs[5]);
                                    map17Go.put("Dec", progJobs[6]);
                                    map17Swift.put("Dec", progJobs[7]);
                                    map17Ruby.put("Dec", progJobs[8]);
                                    map17Arduino.put("Dec", progJobs[9]);
                                    break;

                                default:
                                    map17Python.put("", "0");
                                    map17Php.put("", "0");
                                    map17Java.put("", "0");
                                    map17Cpp.put("", "0");
                                    map17CSharp.put("", "0");
                                    map17JS.put("", "0");
                                    map17Go.put("", "0");
                                    map17Swift.put("", "0");
                                    map17Ruby.put("", "0");
                                    map17Arduino.put("", "0");
                                    break;

                            }

                        }else{

                            switch (Integer.parseInt(month)){
                                case 1:
                                    map18Python.put("Jan", progJobs[0]);
                                    map18Php.put("Jan", progJobs[1]);
                                    map18Java.put("Jan", progJobs[2]);
                                    map18Cpp.put("Jan", progJobs[3]);
                                    map18CSharp.put("Jan", progJobs[4]);
                                    map18JS.put("Jan", progJobs[5]);
                                    map18Go.put("Jan", progJobs[6]);
                                    map18Swift.put("Jan", progJobs[7]);
                                    map18Ruby.put("Jan", progJobs[8]);
                                    map18Arduino.put("Jan", progJobs[9]);
                                    break;

                                case 2:
                                    map18Python.put("Feb", progJobs[0]);
                                    map18Php.put("Feb", progJobs[1]);
                                    map18Java.put("Feb", progJobs[2]);
                                    map18Cpp.put("Feb", progJobs[3]);
                                    map18CSharp.put("Feb", progJobs[4]);
                                    map18JS.put("Feb", progJobs[5]);
                                    map18Go.put("Feb", progJobs[6]);
                                    map18Swift.put("Feb", progJobs[7]);
                                    map18Ruby.put("Feb", progJobs[8]);
                                    map18Arduino.put("Feb", progJobs[9]);
                                    break;

                                default:
                                    map18Python.put("", "0");
                                    map18Php.put("", "0");
                                    map18Java.put("", "0");
                                    map18Cpp.put("", "0");
                                    map18CSharp.put("", "0");
                                    map18JS.put("", "0");
                                    map18Go.put("", "0");
                                    map18Swift.put("", "0");
                                    map18Ruby.put("", "0");
                                    map18Arduino.put("", "0");
                                    break;

                            }
                        }
                    }

                    request.setAttribute("map16Python", map16Python);
                    request.setAttribute("map16Cpp", map16Cpp);
                    request.setAttribute("map16Java", map16Java);
                    request.setAttribute("map16CSharp", map16CSharp);
                    request.setAttribute("map16Php", map16Php);
                    request.setAttribute("map16JS", map16JS);
                    request.setAttribute("map16Go", map16Go);
                    request.setAttribute("map16Swift", map16Swift);
                    request.setAttribute("map16Ruby", map16Ruby);
                    request.setAttribute("map16Arduino", map16Arduino);

                    request.setAttribute("map17Python", map17Python);
                    request.setAttribute("map17Cpp", map17Cpp);
                    request.setAttribute("map17Java", map17Java);
                    request.setAttribute("map17CSharp", map17CSharp);
                    request.setAttribute("map17Php", map17Php);
                    request.setAttribute("map17JS", map17JS);
                    request.setAttribute("map17Go", map17Go);
                    request.setAttribute("map17Swift", map17Swift);
                    request.setAttribute("map17Ruby", map17Ruby);
                    request.setAttribute("map17Arduino", map17Arduino);

                    request.setAttribute("map18Python", map18Python);
                    request.setAttribute("map18Cpp", map18Cpp);
                    request.setAttribute("map18Java", map18Java);
                    request.setAttribute("map18CSharp", map18CSharp);
                    request.setAttribute("map18Php", map18Php);
                    request.setAttribute("map18JS", map18JS);
                    request.setAttribute("map18Go", map18Go);
                    request.setAttribute("map18Swift", map18Swift);
                    request.setAttribute("map18Ruby", map18Ruby);
                    request.setAttribute("map18Arduino", map18Arduino);

                    redirectPage = "progJobs.jsp";
                    break;

                default:
                    redirectPage = "progJobs.jsp";
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


