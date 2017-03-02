<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <link rel="stylesheet" type="text/css" href="hemi/css/wangEditor.css">

</head>
<body>
<form class="form-horizontal" id="addArticleForm" action="rest/cms/addArticle" method="post">
    <div class="form-group">
        <label for="title" class="col-sm-1 control-label">标&nbsp;题:</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" id="title" name="title" value=${ada.baseArticle.title}>
        </div>
        <label class="col-sm-2 control-label">文章类型:  </label>
        <label class="radio-inline">
            <input type="radio" name="typeid" id="typeid1" value="1" checked="checked"> 长文
        </label>
        <label class="radio-inline">
            <input type="radio" name="typeid" id="typeid2" value="2"> 快讯
        </label>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-1" for="contents" >内&nbsp;容:</label>
        <div class="col-sm-8 col-md-5 col-lg-9" style="width: 90%;">
            <textarea class="form-control" id="contents" name="content" aria-required="true" style="width: 90%;height: 500px;">${ada.baseArticle.content}</textarea>
        </div>
    </div>

    <%--<div id="edit">--%>
        <%--<p>请输入文章内容...</p>--%>
    <%--</div>--%>
    <div class="form-group">
        <label class="control-label col-sm-1">标&nbsp;签:  </label>
        <c:forEach var="tags" items="${tags}">
            <label class="checkbox-inline">
                <input type="checkbox" name="tagid" value=${tags.tid}> ${tags.tname}
            </label>
        </c:forEach>
    </div>
    </br></br>

    <div class="form-group">
        <div class="col-sm-offset-5 col-sm-5">
            <button type="reset" class="btn btn-default">重&nbsp;置</button>&nbsp;&nbsp;
            <a type="button" class="btn btn-primary" id="saveit">保&nbsp;存</a>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <%--<input type="checkbox" name="isShow" value="1"> 发 布--%>
            <label class="radio-inline">
                <input type="radio" name="isShow" value="1"> 发 布
            </label>
            <label class="radio-inline">
                <input type="radio" name="isShow" value="0" checked="checked"> 存草稿
            </label>
        </div>
    </div>
</form>

<script type="text/javascript">
    jQuery('#saveit').click(function() {
        jQuery('#addArticleForm').submit();
    });
</script>

<script type="text/javascript" src="assets/global/plugins/jquery.min.js"></script>
<script type="text/javascript" src="hemi/js/wangEditor.js"></script>

<script type="text/javascript">
    $(function () {
        var editor = new wangEditor('contents');
        editor.create();
    });
</script>
</body>
</html>
