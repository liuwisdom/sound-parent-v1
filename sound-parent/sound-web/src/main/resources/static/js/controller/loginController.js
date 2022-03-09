// app.controller('loginController',function($scop,$controller,loginService){
//     $controller('baseController',{$scop:$scop});
//
//     $scop.login=function(entity){
//         alert('kkkkk'+entity)
//         // loginService.login(entity).success(
//         //     function(response){
//         //         alert(response.message)
//         //     })
//     }
// });

// app.controller('loginController' ,function($scope,$controller   ,loginService){
//     $controller('baseController',{$scop:$scop})//继承baseController
//     $scop.login=function(entity){
//         loginService.login(entity).success(
//
//             function(response){
//                 alert(response.message)
//             });
//     }
//
// });

app.controller('loginController' ,function($scope,$controller   ,loginService){
    $controller('baseController',{$scope:$scope});//继承
    $scope.entity={};
    //保存
    $scope.soundLogin=function(){
        alert("eeeee"+entity.userPhone);
        loginService.login($scope.entity ).success(
            function(response){
                alert(response.message);
            }
        );
    }

});