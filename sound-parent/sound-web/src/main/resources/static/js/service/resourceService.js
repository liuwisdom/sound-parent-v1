//服务层
app.service('resourceService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../resource/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../resource/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../resource/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../resource/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../resource/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../resource/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../resource/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
