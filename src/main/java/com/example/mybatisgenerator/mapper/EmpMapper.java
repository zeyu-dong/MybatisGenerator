package com.example.mybatisgenerator.mapper;

import com.example.mybatisgenerator.pojo.Emp;
import java.util.List;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Sep 13 15:08:29 CST 2022
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Sep 13 15:08:29 CST 2022
     */
    List<Emp> selectAll();
}