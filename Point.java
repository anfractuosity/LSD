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

public class Point {
 double x,y,z;
 
    Point(double x,double y,double z){
    	this.x = x;
    	this.y = y;
    	this.z = z;
    }

    Point(){
    	x=y=z=0;
    }
    
   public String toString(){
    	return this.x + " "+this.y+" "+this.z;
    }
}
