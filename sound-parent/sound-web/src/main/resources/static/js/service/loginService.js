app.service('loginService',function ($http) {
    this.login=function (entity) {
        return $http.post('../sound/login',entity)
    }
});