 //控制层 
app.controller('resourceController' ,function($scope,$controller   ,resourceService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		resourceService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}
	//定义下拉列表
	$scope.resourceList={data:[]};
	$scope.findForSelect2=function (){
		$scope.entity={};
		resourceService.findForSelect2().success(
			function(response){
				$scope.resourceList={data:response};
			}
		);
	}

	
	//分页
	$scope.findPage=function(page,rows){			
		resourceService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){
		$scope.findForSelect2();
		resourceService.findOne(id).success(
			function(response){
				$scope.entity= response;
				$scope.entity.resourceParentid=JSON.parse(response.resourceParentid)

			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
		$scope.entity.resourceParentid=JSON.stringify($scope.entity.resourceParentid);
		if($scope.entity.resourceId!=null){//如果有ID
			serviceObject=resourceService.update( $scope.entity ); //修改  
		}else{
			serviceObject=resourceService.add( $scope.entity  );//增加 
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
		resourceService.dele( $scope.selectIds ).success(
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
		resourceService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	
