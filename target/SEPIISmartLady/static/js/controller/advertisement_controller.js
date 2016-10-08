'use strict';

angular.module('myApp').controller('AdvertisementController', ['$scope', 'AdvertisementService', function($scope, AdvertisementService) {

    var self = this;
    self.advertisement={id:null,url:'',description:'',publishedDate:'',expiryDate:'',payment:0,status:''};
    self.advertisements=[];

    self.approve = approve;

    fetchAllAdvertisements();

    function fetchAllAdvertisements(){
    	AdvertisementService.fetchAllAdvertisements()
            .then(
                function(d) {
                    self.advertisements = d;
                },
                function(errResponse){
                    console.error('Error while fetching Articles');
                }
            );
    }


    function updateStatus(id){
    	AdvertisementService.updateStatus(id)
            .then(
        		fetchAllAdvertisements,
                function(errResponse){
                    console.error('Error while updating Article');
                }
            );
    }

    function approve(id) {
    	updateStatus(id);
        console.log('Advertisement approval confirmed for id:- ', id);
    }

}]);
