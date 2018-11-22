public class Anagram {
    public boolean anagram(String firstWord, String secondWord) {
        String firstTemp = firstWord.replace(" ", "");
        String secondTemp = secondWord.replace(" ", "");

        if (firstTemp.length() == secondTemp.length()) {
            for (int i = 0; i < secondTemp.length(); i++) {
                if (firstTemp.contains(Character.toString(secondTemp.charAt(i)))) {
                    firstTemp = firstTemp.replaceFirst(Character.toString((secondTemp.charAt(i))), "");
                } else {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

}
