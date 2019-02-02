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


<link rel="stylesheet" href="https://unpkg.com/leaflet@1.3.1/dist/leaflet.css"
      integrity="sha512-Rksm5RenBEKSKFjgI3a41vrjkw4EVPlJ3+OiI65vTjIdo9brlAacEuKOiQ5OFh7cOI1bkDwLqdLw3Zg0cRJAAQ=="
      crossorigin=""/>

<script src="https://unpkg.com/leaflet@1.3.1/dist/leaflet.js"
        integrity="sha512-/Nsx9X4HebavoBvEBuyp3I7od5tA0UzAxs+j83KgC8PU0kgB4XiK4Lfe4y4cgBtaRJQEIFCW+oC506aPT2L1zw=="
        crossorigin=""></script>
<%-- To show the map on the page --%>
<div class="container-fluid text-center">
    <div class="col-md-8">
        <span><h4>2017 Job Site Locations plotted</h4></span>
        <div id="mapid2017" style="height: 340px; width: 100%;"></div>
        <span><h4>2016 Job Site Locations plotted</h4></span>
        <div id="mapid2016" style="height: 340px; width: 100%;"></div>
    </div>
</div>

<script>

    <%-- Setting map variable --%>
var mymap = L.map('mapid2017').setView([47.6038321, -122.3300624], 2);

L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token={accessToken}', {
    attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, <a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="http://mapbox.com">Mapbox</a>',
    maxZoom: 18,
    id: 'mapbox.streets',
    accessToken: 'pk.eyJ1IjoiYmluYW1hcmlhIiwiYSI6ImNqZXlyaW4yYzAyYXIyeHFqcG1hOXlwczIifQ.0SG0iwYfhX0yApvnPHQp9Q'
}).addTo(mymap);

    <%-- Iterating through the main list of 2017 and setting markers --%>
${response2017}.forEach(function (element) {

     L.marker([element[1], element[2]]).addTo(mymap).bindPopup("No: job sites in this location:"+element[0].toString());
});


</script>

<script>



    <%-- Setting map for showing job sites of 2016 --%>
    var mymap = L.map('mapid2016').setView([45.5202471, -122.6741949], 2);

    L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token={accessToken}', {
        attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, <a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="http://mapbox.com">Mapbox</a>',
        maxZoom: 18,
        id: 'mapbox.streets',
        accessToken: 'pk.eyJ1IjoiYmluYW1hcmlhIiwiYSI6ImNqZXlyaW4yYzAyYXIyeHFqcG1hOXlwczIifQ.0SG0iwYfhX0yApvnPHQp9Q'
    }).addTo(mymap);

    <%-- Iterating through the main list of 2016 and setting markers --%>
    ${response2016}.forEach(function (element) {

        L.marker([element[1], element[2]]).addTo(mymap).bindPopup("No: job sites in this location:"+element[0].toString());
    });



</script>

<%@ include file="jsp/PageFooter.jsp"%>
