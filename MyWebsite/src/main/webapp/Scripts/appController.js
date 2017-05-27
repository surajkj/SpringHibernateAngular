/**
 * 
 */
console.log('Hello');
var app = angular.module('myApp', ["ngRoute"]);

app.config(function($routeProvider,$locationProvider) {
	$locationProvider.hashPrefix('');
	console.log('Routing ');
    $routeProvider
    .when("/main", {
        templateUrl : "main.html"
    }).when("/View", {
        templateUrl : "viewTest.html"
    })
    .when("/", {
        templateUrl : "main.html"
    }).
      otherwise({
		redirectTo: '/main'
      });
});

app.controller('myCtrl', function($scope, $http,$location) {
	$location.path('/main');
    $scope.firstName= "John";
    $scope.lastName= "Doe";    
    //getUserDetails();

	function getUserDetails() {
		console.log('called');
		$http({
			method : 'GET',
			url : 'customers.json'
		}).then(function successCallback(response) {
			$scope.users = response.data;
			console.log($scope.users);
		}, function errorCallback(response) {
			console.log(response.statusText);
		});
	}
});