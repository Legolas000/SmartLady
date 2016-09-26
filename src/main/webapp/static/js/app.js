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
        .otherwise({redirectTo:'/home'});
}]);



/*,
resolve: {
    async: ['SmartLadyService', function(SmartLadyService) {
        return SmartLadyService.fetchAllItems('home');
    }]
}*/


