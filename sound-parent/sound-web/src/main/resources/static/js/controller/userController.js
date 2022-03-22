 //控制层 
app.controller('userController' ,function($scope,$controller   ,userService,roleService,groupService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取用户列表数据绑定到表单中
	$scope.findAll=function(){
		userService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}
	//读取组列表数据绑定到表单中
	$scope.addGroup=function(userid){
		//暂存用户id
		$scope.userId=userid;
		groupService.findAll().success(
			function(response){
				$scope.grouplist=response;
			}
		);
	}
	//读取组列表数据绑定到表单中
	$scope.viewGroup=function(userid){
		userService.findGroupOfUser(userid).success(
			function(response){
				$scope.viewGrouplist=response;
			}
		);
	}
	//读取角色列表数据绑定到表单中
	$scope.addRole=function(userid){
		//暂存用户id
		$scope.userId=userid;
		roleService.findAll().success(
			function(response){
				$scope.rolelist=response;
			}
		);
	}
	//读取角色列表数据绑定到表单中
	$scope.viewRole=function(userid){
		userService.findRoleOfUser(userid).success(
			function(response){
				$scope.viewRolelist=response;
			}
		);
	}
	
	//分页
	$scope.findPage=function(page,rows){			
		userService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		userService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){
	userService.add($scope.userId,$scope.selectIds).success(
			function(response){
				if(response.success){
					alert(response.message);
				}
			}		
		);				
	}
	//保存角色
	$scope.saveRole=function(){
	userService.addRole($scope.userId,$scope.selectIds).success(
			function(response){
				if(response.success){
					alert(response.message);
				}
			}
		);
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		userService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		userService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	
