<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增日志</title>
<style>
	div{
		width:900px;
		margin: 0 auto;
	}
	.diary_type div{
		width: 300px;
	}
	/* .diary_type div:NTH-CHILD(1),.diary_type div:NTH-CHILD(2){
		display: inline-block;行级块级元素
	} */
	.diary_type div{
		float:left;
	}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/diaryServlet?method=add" method="post">
		<div>
			<p>
				<input type="text" name="diary_title" placeholder="请在这里输入日志标题" />
				<a href="${pageContext.request.contextPath}/diaryServlet">我的日志</a>
			</p>
			<p>
				<textarea name="diary_content" rows="10" cols="20"></textarea>
			</p>
			<div class="diary_type">
				<div>
					分类：<select name="diary_type">
							<option value="1">个人日记</option>
							<option value="2">我的乐志</option>
							<option value="3">人生感悟</option>
						</select>
				</div>
				<div>
					<button>发表</button>
				</div>
			</div>
		</div>
	</form>
</body>
</html>