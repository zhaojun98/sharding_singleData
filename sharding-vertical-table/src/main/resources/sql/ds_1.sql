/*
 Navicat Premium Data Transfer

 Source Server         : localhost_本地
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : ds_1

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 23/03/2024 15:44:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for loudong
-- ----------------------------
DROP TABLE IF EXISTS `loudong`;
CREATE TABLE `loudong` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `city` varchar(20) NOT NULL,
  `region` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `ld_num` varchar(10) NOT NULL,
  `unit_num` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=977994286148616234 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loudong
-- ----------------------------
BEGIN;
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616224, '深圳', '宝安', '李四妨害风化', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616225, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616226, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616227, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616228, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616229, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616230, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616231, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616232, '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (977994286148616233, '深圳', '宝安', '李四', 'A', '2');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `city` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
