public class LettersCode
{
    public void printCode(){
        String latinLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cyrillicLetters = "абвгдеёжзийклмнопрстуфхцчшщьыъэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ";

        for(int i = 0; i < latinLetters.length(); i++){
            char latinLettersChar = latinLetters.charAt(i);
            System.out.println(latinLettersChar + " " + (int) latinLettersChar);
        }

        for(int i = 0; i < cyrillicLetters.length(); i++){
            char cyrillicLettersChar = cyrillicLetters.charAt(i);
            System.out.println(cyrillicLettersChar + " " + (int) cyrillicLettersChar);
        }
    }
}
