import java.util.Scanner;

class CorrectCapitalization{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(isCorrectCase(input));
    }

    public static boolean isCorrectCase(String input){
        boolean correctCase = true;
//        if(input.equals(input.toLowerCase())){
//            return true;
//        }
//        if(input.equals(input.toUpperCase())){
//            return true;
//        }
        if(Character.isUpperCase(input.charAt(0))){
            correctCase = input.substring(1).chars().allMatch(Character::isLowerCase);
            if(!correctCase){
                correctCase = input.substring(1).chars().allMatch(Character::isUpperCase);
            }
        }

        if(Character.isLowerCase(input.charAt(0))){
            correctCase = input.substring(1).chars().allMatch(Character::isLowerCase);
        }
        return correctCase;
    }
}