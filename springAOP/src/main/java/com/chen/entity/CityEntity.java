package com.chen.entity;

import com.chen.anno.TableEntity;
import lombok.Data;

/**
 * @description:
 * @author:
 */
@Data
@TableEntity(value="city")
public class CityEntity {
    private String id;
    private String name;
}
