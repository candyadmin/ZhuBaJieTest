/// <reference path="../framework/angular/angular.js" />
'use strict';
angular.module("engineerApp").service("common", [function () {
    var api = {};
    
    /**
     * 从服务器取回的Json中DateTime的毫秒数（如： /Date(1460390400000)/）转换成 DateTime 类型
     */
    api.convertDateTime = function (dateTime) {
        if (dateTime) {
            return new Date(parseInt(dateTime.replace("/Date(", "").replace(")/", ""), 10));
        }
        return dateTime;
    }

    return api;
}])