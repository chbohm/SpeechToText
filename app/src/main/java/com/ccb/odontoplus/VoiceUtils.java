package com.sriyanksiddhartha.speechtotext;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.regex.Pattern;

public class VoiceUtils {
    private static Pattern pattern = Pattern.compile("(?<aNumber>[0-9])(?<aSpace>\\s)");
    private static Map<String, String> numbers = Maps.newHashMap();

    static {
        numbers.put("uno", "1");
        numbers.put("dos", "2");
        numbers.put("tres", "3");
        numbers.put("cuatro", "4");
        numbers.put("cinco", "5");
        numbers.put("seis", "6");
        numbers.put("siete", "7");
        numbers.put("ocho", "8");
        numbers.put("nueve", "9");
    }


    public static String translateNumbers(String voiceLine) {

        for (Map.Entry<String, String> entry : numbers.entrySet()) {
            voiceLine = voiceLine.replaceAll(entry.getKey(), entry.getValue());
        }
        voiceLine = VoiceUtils.pattern.matcher(voiceLine).replaceAll("[${aNumber}]").replaceAll("\\]\\[","").replace("[","").replace("]"," ");

        return voiceLine;
    }
}

