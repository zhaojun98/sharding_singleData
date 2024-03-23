/*
 Navicat Premium Data Transfer

 Source Server         : localhost_本地
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : ds_0

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 23/03/2024 15:44:43
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loudong
-- ----------------------------
BEGIN;
INSERT INTO `loudong` (`id`, `city`, `region`, `name`, `ld_num`, `unit_num`) VALUES (1, '成都', '使肌肤', '东京教父', '45', '78');
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
) ENGINE=InnoDB AUTO_INCREMENT=978322432223870977 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431192072193, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431275958272, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431284346881, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431296929792, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431305318401, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431317901312, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431334678529, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431343067136, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431355650049, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431364038656, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431385010177, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431393398784, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431401787393, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431414370304, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431426953217, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431439536128, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431452119041, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431460507648, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431464701953, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431473090560, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431481479169, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431494062080, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431502450689, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431523422208, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431531810817, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431536005120, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431544393729, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431552782336, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431565365249, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431573753856, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431590531073, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431598919680, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431607308289, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431615696896, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431632474113, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431640862720, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431649251329, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431666028544, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431674417153, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431682805760, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431699582977, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431707971584, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431716360193, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431720554496, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431737331713, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431745720320, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431754108929, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431766691840, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431779274753, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431787663360, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431804440577, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431817023488, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431825412097, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431833800704, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431846383617, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431854772224, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431863160833, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431875743744, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431884132353, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431892520960, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431900909569, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431917686784, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431930269697, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431942852608, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431951241217, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431955435520, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431959629825, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431972212736, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431980601345, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431988989952, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322431993184257, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432001572864, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432009961473, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432014155776, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432022544385, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432026738688, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432035127297, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432039321600, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432047710209, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432051904512, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432064487425, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432068681728, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432072876033, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432093847552, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432106430465, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432114819072, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432119013377, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432131596288, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432139984897, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432152567808, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432160956417, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432165150720, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432169345025, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432177733632, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432186122241, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432194510848, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432202899457, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432211288064, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432219676673, '深圳', '李四');
INSERT INTO `user` (`id`, `city`, `name`) VALUES (978322432223870976, '深圳', '李四');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
