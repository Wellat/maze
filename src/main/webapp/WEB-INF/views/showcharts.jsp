<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
</head>
<script type="text/javascript" src="hemi/js/echarts.js"></script>
<script type="text/javascript" src="hemi/js/showChart.js"></script>
<script type="text/javascript" src="hemi/js/funnelView.js"></script>

<h3 class="page-title">
    Echarts 展示 <small>可视化图表</small>
</h3>
<div class="page-bar">
    <ul class="page-breadcrumb">
        <li>
            <i class="fa fa-home"></i>
            <a href="rest/page/dashboard">首页</a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li>
            <a href="#">展示</a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li>
            <a href="#">echarts</a>
        </li>
    </ul>
    <div class="page-toolbar">
        <div class="btn-group pull-right">
            <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
                Actions <i class="fa fa-angle-down"></i>
            </button>
            <ul class="dropdown-menu pull-right" role="menu">
                <li>
                    <a href="#">Action</a>
                </li>
                <li>
                    <a href="#">Another action</a>
                </li>
                <li>
                    <a href="#">Something else here</a>
                </li>
                <li class="divider">
                </li>
                <li>
                    <a href="#">Separated link</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-lg-6 col-sm-12 col-xs-12 col-sm-12">
        <div id="showChart" style="width:100%;height:600px;margin-left:0px;margin-right:6px;margin-bottom:8px;float:left;overflow:hidden;"></div>
    </div>

    <div class="col-lg-6 col-sm-12 col-xs-12 col-sm-12">
        <div id="showFunnelChart" style="width:100%;height:600px;margin-left:0px;margin-right:6px;margin-bottom:8px;float:left;overflow:hidden;"></div>
    </div>
</div>


