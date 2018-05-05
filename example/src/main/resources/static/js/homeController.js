var app = angular.module("myApp", ["ngRoute"]);

app.controller('homeController', function($scope) {
    $scope.firstName = "John";
    $scope.lastName = "Doe";
});