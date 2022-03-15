 //控制层 
app.controller('roleController' ,function($scope,$controller   ,roleService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		roleService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}
	$scope.roleList={data:[]}
	//读取j角色数据绑定到多选列表中
	$scope.findForSelect2=function(){
		//第二次点击新建时会出现上次的记录 这里做一下处理 清空entity
		$scope.entity={};
		roleService.findForSelect2().success(
			function(response){
				$scope.roleList={data:response};
			}
		);
	}
	
	//分页
	$scope.findPage=function(page,rows){			
		roleService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){
		$scope.findForSelect2();
		roleService.findOne(id).success(
			function(response){
				$scope.entity=response
				$scope.entity.roleParentid=JSON.parse(response.roleParentid);
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
		$scope.entity.roleParentid=JSON.stringify($scope.entity.roleParentid);
		if($scope.entity.roleId!=null){//如果有ID
			serviceObject=roleService.update($scope.entity); //修改
		}else{
			serviceObject=roleService.add($scope.entity);//增加
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
		roleService.dele( $scope.selectIds ).success(
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
		roleService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	
