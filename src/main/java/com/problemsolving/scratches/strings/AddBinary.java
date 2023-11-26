class AddBinary{
    public static void main(String[] args) {
        String s = "011011";
        String s1 = "1010111";
        int i = Integer.parseInt(s,2);
        int i1 = Integer.parseInt(s1,2);
        System.out.println(Integer.toBinaryString(i+i1));
/*
* Not using any util methods
* */
        int iLast = s.length()-1, i1Last = s1.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(iLast >= 0 || i1Last >= 0){
            int sum = carry;
            if(iLast >= 0){
                sum += Integer.parseInt(String.valueOf(s.charAt(iLast)));
            }
            if(i1Last >= 0){
                sum += Integer.parseInt(String.valueOf(s1.charAt(i1Last)));
            }
            if(sum == 0 || sum == 1){
                result.append(sum);
                carry = 0;
            } else if (sum == 2){
                result.append("0");
                carry = 1;
            } else if (sum == 3){
                result.append("1");
                carry = 1;
            }
            iLast--;
            i1Last--;
        }
        if(carry == 1){
            result.append("1");
        }
        System.out.println(result.reverse());
    }
}