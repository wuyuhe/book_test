package io.custom.modules.book.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 图书管理
 *
 * @author Mark yuhe
 */
@Data
@TableName("book_msg")
public class BookMsgEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId
	private Long id;
	//创建时间
	@ApiModelProperty(value = "用户名",example = "2022-10-01 18:00:00")
	private Date createTime;
	//图书编码
	@ApiModelProperty("图书编码")
	private String bookId;
	//图书名
	@ApiModelProperty("图书名")
	private String name;
	//价格
	@ApiModelProperty("价格")
	private Double price;
	//作者
	@ApiModelProperty("作者")
	private String author;
	//'0表示未被借出、1表示借出、2表示损坏',
	@ApiModelProperty("状态")
	private Integer status;
	//借出人ID
	@ApiModelProperty("借阅人")
	private Long userId;



}
