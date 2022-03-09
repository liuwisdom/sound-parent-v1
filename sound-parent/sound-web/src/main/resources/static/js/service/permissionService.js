//服务层
app.service('permissionService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../permission/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../permission/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../permission/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../permission/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../permission/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../permission/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../permission/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
