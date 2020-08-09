import java.awt.geom.Point2D; 
public class Sample10_5A {
int x;// ‚wÀ•W
int y;// ‚xÀ•W

void Point2D(int x, int y) { this.x = x; this.y = y; }

void setX(int x) { this.x = x; }// ‚wÀ•W‚ğİ’è
void setY(int y) { this.y = y; }// ‚xÀ•W‚ğİ’è

int getX() { return x; }// ‚wÀ•W‚ğæ“¾
int getY() { return y; }// ‚xÀ•W‚ğæ“¾
}

// ‚RŸŒ³À•WƒNƒ‰ƒX
class Point3D extends Sample10_5A {
int z;// ‚yÀ•W

Point3D(int x, int y, int z) {super(); this.z = z; }

void setZ(int z) { this.z = z; }// ‚yÀ•W‚ğİ’è
int getZ() { return z; }// ‚yÀ•W‚ğæ“¾
}

class PointTester {

public static void main(String[] args) {

//Point2D a = new Point2D(10, 15);
Point3D b = new Point3D(20, 30, 40);

//System.out.printf("a = (%d, %d)\n",     a.getX(), a.getY());
System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
}
}
