import java.util.*;
class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(romanMap.entrySet());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 13; i++) {
            Map.Entry<Integer, String> entry = entries.get(i);
            while (num >= entry.getKey()) {
                num -= entry.getKey();
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }
}
