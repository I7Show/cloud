package com.orcbit.shop.product;

import com.orcbit.core.exception.BusinessException;

public class ProductConstants {

    public static final BusinessException ERROR_PRODUCT_EXIST = new BusinessException(7001,"商品不存在");

    public static final BusinessException ERROR_PRODUCT_SKU = new BusinessException(7002,"商品规格有误");

    public static final BusinessException ERROR_PRODUCT_STATUS = new BusinessException(7003,"商品已下架");
    public static final BusinessException ERROR_CATEGORY_STATUS = new BusinessException(7004,"商品分类名称重复");

    public static final BusinessException ERROR_PRODUCT_NO_STOCK = new BusinessException(7005,"商品无库存");
    public static final BusinessException ERROR_PRODUCT_PARAMS = new BusinessException(7006,"商品参数有误");
    public static final BusinessException ERROR_PRODUCT_CODE = new BusinessException(7007,"商品编号已存在");
    public static final BusinessException ERROR_PRODUCT_EANCODE = new BusinessException(7008,"标准商品必须添加国家标准码！");
    public static final BusinessException ERROR_PRODUCT_PURCHASELIMITS = new BusinessException(7009,"商品购买数量已超过限购数量！");

    public static final BusinessException ERROR_CATEGORY_EXIST = new BusinessException(7010,"商品分类不存在");
    public static final BusinessException ERROR_CATEGORY_CODE = new BusinessException(7011,"该分类不能超过99个");

    public static final BusinessException ERROR_PARAMETERS = new BusinessException(7012,"参数错误");

}
