package com.pd.mapper;

import com.pd.pojo.PdItemParamItem;
import com.pd.pojo.PdItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdItemParamItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    long countByExample(PdItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int deleteByExample(PdItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int insert(PdItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int insertSelective(PdItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    List<PdItemParamItem> selectByExampleWithBLOBs(PdItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    List<PdItemParamItem> selectByExample(PdItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    PdItemParamItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") PdItemParamItem record, @Param("example") PdItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") PdItemParamItem record, @Param("example") PdItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByExample(@Param("record") PdItemParamItem record, @Param("example") PdItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByPrimaryKeySelective(PdItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(PdItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByPrimaryKey(PdItemParamItem record);
}