package com.yl.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author ：jerry
 * @date ：Created in 2022/1/6 13:04
 * @description：精准分表算法
 * @version: V1.1
 */
public class MyTablePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> tableNames, PreciseShardingValue<Long> shardingValue) {

        /**
         * tableNames 对应分片库中所有分片表的集合
         * shardingValue 为分片属性，其中 logicTableName 为逻辑表，columnName 分片健（字段），value 为从 SQL 中解析出的分片健的值
         */
        for (String tableName : tableNames) {
            /**
             * 取模算法，分片健 % 表数量
             */
            String value = shardingValue.getValue() % tableNames.size() + "";
            if (tableName.endsWith(value)) {
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}
