class LongestCommonPrefixDivideAndConquer{
    public static void main(String[] args) {
        String[] inputStrings = {"colorado", "color", "cold"};
        String result = commonPrefix(inputStrings, 0, inputStrings.length-1);
        System.out.println(result);
    }

    private static String commonPrefix(String[] inputStrings, int low, int high) {
        if(low >= high){
            return inputStrings[low];
        }
        if(high > low){
            int mid = low + (high - low) / 2;
            String s1 = commonPrefix(inputStrings, low, mid);
            String s2 = commonPrefix(inputStrings, mid+1, high);
            return commonPrefixUtil(s1, s2);
        }
        return null;
    }

    private static String commonPrefixUtil(String s1, String s2) {
        int n = s1.length(), n1 = s2.length();
        String result = "";
        for(int i = 0 , j = 0; i < n-1 && j < n1-1; i++, j++){
            if(s1.charAt(i) != s2.charAt(j)){
                break;
            }
            result += s1.charAt(i);
        }
        return result;
    }
}