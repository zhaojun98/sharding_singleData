package com.yl.common;


import com.yl.util.ShardingUtils;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import java.util.Collection;
import java.util.Date;

/**
 * @author ：jerry
 * @date ：Created in 2022/1/6 14:16
 * @description：时间分表
 * @version: V1.1
 */
public class DatePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Date> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Date> preciseShardingValue) {
        Date date = preciseShardingValue.getValue();
        String suffix = ShardingUtils.getSuffixByYearMonth(date);
        for (String tableName : availableTargetNames) {
            if (tableName.endsWith(suffix)) {
                return tableName;
            }
        }
        throw new IllegalArgumentException("未找到匹配的数据表");
    }
}
