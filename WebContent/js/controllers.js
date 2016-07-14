/// <reference path="../framework/angular/angular.js" />
'use strict';
var engineer = angular.module('engineer', []);
engineer.controller("loginCtrl", ["$scope", "$http", function ($scope, $http) {
    var vm = $scope.vm = {
        logname: "123",
        pwd:"111"
    };
    vm.logon = function () {
        $http.post('', {
            name: vm.logname,
            pwd:vm.pwd
        }).success(function(result){
           
        })
    }
    
}]);

engineer.controller("registerCtrl", ["$scope", "$http", function ($scope, $http) {
    
}]);