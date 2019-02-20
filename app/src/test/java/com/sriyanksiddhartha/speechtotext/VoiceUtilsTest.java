package com.sriyanksiddhartha.speechtotext;

import static org.junit.Assert.*;
import org.junit.Test;

public class VoiceUtilsTest {

    @Test
    public void translateNumbers_twoDigits_OK() {
        assertEquals(VoiceUtils.translateNumbers("dni uno dos nueve buscar"),"dni 129 buscar");
    }
}