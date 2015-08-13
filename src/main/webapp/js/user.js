angular.module('user',['checklist-model']);
angular.module('user').controller('userController', function ($scope,$http){
    
    $scope.user = {};
    
    
    $scope.saveUser = function (){$http.post('/saveuser',$scope.user);};
    
    
    

    $scope.authority = {};
    function getAuthority(){
        $http.get('/getauthority').success(function (data){
            $scope.authority = data;
        });
        
    };
    getAuthority();


    $scope.users = {};
    function getUser(){
        $http.get('/getuser').success(function (data){
            $scope.users = data;
        });
        
    }
    getUser();
    
    
    

    

});


