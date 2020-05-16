package com.zyc.sss.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @author zhangyongchao
 * @date 2020/5/15 9:34
 * @description
 */
@SuppressWarnings("all")
public class CommonUtils {

    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Object aObj) {
        if (aObj instanceof String) {
            return isEmpty((String) aObj);
        } else if (aObj instanceof Long) {
            return isEmpty((Long) aObj);
        } else if (aObj instanceof java.util.Date) {
            return isEmpty((java.util.Date) aObj);
        } else if (aObj instanceof Collection) {
            return isEmpty((Collection) aObj);
        } else if (aObj instanceof Map) {
            return isEmpty((Map) aObj);
        } else if (!isNull(aObj) && aObj.getClass().isArray()) {
            return isEmptyArray(aObj);
        } else {
            return isNull(aObj);
        }
    }

    public static boolean isEmpty(java.util.Date aDate) {
        if (isNull(aDate)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmpty(Long aLong) {
        if (isNull(aLong)) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Map m) {
        if (isNull(m) || m.size() == 0) {
            return true;
        }
        return false;
    }

    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Collection c) {
        if (isNull(c) || c.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String aStr) {
        if (isNull(aStr) || aStr.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNull(Object oStr) {
        if (oStr == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmptyArray(Object array) {
        if (!isNull(array) && array.getClass().isArray()) {
            int length = 0;
            if (array instanceof int[]) {
                length = ((int[]) array).length;
            } else if (array instanceof byte[]) {
                length = ((byte[]) array).length;
            } else if (array instanceof short[]) {
                length = ((short[]) array).length;
            } else if (array instanceof char[]) {
                length = ((char[]) array).length;
            } else if (array instanceof float[]) {
                length = ((float[]) array).length;
            } else if (array instanceof double[]) {
                length = ((double[]) array).length;
            } else if (array instanceof long[]) {
                length = ((long[]) array).length;
            } else if (array instanceof boolean[]) {
                length = ((boolean[]) array).length;
            } else {
                length = ((Object[]) array).length;
            }
            if (length == 0) {
                return true;
            }
        }

        return false;
    }

}
