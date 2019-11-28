package com.example.core.util;

public class JaStringUtils {

    /**
     * Unicode全角ひらがなのコード範囲開始値
     */
    private static final int HIRAGANA_START_CODE = 0x3041;

    /**
     * Unicode全角ひらがなのコード範囲終了値
     */
    private static final int HIRAGANA_END_CODE = 0x3093;
    /**
     * Unicode全角スペースのコード値
     */
    private static final int FULL_SPACE_CODE = 0x3000;

    private JaStringUtils() {
    }

    /**
     * ひらがなのコードかどうか判定します。長音もひらな扱いです。
     *
     * @param c コード
     * @return ひらがなの場合true
     */
    public static boolean isHiragana(int c) {
        return c == 'ー' || (c >= HIRAGANA_START_CODE && c <= HIRAGANA_END_CODE);
    }

    /**
     * 指定された文字が全角スペースの場合、真を返します。
     *
     * @param c 文字
     * @return 全角スペースの場合<code>true</code>、そうでない場合<code>false</code>。
     */
    public static boolean isWideWhitespace(int c) {
        return c == FULL_SPACE_CODE;
    }

}
