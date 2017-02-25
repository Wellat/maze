<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
</head>
<body>
<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
<div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">Modal title</h4>
            </div>
            <div class="modal-body">
                Widget settings form goes here
            </div>
            <div class="modal-footer">
                <button type="button" class="btn blue">Save changes</button>
                <button type="button" class="btn default" data-dismiss="modal">Close</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
<!-- BEGIN STYLE CUSTOMIZER -->
<div class="theme-panel hidden-xs hidden-sm">
    <div class="toggler">
    </div>
    <div class="toggler-close">
    </div>
    <div class="theme-options">
        <div class="theme-option theme-colors clearfix">
						<span>
						THEME COLOR </span>
            <ul>
                <li class="color-default current tooltips" data-style="default" data-container="body" data-original-title="Default">
                </li>
                <li class="color-darkblue tooltips" data-style="darkblue" data-container="body" data-original-title="Dark Blue">
                </li>
                <li class="color-blue tooltips" data-style="blue" data-container="body" data-original-title="Blue">
                </li>
                <li class="color-grey tooltips" data-style="grey" data-container="body" data-original-title="Grey">
                </li>
                <li class="color-light tooltips" data-style="light" data-container="body" data-original-title="Light">
                </li>
                <li class="color-light2 tooltips" data-style="light2" data-container="body" data-html="true" data-original-title="Light 2">
                </li>
            </ul>
        </div>
        <div class="theme-option">
						<span>
						Layout </span>
            <select class="layout-option form-control input-sm">
                <option value="fluid" selected="selected">Fluid</option>
                <option value="boxed">Boxed</option>
            </select>
        </div>
        <div class="theme-option">
						<span>
						Header </span>
            <select class="page-header-option form-control input-sm">
                <option value="fixed" selected="selected">Fixed</option>
                <option value="default">Default</option>
            </select>
        </div>
        <div class="theme-option">
						<span>
						Top Menu Dropdown</span>
            <select class="page-header-top-dropdown-style-option form-control input-sm">
                <option value="light" selected="selected">Light</option>
                <option value="dark">Dark</option>
            </select>
        </div>
        <div class="theme-option">
						<span>
						Sidebar Mode</span>
            <select class="sidebar-option form-control input-sm">
                <option value="fixed">Fixed</option>
                <option value="default" selected="selected">Default</option>
            </select>
        </div>
        <div class="theme-option">
						<span>
						Sidebar Menu </span>
            <select class="sidebar-menu-option form-control input-sm">
                <option value="accordion" selected="selected">Accordion</option>
                <option value="hover">Hover</option>
            </select>
        </div>
        <div class="theme-option">
						<span>
						Sidebar Style </span>
            <select class="sidebar-style-option form-control input-sm">
                <option value="default" selected="selected">Default</option>
                <option value="light">Light</option>
            </select>
        </div>
        <div class="theme-option">
						<span>
						Sidebar Position </span>
            <select class="sidebar-pos-option form-control input-sm">
                <option value="left" selected="selected">Left</option>
                <option value="right">Right</option>
            </select>
        </div>
        <div class="theme-option">
						<span>
						Footer </span>
            <select class="page-footer-option form-control input-sm">
                <option value="fixed">Fixed</option>
                <option value="default" selected="selected">Default</option>
            </select>
        </div>
    </div>
</div>
<!-- END STYLE CUSTOMIZER -->
<!-- BEGIN PAGE HEADER-->
<h3 class="page-title">
    系统管理 <small>managed datatable samples</small>
</h3>
<div class="page-bar">
    <ul class="page-breadcrumb">
        <li>
            <i class="fa fa-home"></i>
            <a href="rest/page/dashboard">首页</a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li>
            <a href="#">系统管理</a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li>
            <a href="#">商品管理</a>
        </li>
    </ul>
    <%--<div class="page-toolbar">
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
    </div>--%>
</div>
<!-- END PAGE HEADER-->
<!-- BEGIN PAGE CONTENT-->
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN EXAMPLE TABLE PORTLET-->
        <div class="portlet box grey-cascade">
            <div class="portlet-title">
                <div class="caption">
                    <i class="fa fa-globe"></i>Managed Table
                </div>
                <div class="tools">
                    <a href="javascript:;" class="collapse">
                    </a>
                    <a href="#portlet-config" data-toggle="modal" class="config">
                    </a>
                    <a href="javascript:;" class="reload">
                    </a>
                    <a href="javascript:;" class="remove">
                    </a>
                </div>
            </div>
            <div class="portlet-body">
                <div class="table-toolbar">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="btn-group">
                                <button id="sample_editable_1_new" class="btn green">
                                    Add New <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="btn-group pull-right">
                                <button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i class="fa fa-angle-down"></i>
                                </button>
                                <ul class="dropdown-menu pull-right">
                                    <li>
                                        <a href="javascript:;">
                                            Print </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;">
                                            Save as PDF </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;">
                                            Export to Excel </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-bordered table-hover" id="sample_1">
                    <thead>
                    <tr>
                        <th class="table-checkbox">
                            <input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes"/>
                        </th>
                        <th>
                            Username
                        </th>
                        <th>
                            Email
                        </th>
                        <th>
                            Points
                        </th>
                        <th>
                            Joined
                        </th>
                        <th>
                            Status
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            shuxer
                        </td>
                        <td>
                            <a href="mailto:shuxer@gmail.com">
                                shuxer@gmail.com </a>
                        </td>
                        <td>
                            120
                        </td>
                        <td class="center">
                            12 Jan 2012
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            looper
                        </td>
                        <td>
                            <a href="mailto:looper90@gmail.com">
                                looper90@gmail.com </a>
                        </td>
                        <td>
                            120
                        </td>
                        <td class="center">
                            12.12.2011
                        </td>
                        <td>
									<span class="label label-sm label-warning">
									Suspended </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            userwow
                        </td>
                        <td>
                            <a href="mailto:userwow@yahoo.com">
                                userwow@yahoo.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            user1wow
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                userwow@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-default">
									Blocked </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            restest
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                test@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            foopl
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            19.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            weep
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            19.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            coop
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            19.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            pppol
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            19.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            test
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            19.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            userwow
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                userwow@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-default">
									Blocked </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            test
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                test@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            goop
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            weep
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            15.11.2011
                        </td>
                        <td>
									<span class="label label-sm label-default">
									Blocked </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            toopl
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            16.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            userwow
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                userwow@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            9.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-default">
									Blocked </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            tes21t
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                test@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            14.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            fop
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            13.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-warning">
									Suspended </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            kop
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            17.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            vopl
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            19.11.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            userwow
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                userwow@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-default">
									Blocked </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            wap
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                test@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            12.12.2012
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            test
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            19.12.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            toop
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            17.12.2010
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    <tr class="odd gradeX">
                        <td>
                            <input type="checkbox" class="checkboxes" value="1"/>
                        </td>
                        <td>
                            weep
                        </td>
                        <td>
                            <a href="mailto:userwow@gmail.com">
                                good@gmail.com </a>
                        </td>
                        <td>
                            20
                        </td>
                        <td class="center">
                            15.11.2011
                        </td>
                        <td>
									<span class="label label-sm label-success">
									Approved </span>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <!-- END EXAMPLE TABLE PORTLET-->
    </div>
</div>
<!-- END PAGE CONTENT-->

<script src="assets/admin/pages/scripts/table-managed.js"></script>
<script>
    jQuery(document).ready(function() {
        TableManaged.init();
    });
</script>


</body>
</html>