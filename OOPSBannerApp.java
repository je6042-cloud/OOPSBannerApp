import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public static void renderBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        loadPatterns();

        String word = "OOPS";

        renderBanner(word);
    }
}