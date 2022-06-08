package lession_04;

public class StringLearning {

    public static void main(String[] args) {

        String s1 = "Cat";
        String
                s2 = new String("Cat");
        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();

        int totalDigital = 0 ;
        int totalLowerCase = 0;
        int totalUpperCase = 0;

        for (char charater : myCharacters) {
            Character.isDigit(charater);
            Character.isLowerCase(charater);
        }
        }}
