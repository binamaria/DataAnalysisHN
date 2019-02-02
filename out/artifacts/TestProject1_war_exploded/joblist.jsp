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
<%-- To plot graph for showing the change in job postings over two year period--%>
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
                    "caption": "Job Posting Trends",
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
                    "seriesname": "2016/17 Job Posting",
                    "data": [{
                        "value": ${map16JobPosting.Feb}
                    }, {
                        "value": ${map16JobPosting.Mar}
                    }, {
                        "value": ${map16JobPosting.Apr}
                    }, {
                        "value": ${map16JobPosting.May}
                    }, {
                        "value": ${map16JobPosting.Jun}
                    }, {
                        "value": ${map16JobPosting.Jul}
                    }, {
                        "value": ${map16JobPosting.Aug}
                    }, {
                        "value": ${map16JobPosting.Sep}
                    }, {
                        "value": ${map16JobPosting.Oct}
                    }, {
                        "value": ${map16JobPosting.Nov}
                    }, {
                        "value": ${map16JobPosting.Dec}
                    }, {
                        "value": ${map17JobPosting.Jan}
                    }]
                }, {
                    "seriesname": "2017/18 Job Posting",
                    "data": [{
                        "value": ${map17JobPosting.Feb}
                    }, {
                        "value": ${map17JobPosting.Mar}
                    }, {
                        "value": ${map17JobPosting.Apr}
                    }, {
                        "value": ${map17JobPosting.May}
                    }, {
                        "value": ${map17JobPosting.Jun}
                    }, {
                        "value": ${map17JobPosting.Jul}
                    }, {
                        "value": ${map17JobPosting.Aug}
                    }, {
                        "value": ${map17JobPosting.Sep}
                    }, {
                        "value": ${map17JobPosting.Oct}
                    }, {
                        "value": ${map17JobPosting.Nov}
                    }, {
                        "value": ${map17JobPosting.Dec}
                    }, {
                        "value": ${map18JobPosting.Jan}
                    }]
                }]
            }
        })
            .render();
    });
</script>

<%@ include file="jsp/PageFooter.jsp"%>
