class JewelsAndStone{
    public static void main(String[] args) {
        String jewels = "Af";
        String stones = "AaaddfFf";
        char[] stoneArray = stones.toCharArray();
        int count = 0;
        for(char stone : stoneArray){
            if(jewels.indexOf(stone) > -1){
                count++;
            }
        }
        System.out.println(count);
    }
}