public class Main {
    public static void main(String[] args) {
        System.out.println(calculateScore("imperative"));
        System.out.println(calculateScore("no"));
        System.out.println(wordScore("declarative"));
        System.out.println(wordScore("yes"));
    }

    public static int calculateScore(String word){
        int score = 0;
        for (char c : word.toCharArray()) {
            if(c != 'a' && c != 'A'){
                score++;
            }
        }
        return score;
    }

    public static int wordScore(String word){
        return (int) word.chars().filter(c -> c != 'a' && c != 'A').count();
    }

}

