<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 1/29/2018
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<%@include file="jsp/mainPage.jsp" %>

<div id="chart-container"></div>
<div id="jobs-17-18"></div>

<%-- To plot graph for showing the number of jobs that ask for all of the "common" programming languages--%>
<script>
    FusionCharts.ready(function() {
        var salesChart = new FusionCharts({
            type: 'msline',
            renderAt: 'chart-container',
            width: '600',
            height: '400',
            dataFormat: 'json',
            dataSource: {
                "chart": {
                    "caption": "Top Programming Jobs",
                    "subcaption": "2016/17",
                    "linethickness": "2",
                    "numberPrefix": "",
                    "showvalues": "0",
                    "formatnumberscale": "1",
                    "labeldisplay": "ROTATE",
                    "slantlabels": "1",
                    "divLineAlpha": "40",
                    "anchoralpha": "0",
                    "animation": "1",
                    "legendborderalpha": "20",
                    "drawCrossLine": "1",
                    "crossLineColor": "#0d0d0d",
                    "crossLineAlpha": "100",
                    "tooltipGrayOutColor": "#80bfff",
                    "theme": "zune"
                },
                "categories": [{
                    "category": [{
                        "label": "Feb"
                    }, {
                        "label": "Mar"
                    }, {
                        "label": "Apr"
                    }, {
                        "label": "May"
                    }, {
                        "label": "Jun"
                    }, {
                        "label": "Jul"
                    }, {
                        "label": "Aug"
                    }, {
                        "label": "Sep"
                    }, {
                        "label": "Oct"
                    }, {
                        "label": "Nov"
                    }, {
                        "label": "Dec"
                    }, {
                        "label": "Jan"
                    }]
                }],
                "dataset": [{
                    "seriesname": "Python",
                    "data": [{
                        "value": ${map16Python.Feb}
                    }, {
                        "value": ${map16Python.Mar}
                    }, {
                        "value": ${map16Python.Apr}
                    }, {
                        "value": ${map16Python.May}
                    }, {
                        "value": ${map16Python.Jun}
                    }, {
                        "value": ${map16Python.Jul}
                    }, {
                        "value": ${map16Python.Aug}
                    }, {
                        "value": ${map16Python.Sep}
                    }, {
                        "value": ${map16Python.Oct}
                    }, {
                        "value": ${map16Python.Nov}
                    }, {
                        "value": ${map16Python.Dec}
                    }, {
                        "value": ${map17Python.Jan}
                    }]
                }, {
                    "seriesname": "C ++",
                    "data": [{
                        "value": ${map16Cpp.Feb}
                    }, {
                        "value": ${map16Cpp.Mar}
                    }, {
                        "value": ${map16Cpp.Apr}
                    }, {
                        "value": ${map16Cpp.May}
                    }, {
                        "value": ${map16Cpp.Jun}
                    }, {
                        "value": ${map16Cpp.Jul}
                    }, {
                        "value": ${map16Cpp.Aug}
                    }, {
                        "value": ${map16Cpp.Sep}
                    }, {
                        "value": ${map16Cpp.Oct}
                    }, {
                        "value": ${map16Cpp.Nov}
                    }, {
                        "value": ${map16Cpp.Dec}
                    }, {
                        "value": ${map17Cpp.Jan}
                    }]
                }, {
                    "seriesname": "Java",
                    "data": [{
                        "value": ${map16Java.Feb}
                    }, {
                        "value": ${map16Java.Mar}
                    }, {
                        "value": ${map16Java.Apr}
                    }, {
                        "value": ${map16Java.May}
                    }, {
                        "value": ${map16Java.Jun}
                    }, {
                        "value": ${map16Java.Jul}
                    }, {
                        "value": ${map16Java.Aug}
                    }, {
                        "value": ${map16Java.Sep}
                    }, {
                        "value": ${map16Java.Oct}
                    }, {
                        "value": ${map16Java.Nov}
                    }, {
                        "value": ${map16Java.Dec}
                    }, {
                        "value": ${map17Java.Jan}
                    }]
                },{
                    "seriesname": "C#",
                    "data": [{
                        "value": ${map16CSharp.Feb}
                    }, {
                        "value": ${map16CSharp.Mar}
                    }, {
                        "value": ${map16CSharp.Apr}
                    }, {
                        "value": ${map16CSharp.May}
                    }, {
                        "value": ${map16CSharp.Jun}
                    }, {
                        "value": ${map16CSharp.Jul}
                    }, {
                        "value": ${map16CSharp.Aug}
                    }, {
                        "value": ${map16CSharp.Sep}
                    }, {
                        "value": ${map16CSharp.Oct}
                    }, {
                        "value": ${map16CSharp.Nov}
                    }, {
                        "value": ${map16CSharp.Dec}
                    }, {
                        "value": ${map17CSharp.Jan}
                    }]
                },{
                    "seriesname": "PHP",
                    "data": [{
                        "value": ${map16Php.Feb}
                    }, {
                        "value": ${map16Php.Mar}
                    }, {
                        "value": ${map16Php.Apr}
                    }, {
                        "value": ${map16Php.May}
                    }, {
                        "value": ${map16Php.Jun}
                    }, {
                        "value": ${map16Php.Jul}
                    }, {
                        "value": ${map16Php.Aug}
                    }, {
                        "value": ${map16Php.Sep}
                    }, {
                        "value": ${map16Php.Oct}
                    }, {
                        "value": ${map16Php.Nov}
                    }, {
                        "value": ${map16Php.Dec}
                    }, {
                        "value": ${map17Php.Jan}
                    }]
                },{
                    "seriesname": "JavaScript",
                    "data": [{
                        "value": ${map16JS.Feb}
                    }, {
                        "value": ${map16JS.Mar}
                    }, {
                        "value": ${map16JS.Apr}
                    }, {
                        "value": ${map16JS.May}
                    }, {
                        "value": ${map16JS.Jun}
                    }, {
                        "value": ${map16JS.Jul}
                    }, {
                        "value": ${map16JS.Aug}
                    }, {
                        "value": ${map16JS.Sep}
                    }, {
                        "value": ${map16JS.Oct}
                    }, {
                        "value": ${map16JS.Nov}
                    }, {
                        "value": ${map16JS.Dec}
                    }, {
                        "value": ${map17JS.Jan}
                    }]
                },{
                    "seriesname": "GO",
                    "data": [{
                        "value": ${map16Go.Feb}
                    }, {
                        "value": ${map16Go.Mar}
                    }, {
                        "value": ${map16Go.Apr}
                    }, {
                        "value": ${map16Go.May}
                    }, {
                        "value": ${map16Go.Jun}
                    }, {
                        "value": ${map16Go.Jul}
                    }, {
                        "value": ${map16Go.Aug}
                    }, {
                        "value": ${map16Go.Sep}
                    }, {
                        "value": ${map16Go.Oct}
                    }, {
                        "value": ${map16Go.Nov}
                    }, {
                        "value": ${map16Go.Dec}
                    }, {
                        "value": ${map17Go.Jan}
                    }]
                },{
                    "seriesname": "Swift",
                    "data": [{
                        "value": ${map16Swift.Feb}
                    }, {
                        "value": ${map16Swift.Mar}
                    }, {
                        "value": ${map16Swift.Apr}
                    }, {
                        "value": ${map16Swift.May}
                    }, {
                        "value": ${map16Swift.Jun}
                    }, {
                        "value": ${map16Swift.Jul}
                    }, {
                        "value": ${map16Swift.Aug}
                    }, {
                        "value": ${map16Swift.Sep}
                    }, {
                        "value": ${map16Swift.Oct}
                    }, {
                        "value": ${map16Swift.Nov}
                    }, {
                        "value": ${map16Swift.Dec}
                    }, {
                        "value": ${map17Swift.Jan}
                    }]
                },{
                    "seriesname": "Ruby",
                    "data": [{
                        "value": ${map16Ruby.Feb}
                    }, {
                        "value": ${map16Ruby.Mar}
                    }, {
                        "value": ${map16Ruby.Apr}
                    }, {
                        "value": ${map16Ruby.May}
                    }, {
                        "value": ${map16Ruby.Jun}
                    }, {
                        "value": ${map16Ruby.Jul}
                    }, {
                        "value": ${map16Ruby.Aug}
                    }, {
                        "value": ${map16Ruby.Sep}
                    }, {
                        "value": ${map16Ruby.Oct}
                    }, {
                        "value": ${map16Ruby.Nov}
                    }, {
                        "value": ${map16Ruby.Dec}
                    }, {
                        "value": ${map17Ruby.Jan}
                    }]
                },{
                    "seriesname": "Arduino",
                    "data": [{
                        "value": ${map16Arduino.Feb}
                    }, {
                        "value": ${map16Arduino.Mar}
                    }, {
                        "value": ${map16Arduino.Apr}
                    }, {
                        "value": ${map16Arduino.May}
                    }, {
                        "value": ${map16Arduino.Jun}
                    }, {
                        "value": ${map16Arduino.Jul}
                    }, {
                        "value": ${map16Arduino.Aug}
                    }, {
                        "value": ${map16Arduino.Sep}
                    }, {
                        "value": ${map16Arduino.Oct}
                    }, {
                        "value": ${map16Arduino.Nov}
                    }, {
                        "value": ${map16Arduino.Dec}
                    }, {
                        "value": ${map17Arduino.Jan}
                    }]
                }]
            }
        })
            .render();
    });
</script>

<script>

    FusionCharts.ready(function() {
        var jobschart = new FusionCharts({
            type: 'msline',
            renderAt: 'jobs-17-18',
            width: '600',
            height: '400',
            dataFormat: 'json',
            dataSource: {
                "chart": {
                    "caption": "Top Programming Jobs",
                    "subcaption": "2017/18",
                    "linethickness": "2",
                    "numberPrefix": "",
                    "showvalues": "0",
                    "formatnumberscale": "1",
                    "labeldisplay": "ROTATE",
                    "slantlabels": "1",
                    "divLineAlpha": "40",
                    "anchoralpha": "0",
                    "animation": "1",
                    "legendborderalpha": "20",
                    "drawCrossLine": "1",
                    "crossLineColor": "#0d0d0d",
                    "crossLineAlpha": "100",
                    "tooltipGrayOutColor": "#80bfff",
                    "theme": "zune"
                },
                "categories": [{
                    "category": [{
                        "label": "Feb"
                    }, {
                        "label": "Mar"
                    }, {
                        "label": "Apr"
                    }, {
                        "label": "May"
                    }, {
                        "label": "Jun"
                    }, {
                        "label": "Jul"
                    }, {
                        "label": "Aug"
                    }, {
                        "label": "Sep"
                    }, {
                        "label": "Oct"
                    }, {
                        "label": "Nov"
                    }, {
                        "label": "Dec"
                    }, {
                        "label": "Jan"
                    }]
                }],
                "dataset": [{
                    "seriesname": "Python",
                    "data": [{
                        "value": ${map17Python.Feb}
                    }, {
                        "value": ${map17Python.Mar}
                    }, {
                        "value": ${map17Python.Apr}
                    }, {
                        "value": ${map17Python.May}
                    }, {
                        "value": ${map17Python.Jun}
                    }, {
                        "value": ${map17Python.Jul}
                    }, {
                        "value": ${map17Python.Aug}
                    }, {
                        "value": ${map17Python.Sep}
                    }, {
                        "value": ${map17Python.Oct}
                    }, {
                        "value": ${map17Python.Nov}
                    }, {
                        "value": ${map17Python.Dec}
                    }, {
                        "value": ${map18Python.Jan}
                    }]
                }, {
                    "seriesname": "C ++",
                    "data": [{
                        "value": ${map17Cpp.Feb}
                    }, {
                        "value": ${map17Cpp.Mar}
                    }, {
                        "value": ${map17Cpp.Apr}
                    }, {
                        "value": ${map17Cpp.May}
                    }, {
                        "value": ${map17Cpp.Jun}
                    }, {
                        "value": ${map17Cpp.Jul}
                    }, {
                        "value": ${map17Cpp.Aug}
                    }, {
                        "value": ${map17Cpp.Sep}
                    }, {
                        "value": ${map17Cpp.Oct}
                    }, {
                        "value": ${map17Cpp.Nov}
                    }, {
                        "value": ${map17Cpp.Dec}
                    }, {
                        "value": ${map18Cpp.Jan}
                    }]
                }, {
                    "seriesname": "Java",
                    "data": [{
                        "value": ${map17Java.Feb}
                    }, {
                        "value": ${map17Java.Mar}
                    }, {
                        "value": ${map17Java.Apr}
                    }, {
                        "value": ${map17Java.May}
                    }, {
                        "value": ${map17Java.Jun}
                    }, {
                        "value": ${map17Java.Jul}
                    }, {
                        "value": ${map17Java.Aug}
                    }, {
                        "value": ${map17Java.Sep}
                    }, {
                        "value": ${map17Java.Oct}
                    }, {
                        "value": ${map17Java.Nov}
                    }, {
                        "value": ${map17Java.Dec}
                    }, {
                        "value": ${map18Java.Jan}
                    }]
                },{
                    "seriesname": "C#",
                    "data": [{
                        "value": ${map17CSharp.Feb}
                    }, {
                        "value": ${map17CSharp.Mar}
                    }, {
                        "value": ${map17CSharp.Apr}
                    }, {
                        "value": ${map17CSharp.May}
                    }, {
                        "value": ${map17CSharp.Jun}
                    }, {
                        "value": ${map17CSharp.Jul}
                    }, {
                        "value": ${map17CSharp.Aug}
                    }, {
                        "value": ${map17CSharp.Sep}
                    }, {
                        "value": ${map17CSharp.Oct}
                    }, {
                        "value": ${map17CSharp.Nov}
                    }, {
                        "value": ${map17CSharp.Dec}
                    }, {
                        "value": ${map18CSharp.Jan}
                    }]
                },{
                    "seriesname": "PHP",
                    "data": [{
                        "value": ${map17Php.Feb}
                    }, {
                        "value": ${map17Php.Mar}
                    }, {
                        "value": ${map17Php.Apr}
                    }, {
                        "value": ${map17Php.May}
                    }, {
                        "value": ${map17Php.Jun}
                    }, {
                        "value": ${map17Php.Jul}
                    }, {
                        "value": ${map17Php.Aug}
                    }, {
                        "value": ${map17Php.Sep}
                    }, {
                        "value": ${map17Php.Oct}
                    }, {
                        "value": ${map17Php.Nov}
                    }, {
                        "value": ${map17Php.Dec}
                    }, {
                        "value": ${map18Php.Jan}
                    }]
                },{
                    "seriesname": "JavaScript",
                    "data": [{
                        "value": ${map17JS.Feb}
                    }, {
                        "value": ${map17JS.Mar}
                    }, {
                        "value": ${map17JS.Apr}
                    }, {
                        "value": ${map17JS.May}
                    }, {
                        "value": ${map17JS.Jun}
                    }, {
                        "value": ${map17JS.Jul}
                    }, {
                        "value": ${map17JS.Aug}
                    }, {
                        "value": ${map17JS.Sep}
                    }, {
                        "value": ${map17JS.Oct}
                    }, {
                        "value": ${map17JS.Nov}
                    }, {
                        "value": ${map17JS.Dec}
                    }, {
                        "value": ${map18JS.Jan}
                    }]
                },{
                    "seriesname": "GO",
                    "data": [{
                        "value": ${map17Go.Feb}
                    }, {
                        "value": ${map17Go.Mar}
                    }, {
                        "value": ${map17Go.Apr}
                    }, {
                        "value": ${map17Go.May}
                    }, {
                        "value": ${map17Go.Jun}
                    }, {
                        "value": ${map17Go.Jul}
                    }, {
                        "value": ${map17Go.Aug}
                    }, {
                        "value": ${map17Go.Sep}
                    }, {
                        "value": ${map17Go.Oct}
                    }, {
                        "value": ${map17Go.Nov}
                    }, {
                        "value": ${map17Go.Dec}
                    }, {
                        "value": ${map18Go.Jan}
                    }]
                },{
                    "seriesname": "Swift",
                    "data": [{
                        "value": ${map17Swift.Feb}
                    }, {
                        "value": ${map17Swift.Mar}
                    }, {
                        "value": ${map17Swift.Apr}
                    }, {
                        "value": ${map17Swift.May}
                    }, {
                        "value": ${map17Swift.Jun}
                    }, {
                        "value": ${map17Swift.Jul}
                    }, {
                        "value": ${map17Swift.Aug}
                    }, {
                        "value": ${map17Swift.Sep}
                    }, {
                        "value": ${map17Swift.Oct}
                    }, {
                        "value": ${map17Swift.Nov}
                    }, {
                        "value": ${map17Swift.Dec}
                    }, {
                        "value": ${map18Swift.Jan}
                    }]
                },{
                    "seriesname": "Ruby",
                    "data": [{
                        "value": ${map17Ruby.Feb}
                    }, {
                        "value": ${map17Ruby.Mar}
                    }, {
                        "value": ${map17Ruby.Apr}
                    }, {
                        "value": ${map17Ruby.May}
                    }, {
                        "value": ${map17Ruby.Jun}
                    }, {
                        "value": ${map17Ruby.Jul}
                    }, {
                        "value": ${map17Ruby.Aug}
                    }, {
                        "value": ${map17Ruby.Sep}
                    }, {
                        "value": ${map17Ruby.Oct}
                    }, {
                        "value": ${map17Ruby.Nov}
                    }, {
                        "value": ${map17Ruby.Dec}
                    }, {
                        "value": ${map18Ruby.Jan}
                    }]
                },{
                    "seriesname": "Arduino",
                    "data": [{
                        "value": ${map17Arduino.Feb}
                    }, {
                        "value": ${map17Arduino.Mar}
                    }, {
                        "value": ${map17Arduino.Apr}
                    }, {
                        "value": ${map17Arduino.May}
                    }, {
                        "value": ${map17Arduino.Jun}
                    }, {
                        "value": ${map17Arduino.Jul}
                    }, {
                        "value": ${map17Arduino.Aug}
                    }, {
                        "value": ${map17Arduino.Sep}
                    }, {
                        "value": ${map17Arduino.Oct}
                    }, {
                        "value": ${map17Arduino.Nov}
                    }, {
                        "value": ${map17Arduino.Dec}
                    }, {
                        "value": ${map18Arduino.Jan}
                    }]
                }]
            }
        })
            .render();
    });
</script>

<%@ include file="jsp/PageFooter.jsp"%>
