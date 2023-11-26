import java.util.Scanner;

class RobotMoves{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String moves = s.nextLine();
        System.out.println(hasComeBackToOriginalPos(moves));
    }

    public static boolean hasComeBackToOriginalPos(String moves){
        char[] movesArray = moves.toCharArray();
        int total = 0;
        for(int i = 0; i< movesArray.length; i++){
            if(movesArray[i] == 'U' || movesArray[i] == 'R'){
                ++total;
            }else{
                --total;
            }
        }
        if(total == 0){
            return true;
        }
        return false;
    }
}