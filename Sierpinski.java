/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		StdDraw.line(0.0, 0.0, 1.0, 0.0);
		StdDraw.line(1.0, 0.0, 0.5, Math.sqrt(3) / 2);
		StdDraw.line(0.5, Math.sqrt(3) / 2, 0.0, 0.0);
		
		sierpinski(n, 0.0, 1.0, 0.5,
					0.0, 0.0, Math.sqrt(3) / 2);
		
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n != 0) {
			
			
			double midX12 = (x1 + x2) / 2;
			double midY12 = (y1 + y2) / 2;
			double midX23 = (x2 + x3) / 2;
			double midY23 = (y2 + y3) / 2;
			double midX31 = (x1 + x3) / 2;
			double midY31 = (y1 + y3) / 2;

			StdDraw.line(midX12, midY12, midX23, midY23);
			StdDraw.line(midX23, midY23, midX31, midY31);
			StdDraw.line(midX31, midY31, midX12, midY12);

			sierpinski(n - 1, x1, midX12, midX31,
					          y1, midY12, midY31);
			sierpinski(n - 1, midX12, x2, midX23,
					          midY12, y2, midY23);
			sierpinski(n - 1, midX31, midX23, x3,
					          midY31, midY23, y3);
			

			
		
			
		}
	}
}
