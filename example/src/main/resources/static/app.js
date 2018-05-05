var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "./views/home.html"
    })
    .when("/red", {
        templateUrl : "./views/home.html"
    })
    .when("/green", {
        templateUrl : "./home.html"
    })
    .when("/blue", {
        templateUrl : "blue.htm"
    }).otherwise({
    	 templateUrl : "./views/home.html"
    });
});


