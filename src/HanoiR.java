/**
 * Created by chen4393 on 4/11/17.
 */

import java.util.*;

public class HanoiR {

    public static Stack<HanoiRecord> s = new Stack<HanoiRecord>();

    public static void main(String[] args) {
        int n = 3;
        s.push(new HanoiRecord(n, 'X', 'Y', 'Z'));

        while (!s.empty()) {
            ((HanoiRecord) s.peek()).run();
        }
    }
}
