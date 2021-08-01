class Rectangulo {

	public int left;
	public int right;
	public final int top;
	public final int bottom;
	public final int height;
	public final int width;

	Rectangulo (Point start, Point end){
		this.left = start.x;
		this.right = end.x;
		this.top = start.y;
		this.bottom = end.y;
		this.width = this.right - this.left;
		this.height = this.bottom - this.top;

	}

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

	
	public int getLeft(){
        return this.left;
    }

    public int getRight(){
        return this.right;
    }
	
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
