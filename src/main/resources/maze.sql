/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : factor

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-02-26 20:24:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cms_article
-- ----------------------------
DROP TABLE IF EXISTS `cms_article`;
CREATE TABLE `cms_article` (
  `aid` int(11) NOT NULL,
  `typeid` int(11) DEFAULT NULL,
  `tagid1` int(11) DEFAULT NULL,
  `tagid2` int(11) DEFAULT NULL,
  `tagid3` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_check` int(11) DEFAULT NULL,
  `is_show` int(11) DEFAULT NULL,
  `allow_comment` int(11) DEFAULT NULL,
  `comment_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`aid`),
  KEY `article_type` (`typeid`),
  KEY `article_tag1` (`tagid1`),
  CONSTRAINT `article_tag1` FOREIGN KEY (`tagid1`) REFERENCES `cms_article_tag` (`tid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `article_type` FOREIGN KEY (`typeid`) REFERENCES `cms_article_type` (`tyid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cms_article
-- ----------------------------

-- ----------------------------
-- Table structure for cms_article_tag
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_tag`;
CREATE TABLE `cms_article_tag` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cms_article_tag
-- ----------------------------

-- ----------------------------
-- Table structure for cms_article_type
-- ----------------------------
DROP TABLE IF EXISTS `cms_article_type`;
CREATE TABLE `cms_article_type` (
  `tyid` int(11) NOT NULL,
  `tyname` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`tyid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cms_article_type
-- ----------------------------

-- ----------------------------
-- Table structure for ec_bar
-- ----------------------------
DROP TABLE IF EXISTS `ec_bar`;
CREATE TABLE `ec_bar` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `years` int(4) DEFAULT NULL,
  `monthes` int(2) DEFAULT NULL,
  `evaporation` float(5,2) DEFAULT NULL,
  `rainfall` float(5,2) DEFAULT NULL,
  `avgtemp` float(5,2) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of ec_bar
-- ----------------------------
INSERT INTO `ec_bar` VALUES ('1', '2014', '1', '2.00', '2.60', '2.00');
INSERT INTO `ec_bar` VALUES ('2', '2014', '2', '4.90', '5.90', '2.20');
INSERT INTO `ec_bar` VALUES ('3', '2014', '3', '7.00', '9.00', '3.30');
INSERT INTO `ec_bar` VALUES ('4', '2014', '4', '23.20', '26.40', '4.50');
INSERT INTO `ec_bar` VALUES ('5', '2014', '5', '25.60', '28.70', '6.30');
INSERT INTO `ec_bar` VALUES ('6', '2014', '6', '76.70', '70.70', '10.20');
INSERT INTO `ec_bar` VALUES ('7', '2014', '7', '135.60', '175.60', '20.30');
INSERT INTO `ec_bar` VALUES ('8', '2014', '8', '162.20', '182.20', '23.40');
INSERT INTO `ec_bar` VALUES ('9', '2014', '9', '32.60', '48.70', '23.00');
INSERT INTO `ec_bar` VALUES ('10', '2014', '10', '20.00', '18.80', '16.50');
INSERT INTO `ec_bar` VALUES ('11', '2014', '11', '6.40', '6.00', '12.00');
INSERT INTO `ec_bar` VALUES ('12', '2014', '12', '3.30', '2.30', '6.20');

-- ----------------------------
-- Table structure for ec_funnel
-- ----------------------------
DROP TABLE IF EXISTS `ec_funnel`;
CREATE TABLE `ec_funnel` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fvalue` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of ec_funnel
-- ----------------------------
INSERT INTO `ec_funnel` VALUES ('1', '访问', '60');
INSERT INTO `ec_funnel` VALUES ('2', '咨询', '30');
INSERT INTO `ec_funnel` VALUES ('3', '订单', '10');
INSERT INTO `ec_funnel` VALUES ('4', '点击', '80');
INSERT INTO `ec_funnel` VALUES ('5', '展现', '100');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '资源名称',
  `type` varchar(32) NOT NULL COMMENT '资源类型：menu,button,',
  `url` varchar(128) DEFAULT NULL COMMENT '访问url地址',
  `percode` varchar(128) DEFAULT NULL COMMENT '权限代码字符串',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父结点id',
  `parentids` varchar(128) DEFAULT NULL COMMENT '父结点id列表串',
  `sortstring` varchar(128) DEFAULT NULL COMMENT '排序号',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  `icon` varchar(128) DEFAULT NULL COMMENT '图标',
  `style` varchar(128) DEFAULT NULL COMMENT '样式',
  `obiligate` varchar(128) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '权限', '', '', 'user:create', '0', '0/', '0', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('10', '点我', 'menu', null, 'super_admin', null, null, null, null, 'fa fa-rss-square', null, null);
INSERT INTO `sys_permission` VALUES ('11', '点我', 'menu', 'rest/page/echart', 'user:create', '10', '11', null, null, null, null, null);
INSERT INTO `sys_permission` VALUES ('12', '测试页面', 'menu', 'rest/page/test', 'user:create', '10', '12', null, null, null, null, null);
INSERT INTO `sys_permission` VALUES ('30', '系统管理', 'menu', null, 'super_admin', null, null, null, null, 'fa fa-gears', null, null);
INSERT INTO `sys_permission` VALUES ('31', '商品管理', 'menu', 'rest/form/tableTemplate', 'user:create', '30', '31', '1.', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('32', '用户管理', 'menu', 'rest/form/userManage', 'super_admin', '30', '32', '2.', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('33', '权限管理', 'menu', 'rest/page/test', 'super_admin', '30', '33', null, null, null, null, null);
INSERT INTO `sys_permission` VALUES ('50', '个人中心', 'menu', null, 'user:create', null, null, null, '1', 'fa fa-user', null, null);
INSERT INTO `sys_permission` VALUES ('51', '信息修改', 'menu', 'rest/page/baidu', 'user:create', '50', '51', null, '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('52', '密码修改', 'menu', 'rest/page/test', 'user:create', '50', '52', null, null, null, null, null);
INSERT INTO `sys_permission` VALUES ('112', '商品新增', 'permission', '/item/add.action', 'item:create', '11', '0/1/11/', '', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('113', '商品修改', 'permission', '/item/editItem.action', 'item:update', '11', '0/1/11/', '', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('114', '商品删除', 'permission', '', 'item:delete', '11', '0/1/11/', '', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('115', '商品查询', 'permission', '/item/queryItem.action', 'item:query', '11', '0/1/15/', null, '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('212', '用户新增', 'permission', '', 'user:create', '21', '0/1/21/', '', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('213', '用户修改', 'permission', '', 'user:update', '21', '0/1/21/', '', '1', null, null, null);
INSERT INTO `sys_permission` VALUES ('214', '用户删除', 'permission', '', 'user:delete', '21', '0/1/21/', '', '1', null, null, null);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(36) NOT NULL,
  `name` varchar(128) NOT NULL,
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('admin', '管理员', '1');
INSERT INTO `sys_role` VALUES ('superadmin', '超级管理员', '1');
INSERT INTO `sys_role` VALUES ('user', '普通用户', '1');
INSERT INTO `sys_role` VALUES ('vipuser', 'VIP用户', '1');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` varchar(36) NOT NULL,
  `sys_role_id` varchar(32) NOT NULL COMMENT '角色id',
  `sys_permission_id` varchar(32) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('rp01', 'admin', '10');
INSERT INTO `sys_role_permission` VALUES ('rp02', 'admin', '11');
INSERT INTO `sys_role_permission` VALUES ('rp03', 'admin', '12');
INSERT INTO `sys_role_permission` VALUES ('rp04', 'admin', '30');
INSERT INTO `sys_role_permission` VALUES ('rp05', 'admin', '31');
INSERT INTO `sys_role_permission` VALUES ('rp06', 'admin', '32');
INSERT INTO `sys_role_permission` VALUES ('rp07', 'admin', '33');
INSERT INTO `sys_role_permission` VALUES ('rp08', 'admin', '50');
INSERT INTO `sys_role_permission` VALUES ('rp09', 'admin', '51');
INSERT INTO `sys_role_permission` VALUES ('rp10', 'admin', '52');
INSERT INTO `sys_role_permission` VALUES ('rp11', 'user', '10');
INSERT INTO `sys_role_permission` VALUES ('rp12', 'user', '11');
INSERT INTO `sys_role_permission` VALUES ('rp13', 'user', '12');
INSERT INTO `sys_role_permission` VALUES ('rp14', 'user', '50');
INSERT INTO `sys_role_permission` VALUES ('rp15', 'user', '51');
INSERT INTO `sys_role_permission` VALUES ('rp16', 'user', '52');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `usercode` varchar(32) NOT NULL COMMENT '账号',
  `username` varchar(64) NOT NULL COMMENT '姓名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐',
  `locked` char(1) DEFAULT NULL COMMENT '账号是否锁定，1：锁定，0未锁定',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('123', 'lihao', '第一个测试', '123456', 'sdfsa', '1');
INSERT INTO `sys_user` VALUES ('212', 'dsfaf', '吕秀才', '123456', null, null);
INSERT INTO `sys_user` VALUES ('3091b158d3b9', 'frguo', '郭芙蓉', '123456', 'f8c8a', '1');
INSERT INTO `sys_user` VALUES ('ua01', 'admin', '佟掌柜', '123456', 'uiwueylm', '0');
INSERT INTO `sys_user` VALUES ('ut01', 'user', '小鱼儿', '123456', 'sdfafd', '0');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` varchar(36) NOT NULL,
  `sys_user_id` varchar(32) NOT NULL,
  `sys_role_id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('232323', '123', 'vipuser');
INSERT INTO `sys_user_role` VALUES ('f2f3c6ff6d2f', '3091b158d3b9', 'admin');
INSERT INTO `sys_user_role` VALUES ('ur01', 'ua01', 'admin');
INSERT INTO `sys_user_role` VALUES ('ur02', 'ut01', 'user');
INSERT INTO `sys_user_role` VALUES ('urtest', '212', 'user');
