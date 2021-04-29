package tp3;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(int i, int j) {
		this.setXY(i,j);
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setXY(int i, int j) {
		this.setX(i);
		this.setY(j);
	}

	private void setY(int j) {
		y = j; 
	}

	private void setX(int i) {
		x = i;
	}

	public Point sumarCon(Point p) {
		Point nuevoPunto = new Point(this.getX()+p.getX(), this.getY()+p.getY());
		return nuevoPunto;
	}
	
}
