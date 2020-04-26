/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.17-log : Database - dbboss
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dbboss` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `dbboss`;

/*Table structure for table `company` */

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `id` int(11) NOT NULL,
  `count` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `employee` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `hot` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `inc` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `location` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `logo` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `size` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `company` */

insert  into `company`(`id`,`count`,`employee`,`hot`,`inc`,`location`,`logo`,`name`,`size`,`type`) values (1,'500','1000人以上','资深开放产品技术工程师','蚂蚁金融服务集团(以下称\"蚂蚁金服\")起步于2004年成立的支付宝2014年10月','上海新浦东区','https://www.itying.com/images/flutter/1.png','杭州蚂蚁金服信息技术有限公司  ','B论','互联网'),(2,'1000','500人以上','全栈工程师','蚂蚁金融服务集团(以下称\"蚂蚁金服\")起步于2004年成立的支付宝2014年10月','广州天河区','https://www.itying.com/images/flutter/2.png','百度信息技术有限公司  ','C论','互联网'),(3,'200','200人以上','数据挖掘工程师','蚂蚁金融服务集团(以下称\"蚂蚁金服\")起步于2004年成立的支付宝2014年10月','深圳南山区','https://www.itying.com/images/flutter/3.png','腾讯科有限公司  ','D论','互联网'),(4,'1500','1500人以上','资深架构师','蚂蚁金融服务集团(以下称\"蚂蚁金服\")起步于2004年成立的支付宝2014年10月','北京海淀区','https://www.itying.com/images/flutter/4.png','字节跳动科技有限公司','D论','互联网');

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (15),(15);

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` int(11) NOT NULL,
  `companyname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `headportraiturl` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `jobname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `msg` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `nickname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `message` */

insert  into `message`(`id`,`companyname`,`headportraiturl`,`jobname`,`msg`,`nickname`) values (1,'百度','https://www.itying.com/images/flutter/1.png','HR','你好','小可爱'),(2,'腾讯','https://www.itying.com/images/flutter/2.png','人事主管','在吗','漩涡鸣人'),(3,'字节跳动','https://www.itying.com/images/flutter/3.png','人事经理','最近在找工作吗','雨落之后'),(4,'37互娱','https://www.itying.com/images/flutter/4.png','人事助理','你好 在吗？','马小玲');

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `id` int(11) NOT NULL,
  `cname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `salary` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `size` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `position` */

insert  into `position`(`id`,`cname`,`name`,`salary`,`size`,`title`,`username`) values (4,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(5,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(6,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(7,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(8,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(9,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(10,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(11,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(12,'今日头条','资深安卓工程师','40K-60K','D轮','HR','Kimi'),(13,'银汉游戏','移动端架构师','15K-20K','B轮','人事主管','刘丽'),(14,'37互娱','Java工程师','25K-30K','D轮','HR-M','Reiki');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `sex` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
