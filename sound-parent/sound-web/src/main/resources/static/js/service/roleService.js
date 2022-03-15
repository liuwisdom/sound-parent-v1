//服务层
app.service('roleService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('/role/findAll');
	}
	//读取角色数据绑定到多选框中
	this.findForSelect2=function(){
		return $http.get('/role/findForSelect2');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('/role/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('/role/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('/role/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('/role/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('/role/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('/role/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
