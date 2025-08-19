import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Strobogrammatic {
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        map.put('1', '1');
        map.put('0', '0');

        int l = 0, r = num.length() - 1;
        while (l < r) {
            if (!map.containsKey(num.charAt(l)))
                return false;
            if (map.get(num.charAt(l)) != num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        if (isStrobogrammatic("609") == true) {
            System.out.println("Strobogrammatic");
        } else {
            System.out.println("Not strobogrammatic");
        }
    }
}
