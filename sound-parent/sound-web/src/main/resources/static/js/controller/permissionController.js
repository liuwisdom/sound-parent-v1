 //控制层 
app.controller('permissionController' ,function($scope,$controller   ,permissionService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		permissionService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}
	$scope.permissionList={data:[]};
	$scope.findForSelect2=function (){
		$scope.entity={};
		permissionService.findForSelect2().success(
			function(response){
				$scope.permissionList= {data:response};
			}
		);
	}
	
	//分页
	$scope.findPage=function(page,rows){			
		permissionService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		permissionService.findOne(id).success(
			function(response){
				$scope.entity=response
				$scope.entity.permissioParentid=JSON.parse(response.permissioParentid);
			}
		);				
	}
	
	//保存 
	$scope.save=function(){
		var serviceObject;//服务层对象
		$scope.entity.permissionParentid=JSON.stringify($scope.entity.permissionParentid);
		if($scope.entity.permissionId!=null){//如果有ID
			serviceObject=permissionService.update($scope.entity); //修改
		}else{
			serviceObject=permissionService.add($scope.entity);//增加
		}
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		permissionService.dele( $scope.selectIds ).success(
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
		permissionService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	
