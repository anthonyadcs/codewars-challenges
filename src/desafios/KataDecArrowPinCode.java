package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KataDecArrowPinCode {
    static final Set<Integer> TOP = Set.of(7, 8, 9);
    static final Set<Integer> RIGHT = Set.of(0, 3, 6, 9);
    static final Set<Integer> BOTTOM = Set.of(0, 2, 3);
    static final Set<Integer> LEFT = Set.of(0, 1, 4, 7);

    public static int[] decArrowPinCode(String arrowStr) {
        char[] strList = arrowStr.toCharArray();
        List<Integer> pin = new ArrayList<>();

        int position = Integer.parseInt(String.valueOf(strList[0]));


        for (int i = 0; i < strList.length; i++) {
            if (i == 0) {
                pin.add(position);
            } else {
                switch (strList[i]) {
                    case '↑': {
                        int actualPosition = position;
                        if (TOP.contains(actualPosition)) {
                            return new int[]{};
                        }

                        position += actualPosition == 0 ? 1 : 3;
                        pin.add(position);
                        break;
                    }

                    case '→': {
                        int actualPosition = position;
                        if (RIGHT.contains(actualPosition)) {
                            return new int[]{};
                        }

                        position += 1;
                        pin.add(position);
                        break;
                    }


                    case '↓': {
                        int actualPosition = position;
                        if (BOTTOM.contains(actualPosition)) {
                            return new int[]{};
                        }

                        position -= actualPosition == 1 ? 1 : 3;
                        pin.add(position);
                        break;
                    }

                    case '←': {
                        int actualPosition = position;
                        if (LEFT.contains(actualPosition)) {
                            return new int[]{};
                        }

                        position -= 1;
                        pin.add(position);
                        break;
                    }

                    case '*': {
                        for(int j = 0; j < Character.getNumericValue(strList[i + 1]); j++){
                            pin.add(position);
                        }

                        i++;
                        break;
                    }

                    default: return new int[]{};
                }
            }
        }


        return pin.stream().mapToInt(Integer::intValue).toArray();
    }
}
