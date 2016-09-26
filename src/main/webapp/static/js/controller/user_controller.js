'use strict';

angular.module('myApp').controller('UserController',
                        ['$scope', 'UserService','$location','$routeParams','$sce',
                        function($scope, UserService,$location,$routeParams,$sce) {
    var self = this;

    self.classStyle = 'second-style';
    self.locationPath = $location.path();
    self.modalPath = "/#"+$location.path();
    self.article={
        id:null,
        title:'',
        description:'',
        publishedDate:'',
        imagePath:'',
        isFeatured:null,
        overallRating:null,
        categoryID:null,
        writerID:null,
        status:''
    };
    self.articles = [];

    self.obj = null;

    self.getReaderArticle = getReaderArticle;

    if(self.locationPath === '/home'){
        self.classStyle = 'second-style';
    }else{
        self.classStyle = '';
    }

    /*//to render html contents.
    $scope.renderHtml = function (htmlCode) {
        return $sce.trustAsHtml(htmlCode);
    };*/



   function goReaderArticle(id){

        UserService.fetchItemById('readarticles', id)
            .then(
                function (d) {
                    self.article = d;
                    self.article.description = $sce.trustAsHtml(self.article.description );
                    console.log("self artilce description "+self.article);
                },
                function (errResponse) {
                    console.error('Error while fetching Articles');
                }
            );
       $location.url('/readarticles');
    }

    function getReaderArticle(id) {
        goReaderArticle(id);
        console.log('Article approval confirmed for id:- ', id);
    }




}]);

