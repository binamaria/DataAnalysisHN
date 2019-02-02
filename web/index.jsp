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
<%-- To plot graph for showing the number of jobs that require onsite or remote work over the period--%>

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
                    "caption": "Jobs that require Onsite and remote work",
                    "subcaption": "2016 - 2018",
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
                    "seriesname": "2016/17 Onsite",
                    "data": [{
                        "value": ${map16Onsite.Feb}
                    }, {
                        "value": ${map16Onsite.Mar}
                    }, {
                        "value": ${map16Onsite.Apr}
                    }, {
                        "value": ${map16Onsite.May}
                    }, {
                        "value": ${map16Onsite.Jun}
                    }, {
                        "value": ${map16Onsite.Jul}
                    }, {
                        "value": ${map16Onsite.Aug}
                    }, {
                        "value": ${map16Onsite.Sep}
                    }, {
                        "value": ${map16Onsite.Oct}
                    }, {
                        "value": ${map16Onsite.Nov}
                    }, {
                        "value": ${map16Onsite.Dec}
                    }, {
                        "value": ${map17Onsite.Jan}
                    }]
                }, {
                    "seriesname": "2017/18 Onsite",
                    "data": [{
                        "value": ${map17Onsite.Feb}
                    }, {
                        "value": ${map17Onsite.Mar}
                    }, {
                        "value": ${map17Onsite.Apr}
                    }, {
                        "value": ${map17Onsite.May}
                    }, {
                        "value": ${map17Onsite.Jun}
                    }, {
                        "value": ${map17Onsite.Jul}
                    }, {
                        "value": ${map17Onsite.Aug}
                    }, {
                        "value": ${map17Onsite.Sep}
                    }, {
                        "value": ${map17Onsite.Oct}
                    }, {
                        "value": ${map17Onsite.Nov}
                    }, {
                        "value": ${map17Onsite.Dec}
                    }, {
                        "value": ${map18Onsite.Jan}
                    }]
                }, {
                    "seriesname": "2016/17 Remote",
                    "data": [{
                        "value": ${map16Remote.Feb}
                    }, {
                        "value": ${map16Remote.Mar}
                    }, {
                        "value": ${map16Remote.Apr}
                    }, {
                        "value": ${map16Remote.May}
                    }, {
                        "value": ${map16Remote.Jun}
                    }, {
                        "value": ${map16Remote.Jul}
                    }, {
                        "value": ${map16Remote.Aug}
                    }, {
                        "value": ${map16Remote.Sep}
                    }, {
                        "value": ${map16Remote.Oct}
                    }, {
                        "value": ${map16Remote.Nov}
                    }, {
                        "value": ${map16Remote.Dec}
                    }, {
                        "value": ${map17Remote.Jan}
                    }]
                },{
                    "seriesname": "2017/18 Remote",
                    "data": [{
                        "value": ${map17Remote.Feb}
                    }, {
                        "value": ${map17Remote.Mar}
                    }, {
                        "value": ${map17Remote.Apr}
                    }, {
                        "value": ${map17Remote.May}
                    }, {
                        "value": ${map17Remote.Jun}
                    }, {
                        "value": ${map17Remote.Jul}
                    }, {
                        "value": ${map17Remote.Aug}
                    }, {
                        "value": ${map17Remote.Sep}
                    }, {
                        "value": ${map17Remote.Oct}
                    }, {
                        "value": ${map17Remote.Nov}
                    }, {
                        "value": ${map17Remote.Dec}
                    }, {
                        "value": ${map18Remote.Jan}
                    }]
                }]
            }
        })
            .render();
    });
</script>

<%@ include file="jsp/PageFooter.jsp"%>
