package com.example.webapp.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidationUtilsTest {

    @Test
    void isHiragana() {
        assertThat(ValidationUtils.isHiragana("ああああ", false)).isTrue();
        assertThat(ValidationUtils.isHiragana("ああカあ", false)).isFalse();
    }
}
