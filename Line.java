
import java.util.HashSet;

public class Line {
	double x1;
	double y1;

	double x2;
	double y2;

	double angle;

	double height;

	double width;

	double xDiff, yDiff;
	Point start;
	Point end;
	double length;

	public int hashCode() {
		return (int) (x1 + y1 + x2 + y2);
	}

	public boolean equals(Object l) {
		if (l instanceof Line) {
			Line tmp = (Line) l;

			return (tmp.x1 == this.x1 && tmp.y1 == this.y1 && tmp.x2 == this.x2 && tmp.y2 == this.y2);

		}

		return false;

	}

	public double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2)
				+ Math.pow(Math.abs(y1 - y2), 2));
	}

	Line(double x1, double y1, double x2, double y2) {

		//double d1 = distance(0, 0, x1, y1);
		//double d2 = distance(0, 0, x2, y2);

		if (y1 < y2) {

			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;


			start = new Point(this.x1, this.y1, 0);
			end = new Point(this.x2, this.y2, 0);
			// xDiff = x2 - x1;
			// yDiff = y2 - y1;
		} else {

			this.x1 = x2;
			this.y1 = y2;
			this.x2 = x1;
			this.y2 = y1;
			

			end = new Point(this.x1, this.y1, 0);
			start = new Point(this.x2, this.y2, 0);

			// xDiff = x1 - x2;
			// yDiff = y1 - y2;
		}
		
		
		/*
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		*/
		
		xDiff = this.x2 - this.x1;
		yDiff = this.y2 - this.y1;

		//start = new Point(this.x1, this.y1, 0);
		//end = new Point(this.x2, this.y2, 0);

		this.height = yDiff;
		this.width = xDiff;

		this.length = distance(x1, y1, x2, y2);

		// angle = Math.atan2(yDiff, xDiff) * 180/Math.PI;

		//double n1 = Math.sqrt(this.x1 * this.x1 + this.y1 * this.y1), n2 = Math.sqrt(this.x2 * this.x2 + this.y2
		//		* this.y2);
		//angle = Math.acos((this.x1 * this.x2 + this.y1 * this.y2) / (n1 * n2)) * 180 / Math.PI;

		angle = Math.toDegrees( Math.atan2(yDiff, xDiff));
		
		
		//System.out.println(angle);

	}
}
