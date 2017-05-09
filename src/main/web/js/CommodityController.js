var CommodityController = function($scope, $http) {
    $scope.fetchUsersList = function() {
        $http.get('comm/findAll').success(function(commList){
            $scope.comm = commList;
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