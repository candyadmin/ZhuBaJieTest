/// <reference path="../framework/angular/angular.js" />
'use strict';
var engineer = angular.module('engineer', []);
engineer.controller("loginCtrl", [ "$scope", "$http", function($scope, $http) {
	var vm = $scope.vm = {
		logname : "123",
		pwd : "111"
	};
	vm.logon = function() {// 这个是前台的异步访问
//		$http.post('loginServlet').data({
//			name : vm.logname,
//			pwd : vm.pwd
//		}).success(function(result) {
//		})
		 $.ajax({
				url: "loginServlet", 
				method:'post',
				data:{
					name:vm.logname,
					pwd : vm.pwd
				},
				success: function(data){
		  }});
	}
} ]);
engineer.controller("registerCtrl", [ "$scope", "$http",
		function($scope, $http) {
		} ]);