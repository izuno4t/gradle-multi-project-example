package com.example.webapp.util;

import com.example.core.util.JaStringUtils;
import org.apache.commons.lang3.StringUtils;

public class ValidationUtils {

    private ValidationUtils() {
    }

    /**
     * 文字列がひらがなであるかを確認します。
     *
     * @param str        文字列
     * @param allowSpace 全角スペースを許可する場合はtrueを指定
     * @return ひらがなの場合はtrue
     */
    public static boolean isHiragana(String str, boolean allowSpace) {
        if (StringUtils.isBlank(str)) {
            return true;
        }
        return str.chars().allMatch(c -> {
            return JaStringUtils.isHiragana(c) || (allowSpace && JaStringUtils.isWideWhitespace(c));
        });
    }

}
