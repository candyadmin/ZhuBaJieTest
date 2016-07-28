/// <reference path="../framework/angular/angular.js" />

angular.module("engineerApp").directive("pagenation", [function () {
    return {
        restrict: "EA",
        templateUrl: "/views/pagination.html",
        replace: true,
        link: function (scope, ele, attrs) {
            scope.currentPage = 1;//当前页
            scope.count = 0;//记录总数
            scope.totalPage = 1;//总页数
            scope.pageSize = attrs.size;//分页大小
            scope.pages = [];//分页数组
            if (!scope[attrs.method]) {
                throw new Error('加载数据为定义！');
            }

            //下一页
            scope.next = function () {
                if (scope.currentPage < scope.totalPage) {
                    scope.currentPage++;
                    scope.getData();
                }
            };

            //上一页
            scope.prev = function () {
                if (scope.currentPage > 1) {
                    scope.currentPage--;
                    scope.getData();
                }
            };

            //获取数据
            scope.getData = function (page) {
                page && (scope.currentPage = page);
                scope[attrs.method](scope.currentPage, scope.pages, function (data) {
                    scope.totalPage = Math.ceil(data.count / scope.pageSize);
                    if (scope.currentPage > 1 && scope.currentPage < scope.totalPage) {
                        scope.pages = [
                            scope.currentPage - 1,
                            scope.currentPage,
                            scope.currentPage + 1
                        ];
                    } else if (scope.currentPage == 1 && scope.totalPage > 1) {
                        scope.page = [
                            scope.currentPage,
                            scope.currentPage + 1
                        ];
                    } else if (scope.currentPage == scope.totalPage && scope.totalPage > 1) {
                        scope.page = [
                            scope.currentPage - 1,
                            scope.currentPage
                        ];
                    }
                    scope.list = data.list;
                });
            };
            scope.getData();
        }
    }
}]);