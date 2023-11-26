class IsAnagram{
    public static void main(String[] args) {
        char[] s = "cat".toCharArray();
        String t = "tac";
//        for(char str : s){
//            if(t.indexOf(str) == -1){
//                System.out.println(false);
//            }
//        }
        int[] alphabet = new int[26];
        for(int i = 0; i < s.length; i++){
            alphabet[s[i] - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            alphabet[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i< alphabet.length; i++){
            if(alphabet[i] != 0){
                System.out.println(false);
            }
        }
    }
}