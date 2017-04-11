/**
 * Created by chen4393 on 4/11/17.
 */
public class FactRecord extends ActivationRecord {

    public FactRecord(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("n = " + n);
        if (n > 1) {
            FactR.s.push(new FactRecord(n - 1));
        } else {
            while (!FactR.s.isEmpty()) {
                FactR.returnedValue *= FactR.s.pop().n;
                System.out.println("FactR.returnedValue = " + FactR.returnedValue);
            }
        }
    }

    private int n;
}
