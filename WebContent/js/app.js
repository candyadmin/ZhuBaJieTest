/// <reference path="../framework/angular/angular.js" />
'use strict';

var engineerApp = angular.module('engineerApp', ['ui.router', 'ngAnimate', 'ngSanitize', 'mgcrea.ngStrap', 'engineer']);
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
	    		    templateUrl: 'views/home.html',
	    		},
	    		'top@home':{
	    		    templateUrl: 'views/layout/top.html'
	    		},
	    		'search@home':{
	    		    templateUrl: 'views/layout/search.html'
	    		},
	    		'main@home':{
	    		    templateUrl: 'views/default.html'
	    		},
	    		'foot@home':{
	    		    templateUrl: 'views/layout/foot.html'
	    		}
	    	}
	    })
	    .state('login',{
	    	url: '/login',
	    	views: {
	    		'': {
	    		    templateUrl: 'views/login.html',
	    		    controller: 'loginCtrl'
	    		}
	    	}
	    })
	    .state('register',{
	    	url: '/register',
	    	views: {
	    		'': {
	    		    templateUrl: 'views/register.html',
	    		    controller: 'registerCtrl'
	    		}
	    	}
	    })

        .state('home.projectPub', {
            url: '/projectPub',
            views: {
                'main@home': {
                    templateUrl: 'views/project/ProjectPub.html',
                    controller: 'projectPubCtrl'
                }
            }
        })
        
        .state('home.projects', {
            url: '/projects',
            views: {
                'main@home': {
                    templateUrl: 'views/project/projects.html',
                    controller:'projectsCtrl'
                }
            }
        })

        .state('home/projectList', {
            url: 'projectList',
            views: {
                'main@home': {
                    templateUrl: 'views/project/projectList.html',
                    controller:'projectListCtrl'
                }
            }
        })

});
