static String isValid(String s) {

    if (s == null) return "NO";
        if (s.isEmpty()) return "YES";

        String alphabeth = "abcdefghijklmnopqrstuvxwyz";

        Map<Integer, String> map = new HashMap<>(s.length());

        for (Character charAlphabeth : alphabeth.toCharArray()) {
            java.util.regex.Matcher m = Pattern.compile(charAlphabeth.toString()).matcher(s);

            int matches = 0;
            while (m.find())
                matches++;
            if (matches > 0) {
                map.computeIfPresent(matches, (key, value) -> {
                    return map.get(key) + charAlphabeth;
                });
                map.putIfAbsent(matches, charAlphabeth.toString());
            }
        }
        Integer lenght1 = 0, lenght2 = 0;

        if (map.size() > 2) return "NO";
        if (map.size() < 2) return "YES";
        Map.Entry<Integer, String> entry1 = null;
        Map.Entry<Integer, String> entry2 = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry1 == null) {
                entry1 = entry;
                continue;
            }
            if (entry1.getKey() < entry.getKey()) {
                entry2 = entry1;
                entry1 = entry;
            }
        }
        if (entry1.getKey() - entry2.getKey() > 1 && !(entry2.getKey() == 1 && entry2.getValue().length() == 1))
            return "NO";
        if (entry2.getKey() == 1 && entry2.getValue().length() > 1 && entry1.getKey() != entry2.getKey() + 1)
            return "NO";
        if (entry2.getValue().length() > 1 && entry1.getValue().length() > 1) 
            return "NO";
        
        return "YES";
}
