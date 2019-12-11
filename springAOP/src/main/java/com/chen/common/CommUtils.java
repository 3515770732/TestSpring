package com.chen.common;


import com.chen.anno.TableEntity;
import com.chen.entity.CityEntity;

/**
 * @description:
 * @author:
 */
public class CommUtils {

    /**
     *
     * @param object
     */
    public static String query(Object object){
        CityEntity cityEntity= (CityEntity) object;
        StringBuilder sb=new StringBuilder();
        sb.append("select * from ");
        if(object.getClass().isAnnotationPresent(TableEntity.class)){
            TableEntity tableEntity=object.getClass().getAnnotation(TableEntity.class);
            sb.append(tableEntity.value());
        }
        sb.append(" where id="+cityEntity.getId());
        sb.append(" and name="+cityEntity.getName());
        return sb.toString();
    }

}
