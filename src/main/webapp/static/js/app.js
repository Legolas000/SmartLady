'use strict';

var App = angular.module('myApp',['ngRoute']).run(function($rootScope, $location) {
    $rootScope.location = $location;
});

angular.module('myApp').config(['$routeProvider', function($routeProvider) {
    $routeProvider
        .when('/home', {
            templateUrl: '/static/js/template/reader-template/home.html',
            controller : "UserController as userCtrl"
        })
        .when('/readarticles', {
            templateUrl: '/static/js/template/reader-template/single-post.html'
        })
        .when('/assignadvertise', {
            templateUrl: '/static/js/template/addvertiserPage/requestAdvertise.jsp',
            controller : "AdvertiserController as adctrl"
        })

        .when('/advertiserprofile', {
            templateUrl: '/static/js/template/addvertiserPage/advertiserProfile.jsp',
            controller : "AdvertiserController as adctrl"
        })

        .when('/viewUpdateAdvertise', {
            templateUrl: '/static/js/template/addvertiserPage/viewUpdateAdvertise.jsp',
            controller : "AdvertiserController"
        })
        .otherwise({redirectTo:'/home'});
}]);



/*,
resolve: {
    async: ['SmartLadyService', function(SmartLadyService) {
        return SmartLadyService.fetchAllItems('home');
    }]
}*/


