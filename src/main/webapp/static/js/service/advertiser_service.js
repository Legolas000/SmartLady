/**
 * Created by ARHAM on 9/30/2016.
 * Service for Advertiser
 */
'use strict';

angular.module('myApp').factory('AdvertiserService',
    ['$http', '$q', function($http, $q){

        var REST_SERVICE_URI = 'http://localhost:8080/';

        var factory = {
            fetchAllAdvertise: fetchAllAdvertise,
            createAdvertise:createAdvertise
        };

        return factory;

        /*function fetchItemById(category,id) {
            var deferred = $q.defer();
            $http.get(REST_SERVICE_URI+category+'/'+id)
                .then(
                    function (response) {
                        console.log('response to be edited', response.data);
                        deferred.resolve(response.data);
                    },
                    function(errResponse){
                        console.error('Error while fetching Advertisements');
                        deferred.reject(errResponse);
                    }
                );
            return deferred.promise;
        }*/


        function fetchAllAdvertise() {
            var deferred = $q.defer();
            $http.get(REST_SERVICE_URI+"advertisements")
                .then(
                    function (response) {
                        deferred.resolve(response.data);
                    },
                    function(errResponse){
                        console.error('Error while fetching Users');
                        deferred.reject(errResponse);
                    }
                );
            return deferred.promise;
        }

        function createAdvertise(advertise) {
            var deferred = $q.defer();
            $http.post(REST_SERVICE_URI, advertise)
                .then(
                    function (response) {
                        deferred.resolve(response.data);
                    },
                    function(errResponse){
                        console.error('hey Service error : Error while creating Advertise');
                        deferred.reject(errResponse);
                    }
                );
            return deferred.promise;
        }



    }]);

