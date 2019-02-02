var app = angular.module('myApp', []);
app.controller('AppController', ['$scope', function($scope) {
    console.log("__________________----------------------------------");
    $scope.someData = "Saurav";
    console.log($scope.someData);
}]);