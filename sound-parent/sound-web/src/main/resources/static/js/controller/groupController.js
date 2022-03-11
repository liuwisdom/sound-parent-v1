 //控制层 
app.controller('groupController' ,function($scope,$controller   ,groupService){	
	
	$controller('baseController',{$scope:$scope});//继承


    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		$scope.groupList={data:[]};//父组id列表
		groupService.selectForSelect2().success(
			function(response){
				$scope.groupList={data:response};
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		groupService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		groupService.findOne(id).success(
			function(response){
				$scope.entity= response;
				$scope.entity.groupParentid=JSON.parse($scope.entity.groupParentid);

			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
		$scope.entity.groupParentid=JSON.stringify($scope.entity.groupParentid);
		if($scope.entity.groupId!=null){//如果有ID
			serviceObject=groupService.update( $scope.entity ); //修改  
		}else{

			serviceObject=groupService.add( $scope.entity  );//增加 
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
		groupService.dele( $scope.selectIds ).success(
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
	 	groupService.search(page,rows,$scope.searchEntity).success(
	 		function(response){
	 			$scope.list=response.rows;
	 			$scope.paginationConf.totalItems=response.total;//更新总记录数
			}
	 	);
	 }

});	
