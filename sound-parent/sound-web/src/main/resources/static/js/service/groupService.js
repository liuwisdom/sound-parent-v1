//服务层
app.service('groupService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('/group/findAll');
	}

	//读取列表数据绑定到表单中
	this.selectForSelect2=function(){
		return $http.get('/group/groupList');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('/group/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('/group/findOne?groupId='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('/group/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('/group/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('/group/delete?ids='+ids);
	}
	//搜索
	 this.search=function(page,rows,searchEntity){
		return $http.post('/group/search?page='+page+"&rows="+rows, searchEntity);
	 }
});
