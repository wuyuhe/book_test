

package io.custom.common.utils;


/**
 * 常量
 *
 * @author Mark yuhe
 */
public class Constant {
    /**
     * 超级管理员ID
     */
    public static final int SUPER_ADMIN = 1;
    /**
     * 当前页码
     */
    public static final String PAGE = "page";
    /**
     * 每页显示记录数
     */
    public static final String LIMIT = "limit";
    /**
     * 排序字段
     */
    public static final String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    public static final String ORDER = "order";
    /**
     * 升序
     */
    public static final String ASC = "asc";

    /**
     * 菜单类型
     * @author yuhe
     */
    public enum MenuType {
        /**
         * 目录
         */
        CATALOG(0),
        /**
         * 菜单
         */
        MENU(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private int value;

        MenuType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * 图书状态
     * @author yuhe
     */
    public enum BookMsgStatus {
        /**
         * 正常
         */
        NORMAL(0),
        /**
         * 借出
         */
        LEND(1),
        /**
         * 异常
         */
        ABNORMAL(2);

        private int value;

        BookMsgStatus(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }





}
