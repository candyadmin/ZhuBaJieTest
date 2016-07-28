/// <reference path="../framework/angular/angular.js" />
'use strict';
angular.module("engineerApp").service("server", ["$http", function ($http) {
    var api = {};
    /**
     * 用户登录
     * @param {} name
     * @param {} pwd
     * @returns{}
     */
    api.login = function (name, pwd) {
        return $http.post("/data/logon.json", { "name": name, "pwd": pwd });
    }

    /**
     * 用户注册
     * @param {} name
     * @param {} pwd
     * @param {} type
     * @returns{}
     */
    api.register = function (name, pwd,type) {
        return $http.post("/data/logon.json", { "name": name, "pwd": pwd,"type":type });
    }

    /**
     * 获取项目类别
     */
    api.getProjectClass = function () {
        return $http.get("/data/projectclass.json");
    }

    /**
     * 获取专业类别
     */
    api.getMajorList = function () {
        return $http.get("/data/majorclass.json");
    }

    /**
     * 获取任务类型
     */
    api.getTaskClass = function () {
        return $http.get("/data/taskclass.json");
    }

    /**
     * 添加发布项目
     * @param {} datas
     * @returns
     */
    api.addProject = function (datas) {
        return $http.post("SubPro", {
            datas:datas
        });
    }

    /**
     * 添加项目任务
     * @param pid
     * @param {} tasks
     * @returns
     */
    api.addTasks = function (pid, tasks) {
        return $http.post("", {
            pid: pid,
            tasks: tasks
        });
    }

    /**
     * 获取项目
     * @param userid
     * @returns
     */
    api.getProList = function (userid) {
        //return $http.post("", {
        //    uid: userid
        //});
        return $http.get("/data/projectlist.json");
    }
    
    /**
     * 获取项目任务
     */
    api.getTaskList = function () {
        return $http.get("/data/tasklist.json");
    }
    return api;

}]);
