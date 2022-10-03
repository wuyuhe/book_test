INSERT INTO `sys_user` VALUES ('1', 'admin', '9ec9750e709431dad22365cabc5c625482e574c74adaebba7dd02f1129e4ce1d', 'YzcmCZNvbXocrsz9dm8e', '1', '1', '2022-10-01 11:11:11', '管理员');

INSERT INTO `book_msg` VALUES ('1', '2022-10-01 15:40:23', 'IT_001', 'JAVA程序设计', '10.50', '张三', '0', null);
INSERT INTO `book_msg` VALUES ('2', '2022-10-01 16:11:11', 'IT_002', '数据结构和算法', '10.20', '张三', '0', null);
INSERT INTO `book_msg` VALUES ('3', '2022-10-01 16:11:46', 'IT_003', 'Linux操作系统', '10.20', '张三', '0', null);
INSERT INTO `book_msg` VALUES ('4', '2022-10-01 16:12:33', 'IT_004', '网络工程原理', '10.20', '张三', '0', null);
INSERT INTO `book_msg` VALUES ('5', '2022-10-01 16:14:10', 'IT_005', '计算机组成原理', '10.20', '张三', '0', null);

INSERT INTO `sys_log` VALUES ('1', 'admin', '保存图书', 'io.custom.modules.book.controller.BookMsgController.save()', '[{\"id\":2,\"createTime\":\"Oct 1, 2022 4:11:10 PM\",\"bookId\":\"ddd_123\",\"name\":\"测试\",\"price\":10.2,\"author\":\"123\",\"status\":0}]', '16', '127.0.0.1', '2022-10-01 16:11:11');


INSERT INTO `sys_menu` VALUES ('1', '0', '系统管理', null, null, '0', null, '100');
INSERT INTO `sys_menu` VALUES ('2', '1', '用户管理', 'sys/user', null, '1', null, '1');
INSERT INTO `sys_menu` VALUES ('3', '1', '角色管理', 'sys/role', null, '1', null, '2');
INSERT INTO `sys_menu` VALUES ('4', '1', '菜单管理', 'sys/menu', null, '1', null, '3');
INSERT INTO `sys_menu` VALUES ('15', '2', '查看', null, 'sys:user:list,sys:user:info', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('16', '2', '新增', null, 'sys:user:save,sys:role:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('17', '2', '修改', null, 'sys:user:update,sys:role:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('18', '2', '删除', null, 'sys:user:delete', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('19', '3', '查看', null, 'sys:role:list,sys:role:info', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('20', '3', '新增', null, 'sys:role:save,sys:menu:list', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('21', '3', '修改', null, 'sys:role:update,sys:menu:list', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('22', '3', '删除', null, 'sys:role:delete', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('23', '4', '查看', null, 'sys:menu:list,sys:menu:info', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('24', '4', '新增', null, 'sys:menu:save,sys:menu:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('25', '4', '修改', null, 'sys:menu:update,sys:menu:select', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('26', '4', '删除', null, 'sys:menu:delete', '2', null, '0');
INSERT INTO `sys_menu` VALUES ('27', '1', '参数管理', 'sys/config', 'sys:config:list,sys:config:info,sys:config:save,sys:config:update,sys:config:delete', '1', null, '6');
INSERT INTO `sys_menu` VALUES ('29', '1', '系统日志', 'sys/log', 'sys:log:list', '1', null, '7');
INSERT INTO `sys_menu` VALUES ('30', '1', '图书信息', 'book/msg', null, '1', null, '1');
INSERT INTO `sys_menu` VALUES ('31', '30', '查看', '', 'book:msg:list', '2', '', '0');
INSERT INTO `sys_menu` VALUES ('32', '30', '新增', '', 'book:msg:save', '2', '', '0');
INSERT INTO `sys_menu` VALUES ('33', '30', '修改', '', 'book:msg:update', '2', '', '0');
INSERT INTO `sys_menu` VALUES ('34', '30', '删除', '', 'book:msg:delete', '2', '', '0');
