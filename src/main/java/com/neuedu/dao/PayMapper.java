package com.neuedu.dao;

import com.neuedu.pojo.Pay;
import java.util.List;

public interface PayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated
     */
    int insert(Pay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated
     */
    Pay selectByPrimaryKey(Integer payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated
     */
    List<Pay> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Pay record);
}