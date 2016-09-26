'use strict';

angular.module('myApp').factory('UserService',
                        ['$http', '$q', function($http, $q){

            var REST_SERVICE_URI = 'http://localhost:8080/';

            var factory = {
                fetchItemById: fetchItemById
            };

            return factory;

            function fetchItemById(category,id) {
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
            }



    }]);

