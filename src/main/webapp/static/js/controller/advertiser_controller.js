/**
 * Created by ARHAM on 9/24/2016.
 */

'use strict';

angular.module('myApp').controller('AdvertiserController',
        ['$scope','AdvertiserService',
            function($scope,AdvertiserService){
    /*$scope.saveAdvertise = function() {
        $http({
            method : 'POST',
            url : 'advertisements'
        }).success(function(data, status, headers, config) {
            //$scope.person = data;
        }).error(function(data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
            console.log("Error in controller");
        });

    }*/
  /*      var self = this;

        self.test = test;

        function test() {
            console.log("Test Success");
        }*/
    var self = this;
    self.advertise={
        id:null,
        category:'',
        heading:'',
        adurl:'',
        description:"Arham descripotion rytoekrfvbkwej",
        time:'',
        place:'',
        payment:''
    };
    self.advertises=[];

    self.submit = submit;
    self.reset = reset;
    self.test = test;

    function test() {
        console.log("Test Success");
    }

    fetchAllAdvertise();

    function fetchAllAdvertise(){
        AdvertiserService.fetchAllAdvertise()
            .then(
                function(d) {
                    self.advertises = d;
                },
                function(errResponse){
                    console.error('Error while fetching Advertises');
                }
            );
    }

    function createAdvertise(advertise){
        console.log("create function calling!")
        AdvertiserService.createAdvertise(advertise)
            .then(
                fetchAllAdvertise,
                function(errResponse){
                    console.error('Error while creating Advertise');
                }
            );
    }

    function submit() {
        console.log("Submit button calling");
        if(self.advertise.id===null){
            console.log('Saving New Advertise', self.advertise);
            createAdvertise(self.advertise);
        }else{
            console.log('Error in submit ');
        }
        reset();
    }

    function reset(){ console.log("Reset button calling");
        self.advertise={id:null,
            category:'',
            heading:'',
            adurl:'',
            description:"",
            time:'',
            place:'',
            payment:''};
        $scope.advertiseForm.$setPristine(); //reset Form
    }


}]);

/*
App.controller('advertiseController', function($scope) {
    //$scope.message = 'Hello from HomeController';

});*/
