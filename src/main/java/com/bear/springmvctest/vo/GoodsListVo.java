package com.bear.springmvctest.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 烟草商品表(YcGoods)实体类
 *
 * @author bear
 * @since 2020-08-08 00:26:20
 */

@Data
public class GoodsListVo {

    private Integer id;
    /**
     * 烟草条码
     */
    private String barCode;
    /**
     * 品名
     */
    private String goodsName;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 品类
     */
    private String category;
    /**
     * 零售价(盒包装)
     */
    private BigDecimal price;
    /**
     * 零售价(条包装)
     */
    private BigDecimal itemPrice;
    /**
     * 产地
     */
    private String origin;
    /**
     * 产地id
     */
    private Integer originId;
    /**
     * 生产年份
     */
    private String productionYear;
    /**
     * 香烟类型
     */
    private String goodsType;
    /**
     * 焦油量
     */
    private String tar;
    /**
     * 计价单位(盒包装)
     */
    private String unit;
    /**
     * 期数
     */
    private String periodNum;
    /**
     * 物价员
     */
    private String priceClerk;
    /**
     * 商品条码(条包装)
     */
    private String itemBarCode;
    /**
     * 备注
     */
    private String remark;
    /**
     * 省id
     */
    private Integer provinceId;
    /**
     * 市id
     */
    private Integer cityId;
    /**
     * 区id
     */
    private Integer areaId;
    /**
     * 街道id
     */
    private Integer streetId;
    /**
     * 创建者id
     */
    private Integer createId;
    /**
     * 更新者id
     */
    private Integer updateId;
    /**
     * 创建时间
     */
    private Integer createTime;
    /**
     * 更新时间
     */
    private Integer updateTime;
    /**
     * 1；已删除；0；未删除；
     */
    private Byte isDelete;
    /**
     * 计价单位(条包装)
     */
    private String itemUnit;
    /**
     * 类别
     */
    private String cat;
    /**
     * 规格
     */
    private String standards;
    /**
     * 成本价
     */
    private BigDecimal costPrice;
}