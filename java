package lab4;
import java.util.Scanner;

public class Circle
{
	  /*Створити клас – Коло. У закритій частині визначити поля:
	• x, 
	• y – координати центру та
	• R – радіус.
	Методи:
	• обчислюють площу,
	• довжину кола,
	• встановлюють поля і
	• повертають їх значення.*/
		Scanner scan = new Scanner(System.in);
	        private int x;
	        private int y;
	        private int r;
	        public int GetX() { return x; }
	        public int GetY() { return y; }
	        public int GetR() { return r; }
	        public boolean SetX(int x1)
	        {
	            if (x1 > 0)
	            {
	                x = x1;
	                return true;
	            }
	            else
	            {
	                x = -x1;
	                return false;
	            }
	        }
	        public boolean SetY(int y1)
	        {
	            if (y1 > 0)
	            {
	                y = y1;
	                return true;

	            }
	            else
	            {
	                y = -y1;
	                return false;
	            }
	        }
	        public boolean SetR(int r1)
	        {
	            if (r1 > 0)
	            {
	                r = r1;
	                return true;

	            }
	            else
	            {
	                r = -r1;
	                return false;
	            }
	        }
	        public boolean Init(int x1, int y1, int r1)
	        {
	           return SetX(x1) && SetY(y1) && SetR(r1);
	        }
	        public void Read()
	        {
	            int x1, y1, r1;
	            do
	            {
	            	System.out.println("x: ");
	                x1 = scan.nextInt();
	                System.out.println("y: ");
	                y1 = scan.nextInt();
	                System.out.println("r: ");
	                r1 = scan.nextInt();

	            } while (!Init(x1, y1, r1));

	        }
	        public void Display()
	        {
	        	System.out.println("x: " + x);
	        	System.out.println("y: " + y);
	        	System.out.println("r: " + r);
	        }
	        public double Area()
	        {
	            double area = 3.14 * (GetR() * GetR());
	            return area;
	        }
	        public double L()
	        {
	            double l = 2 * 3.14 * GetR();
	            return l;
	        }

}

package lab4;
public class Main
{
	
	public static void main(String[] args)
	{
		            Circle c  = new Circle();
		            c.Read();
		            c.Display();
		            System.out.println("area: " + c.Area());
		            System.out.println("l: " + c.L());
    }

}
