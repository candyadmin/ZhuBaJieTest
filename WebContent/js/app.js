/// <reference path="../framework/angular/angular.js" />
'use strict';

var engineerApp = angular.module('engineerApp', ['ui.router', 'engineer']);
engineerApp.run(function($rootScope,$state,$stateParams){
    $rootScope.$state=$state;
    $rootScope.$stateParams=$stateParams;
});
/**
 *配置路由
*/
engineerApp.config(function($stateProvider,$urlRouterProvider){
	$urlRouterProvider.otherwise('/home');
	$stateProvider
	    .state('home',{
	    	url:'/home',
	    	views: {
	    		'': {
	    		    templateUrl: 'tpls/home.html',
	    		},
	    		'top@home':{
	    			templateUrl:'tpls/top.html'
	    		},
	    		'search@home':{
	    			templateUrl:'tpls/search.html'
	    		},
	    		'main@home':{
	    			templateUrl:'tpls/default.html'
	    		},
	    		'foot@home':{
	    			templateUrl:'tpls/foot.html'
	    		}
	    	}
	    })
	    .state('login',{
	    	url: '/login',
	    	views: {
	    		'': {
	    		    templateUrl: 'tpls/login.html',
	    		    controller: 'loginCtrl'
	    		}
	    	}
	    })
	    .state('register',{
	    	url: '/register',
	    	views: {
	    		'': {
	    			templateUrl: 'tpls/register.html'
	    		}
	    	}
	    })

});
