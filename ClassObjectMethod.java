package ClassAndObject;

public class ClassObjectMethod {
	int demo = 20;
double ndemo = 2.5;
public static void main(String[] args) {
	ClassObjectMethod objClassObjectMethod = new ClassObjectMethod();
System.out.println(objClassObjectMethod.demo * objClassObjectMethod.ndemo);
objClassObjectMethod.division(objClassObjectMethod.demo, objClassObjectMethod.ndemo);
objClassObjectMethod.division(10,25.2);

double MyDecimal =  objClassObjectMethod.GetDecimal(20.5, 13.2);
System.out.println(MyDecimal);

}
public void division(int a, double b) {
	System.out.println(a * b);	
}

public double GetDecimal(double d, double c) {
	
	return d - c;
}

}
