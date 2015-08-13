angular.module('student', []);
angular.module('student').controller('studentController', function ($scope, $http) {

    $scope.student = {};
    $scope.saveStudent = function () {
        $http.post('/saveStudent', $scope.student)
                .success(function (data) {
                    growl('Save Success', 'success', 'top');
                    getStudent();

                }).error(function (data) {
            growl('Save Error', 'info', 'buttom');

        });
    };

    $scope.delStudent = {};
    $scope.deleteStudent = function () {
        $http.post('/deleteStudent', $scope.delStudent)
                .success(function (data) {
                    growl('Delete Success', 'info', 'top');
                    getStudent();


                }).error(function (data) {
            growl('Delete Error', 'danger', 'buttom');

        });

    };

    $scope.students = {};
    function getStudent() {
        $http.get('/getstudent')
                .success(function (data) {
                    $scope.students = data;

                })
                       .error(function (data) {


                });
    }
    getStudent();

    $scope.clickUpdate = function (updateStudent) {
        $scope.student = updateStudent;
    };

});
