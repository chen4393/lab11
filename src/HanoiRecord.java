import java.util.Stack;

/**
 * Created by chen4393 on 4/11/17.
 */
public class HanoiRecord extends ActivationRecord {

	public HanoiRecord(int n, char source, char dest, char temp) {
		this.n = n;
		this.source = source;
		this.dest = dest;
		this.temp = temp;
	}

	public void run() {
	    System.out.println("n = " + n);
		if (n > 1) {
            HanoiR.s.pop();
            HanoiR.s.push(new HanoiRecord(n - 1, temp, dest, source));
            HanoiR.s.push(new HanoiRecord(1, source, dest, temp));
            HanoiR.s.push(new HanoiRecord(n - 1, source, temp, dest));
        } else {
		    HanoiRecord hr = HanoiR.s.pop();
            System.out.println("Move the disk from " + hr.source + " to " + hr.dest);
        }
		/*
		(2, X, Y, Z)
		(1, X, Z, Y)    X --> Z
		X --> Y
		(1, Z, Y, X)    Z --> Y

		(3, X, Y, Z)
		(2, X, Z, Y)    X --> Y, X --> Z, Y --> Z
		X --> Y
		(2, Z, Y, X)    Z --> X, Z --> Y, X --> Y
		 */
	}

	private int n;
	private char source;
	private char dest;
	private char temp;

}
