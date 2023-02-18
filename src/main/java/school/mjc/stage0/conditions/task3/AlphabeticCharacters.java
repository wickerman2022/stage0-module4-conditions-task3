package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
            if ((character == 'a') || (character == 'i') || (character == 'e') || (character == 'o') || (character == 'u') ||
            (character == 'A') || (character == 'I') || (character == 'E') || (character == 'O') || (character == 'U')) 
            System.out.println("Vowel");
            else System.out.println("Consonant");
        }
        else
            System.out.println("wrong alphabet!");
        }
}
