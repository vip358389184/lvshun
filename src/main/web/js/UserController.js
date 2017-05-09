var UserController = function($scope, $http) {
    $scope.fetchUsersList = function() {
        $http.get('user/findAll').success(function(userList){
            $scope.user = userList;
        });
    };

    $scope.addNewUser = function(newUser) {
        $http.post('user/addUser/' + newUser).success(function() {
            $scope.fetchUsersList();
        });
        $scope.userName = '';
    };

    $scope.removeUser = function(user) {
        $http.delete('user/removeUser/' + user).success(function() {
            $scope.fetchUsersList();
        });
    };

    $scope.removeAllUsers = function() {
        $http.delete('user/removeAllUsers').success(function() {
            $scope.fetchUsersList();
        });

    };

    $scope.fetchUsersList();
}; 