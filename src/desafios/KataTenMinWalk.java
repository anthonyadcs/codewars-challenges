package desafios;
import java.util.HashMap;
import java.util.Map;

public class KataTenMinWalk {
    public static boolean isValid(char[] walk) {
        Map<Character, Integer> coordinates = new HashMap<>(Map.of('x', 0, 'y', 0));

        for (char c : walk) {
            switch (c) {
                case 'n':
                    coordinates.put('y', coordinates.get('y') + 1);
                    continue;
                case 's':
                    coordinates.put('y', coordinates.get('y') - 1);
                    continue;
                case 'e':
                    coordinates.put('x', coordinates.get('x') + 1);
                    continue;
                case 'w':
                    coordinates.put('x', coordinates.get('x') - 1);
                    continue;
                default:
                    break;
            }
        }

        return walk.length == 10 && (coordinates.get('x') == 0 && coordinates.get('y') == 0);
    }

}
