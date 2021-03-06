package com.neuedu.pojo;

import java.util.Date;

public class Cart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.cart_id
     *
     * @mbg.generated
     */
    private Integer cartId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.pro_id
     *
     * @mbg.generated
     */
    private Integer proId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.checked
     *
     * @mbg.generated
     */
    private Integer checked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.cart_id
     *
     * @return the value of cart.cart_id
     *
     * @mbg.generated
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.cart_id
     *
     * @param cartId the value for cart.cart_id
     *
     * @mbg.generated
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.user_id
     *
     * @return the value of cart.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.user_id
     *
     * @param userId the value for cart.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.pro_id
     *
     * @return the value of cart.pro_id
     *
     * @mbg.generated
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.pro_id
     *
     * @param proId the value for cart.pro_id
     *
     * @mbg.generated
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.quantity
     *
     * @return the value of cart.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.quantity
     *
     * @param quantity the value for cart.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.checked
     *
     * @return the value of cart.checked
     *
     * @mbg.generated
     */
    public Integer getChecked() {
        return checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.checked
     *
     * @param checked the value for cart.checked
     *
     * @mbg.generated
     */
    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.create_time
     *
     * @return the value of cart.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.create_time
     *
     * @param createTime the value for cart.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.update_time
     *
     * @return the value of cart.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.update_time
     *
     * @param updateTime the value for cart.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}