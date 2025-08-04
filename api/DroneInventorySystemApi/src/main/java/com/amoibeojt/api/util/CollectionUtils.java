package com.amoibeojt.api.util;

import java.util.List;

public class CollectionUtils {
	
    private CollectionUtils() {
        // インスタンス化防止
    }

    /**
     * 空リストならnullを返却する
     * @param list 判定対象リスト
     * @return nullまたは元のリスト
     */
    public static <T> List<T> emptyToNull(List<T> list) {
        return (list == null || list.isEmpty()) ? null : list;
    }

}
