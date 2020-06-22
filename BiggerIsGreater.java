static String biggerIsGreater(String w) {
    if (w == null || w.trim().length() == 0)
        return "no answer";

    int len = w.length();
    char[] arr = w.toCharArray();
    int i = len-1;
    while (i > 0 && arr[i] <= arr[i-1])
        i--;

    if (i <= 0)
        return "no answer";

    int j = len-1;
    while (arr[j] <= arr[i-1])
        j--;

    char tmp = arr[j];
    arr[j] = arr[i-1];
    arr[i-1] = tmp;

    Arrays.sort(arr, i, arr.length);
    return String.valueOf(arr);
}
