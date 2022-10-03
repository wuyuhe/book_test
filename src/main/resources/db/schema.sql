
CREATE TABLE `sys_user`(
`user_id` INTEGER AUTO_INCREMENT PRIMARY KEY
, `username` VARCHAR(255) COMMENT '用户名'
, `password` VARCHAR(255) COMMENT '用户密码'
, `salt` VARCHAR(255) COMMENT '盐'
, `status` INTEGER COMMENT '状态'
, `create_user_id` INTEGER COMMENT '创建人'
, `create_time` DATETIME COMMENT '创建时间'
, `name` VARCHAR(255) COMMENT '姓名'
);


CREATE TABLE `sys_user_token` (
  `user_id` INTEGER AUTO_INCREMENT PRIMARY KEY,
  `token` VARCHAR(255) COMMENT 'token',
  `expire_time` DATETIME COMMENT '过期时间' ,
  `update_time` DATETIME COMMENT '更新时间'
);


CREATE TABLE `sys_menu` (
  `menu_id` INTEGER AUTO_INCREMENT PRIMARY KEY,
  `parent_id` INTEGER,
  `name` VARCHAR(255) COMMENT '菜单名称',
  `url` VARCHAR(255) COMMENT '菜单URL',
  `perms` VARCHAR(500) COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` INTEGER COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` VARCHAR(255) COMMENT '菜单图标',
  `order_num` INTEGER COMMENT '排序'
);


CREATE TABLE `sys_log` (
  `id` INTEGER AUTO_INCREMENT PRIMARY KEY,
  `username` VARCHAR(50)  COMMENT '用户名',
  `operation` VARCHAR(50)  COMMENT '用户操作',
  `method` VARCHAR(200)  COMMENT '请求方法',
  `params` text COMMENT '请求参数',
  `time` INTEGER COMMENT '执行时长(毫秒)',
  `ip` VARCHAR(64)  COMMENT 'IP地址',
  `create_date` DATETIME  COMMENT '创建时间'
);


CREATE TABLE `book_msg` (
  `id` INTEGER AUTO_INCREMENT PRIMARY KEY,
  `create_time` DATETIME ,
  `book_id` VARCHAR(64) COMMENT '书籍ID',
  `name` VARCHAR(255) ,
  `price` DOUBLE  COMMENT '价格',
  `author` VARCHAR(255) COMMENT '作者',
  `status` INTEGER COMMENT '0表示未被借出、1表示借出、2表示损坏',
  `user_id` INTEGER  COMMENT '借阅人ID'
) ;


CREATE TABLE `sys_role_menu` (
  `id` INTEGER  AUTO_INCREMENT PRIMARY KEY,
  `role_id` INTEGER  COMMENT '角色ID',
  `menu_id` INTEGER  COMMENT '菜单ID'
);

CREATE TABLE `sys_role` (
  `role_id` INTEGER  AUTO_INCREMENT PRIMARY KEY,
  `role_name` VARCHAR(100)  COMMENT '角色名称',
  `remark` VARCHAR(100)  COMMENT '备注',
  `create_user_id` INTEGER  COMMENT '创建者ID',
  `create_time` DATETIME  COMMENT '创建时间'
);

CREATE TABLE `sys_user_role` (
  `id` INTEGER  AUTO_INCREMENT PRIMARY KEY,
  `user_id` INTEGER  COMMENT '用户ID',
  `role_id` INTEGER  COMMENT '角色ID'
);
