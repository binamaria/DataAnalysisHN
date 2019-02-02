<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 1/29/2018
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data Analysis</title>
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="assets/css/app.css" rel="stylesheet"/>
    <script src="assets/js/jquery.min.js"></script>
    <script src="../assets/js/bootstrap.min.js"></script>
    <script src="assets/js/angular-1.1.5.min.js"></script>
    <script src="assets/js/fusioncharts.js"></script>
    <script src="assets/js/fusioncharts.charts.js"></script>
    <script src="assets/js/fusioncharts.gantt.js"></script>


</head>
<body>

<header class = "container">
    <div class="grid">
        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 btn-light text-white" style="font-size:180%">.</div>
            <div class="col-lg-6 col-md-6 col-sm-5 col-xs-12 btn-light text-dark" style="font-size:180%">Hacker News:  "Ask HN: Who is hiring?"</div>
            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 btn-light text-white" style="font-size:180%">.</div>

        </div>
        <div class="row">
    <div class="col-md-12 col-sm-12">

        <div class = "col-md-4">
            <a class="btn-default btn-block btn-group-lg btn-info" href="/jobPosting" style="font-size:120%">Job postings over two year period</a>
        </div>
        <div class = "col-md-4">
            <a class="btn-default btn-block btn-group-lg btn-info" href="/index" style="font-size:120%">Jobs that require onsite or remote work</a>
        </div>
        <div class = "col-md-4">
            <a class="btn-default btn-block btn-group-lg btn-info" href="/proJobs " style="font-size:120%">Common programming languages jobs</a>
        </div>
    </div>

        </div>
        <div class="row">
            <div class="col-md-12 col-sm-12">

                <div class = "col-md-4">
                    <a class="btn-default btn-block btn-group-lg btn-primary" style="font-size:120%"></a>
                </div>
                <div class = "col-md-4">
                    <a class="btn-default btn-block btn-group-lg btn-primary" href="/loadMap" style="font-size:120%">Show map - Job site locations of 2017 vs 2016</a>
                </div>
                <div class = "col-md-4">
                    <a class="btn-default btn-block btn-group-lg btn-primary" style="font-size:120%"></a>
                </div>

            </div>

        </div>
    </div>
</header>

