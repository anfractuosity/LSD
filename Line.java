/**
    LSD Java Port
    
    Copyright (C) 2014  Chris - anfractuosity@anfractuosity.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

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
		if (y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;

			start = new Point(this.x1, this.y1, 0);
			end = new Point(this.x2, this.y2, 0);
		} else {

			this.x1 = x2;
			this.y1 = y2;
			this.x2 = x1;
			this.y2 = y1;
			

			end = new Point(this.x1, this.y1, 0);
			start = new Point(this.x2, this.y2, 0);
		}
		
		xDiff = this.x2 - this.x1;
		yDiff = this.y2 - this.y1;

		this.height = yDiff;
		this.width = xDiff;

		this.length = distance(x1, y1, x2, y2);

		angle = Math.toDegrees( Math.atan2(yDiff, xDiff));
	}
}
