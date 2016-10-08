'use strict';

angular.module('myApp').factory('AdvertisementService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:1212/SmartLady/advertisements/';

    var factory = {
		fetchAllAdvertisements: fetchAllAdvertisements,
        updateStatus: updateStatus
    };

    return factory;

    function fetchAllAdvertisements() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Error while fetching Advertisements');
                    deferred.reject(errResponse);
                }
            );
        return deferred.promise;
    }

    function updateStatus(id) {
        var deferred = $q.defer();
        $http.delete(REST_SERVICE_URI+id)
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Error while updating Advertisement');
                    deferred.reject(errResponse);
                }
            );
        return deferred.promise;
    }

}]);
