package com.mapper;

import com.entity.OrderMaster;
import com.entity.OrderMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int countByExample(OrderMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int deleteByExample(OrderMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int insert(OrderMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int insertSelective(OrderMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    List<OrderMaster> selectByExample(OrderMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    OrderMaster selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int updateByExample(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int updateByPrimaryKeySelective(OrderMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_master
     *
     * @mbggenerated Sat Apr 20 14:27:59 CST 2019
     */
    int updateByPrimaryKey(OrderMaster record);
}