package com.smzdm.basemapper;


import com.smzdm.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 26 22:57:59 CST 2018
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 26 22:57:59 CST 2018
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 26 22:57:59 CST 2018
     */
    Category selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 26 22:57:59 CST 2018
     */
    List<Category> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.category
     *
     * @mbg.generated Fri Jan 26 22:57:59 CST 2018
     */
    int updateByPrimaryKey(Category record);
}