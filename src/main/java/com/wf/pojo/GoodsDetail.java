package com.wf.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "goods_detail")
public class GoodsDetail  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "sort_id")
	private Integer sortId;

	private String name;

	private String address;

	private java.math.BigDecimal price;

	@Column(name = "create_date")
	private java.util.Date createDate;

	private Integer remaining;

}
