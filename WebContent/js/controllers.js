/// <reference path="../framework/angular/angular.js" />
'use strict';
var engineer = angular.module('engineer', []);
engineer.controller("loginCtrl", ["$scope", "server", function ($scope, server) {
    var vm = $scope.vm = {
        logname: "123",
        pwd:"111"
    };
    vm.logon = function () {
        server.login(vm.logname, vm.pwd).success(function (result) {
            if (result.Status == 1)
                alert("登录成功！");
            else
                alert(result.ErrMsg);
        })
    }
    
}]);

engineer.controller("registerCtrl", ["$scope", "server", function ($scope, server) {
    var vm = $scope.vm = {
        logname: "135",
        pwd: "111"
    };
    vm.reg = function () {
        server.register(vm.logname, vm.pwd, 1).success(function (result) {
            if (result.Status == 1)
                alert("注册成功！");
            else
                alert(result.ErrMsg);
        })
    }
}]);

engineer.controller("projectPubCtrl", ["$scope", "server", function ($scope, server) {
    var vm = $scope.vm = {
        
        pinfo: {},
        taskClassDatas: [],
        taskClass: {},
        taskDatas: [],
        task: {},
        taskMoney:0
        
    };
    server.getProjectClass().success(function (result) {
        vm.pinfo.classDatas = result;
    });
    server.getMajorList().success(function (result) {
        vm.pinfo.majorDatas = result;
    });
    server.getTaskClass().success(function (result) {
        vm.taskClassDatas = result;
    });

    vm.addTask = function () {
        if (vm.taskClass.TaskName == null) {
            alert("请选择任务类型！");
            return;
        }
        var task = { ID: vm.taskClass.ID, TaskName: vm.taskClass.TaskName, TaskRate: vm.taskMoney };
        vm.taskDatas.push(task);
        vm.taskMoney = 0;
    };

    vm.removeTask = function (data) {
        var id = data.ID;
        var index = vm.taskDatas.indexOf(data);
        vm.taskDatas.splice(index, 1);
    };

    vm.addProject = function () {
        server.addProject(vm.pinfo).success(function (result) {
            if (reslut.Status == 1) {
                vm.pinfo = {};
                server.addTasks(result.ID, vm.taskDatas).success(function (res) {
                    if (res.Staus == 1) {
                        vm.taskDatas = {};
                    } else {
                        alert(res.ErrMsg);
                    }
                })
            } else {
                alert(result.ErrMsg);
            }
        })
    }
}])

engineer.controller('projectsCtrl', ["$scope", "server", function ($scope, server) {
    var vm = $scope.vm = {
        projectlist:[]
    }
    server.getProList().success(function (result) {
        vm.projectlist = result;
    })
}])