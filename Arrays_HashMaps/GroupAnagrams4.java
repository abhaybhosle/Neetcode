import java.util.*;

public class GroupAnagrams4 {
    public static List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : str) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groupedAnagrams = groupAnagrams(str);

        System.out.println("[");
        for (List<String> anagramGroup : groupedAnagrams) {
            System.out.print("  [");
            for (int i = 0; i < anagramGroup.size(); i++) {
                System.out.print("\"" + anagramGroup.get(i) + "\"");
                if (i < anagramGroup.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}
