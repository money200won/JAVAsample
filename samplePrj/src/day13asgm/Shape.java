package day13asgm;

public abstract class Shape {
int numSide;


public Shape() {
	super();
}
public Shape(int numSide) {
	super();
	this.numSide = numSide;
}
public int getNumSide() {
	return numSide;
}
abstract double getArea(); 

}
