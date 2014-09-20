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
