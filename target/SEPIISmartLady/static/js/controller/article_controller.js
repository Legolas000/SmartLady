'use strict';

angular.module('myApp').controller('ArticleController', ['$scope', 'ArticleService', function($scope, ArticleService) {

    var self = this;
    self.article={id:null,title:'',description:'',status:''};
    self.articles=[];

    self.approve = approve;

    fetchAllArticles();

    function fetchAllArticles(){
        ArticleService.fetchAllArticles()
            .then(
                function(d) {
                    self.articles = d;
                },
                function(errResponse){
                    console.error('Error while fetching Articles');
                }
            );
    }


    function updateStatus(id){
    	ArticleService.updateStatus(id)
            .then(
            	fetchAllArticles,
                function(errResponse){
                    console.error('Error while updating Article');
                }
            );
    }

    function approve(id) {
    	updateStatus(id);
        console.log('Article approval confirmed for id:- ', id);
    }

}]);
