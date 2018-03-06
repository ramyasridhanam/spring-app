var app = angular.module('myApp', ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/login", {
        templateUrl : "log.html",
        controller:"loginController"
    })
    .when("/signup", {
        templateUrl : "signup.html",
        controller:"signUpController"
    })
    .when("/success", {
        templateUrl : "success.html",
        controller:"successController"
    })
    .otherwise({
    	redirectTo : "/"
    });
    
});