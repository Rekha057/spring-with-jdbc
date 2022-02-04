package Spring_jdbc1.Spring_jdbc1;

public class foodBean {
int quality;
String food;
public int getQuality() {
	return quality;
}
public void setQuality(int quality) {
	this.quality = quality;
}
public String getFood() {
	return food;
}
public void setFood(String food) {
	this.food = food;
}
@Override
public String toString() {
	return "foodBean [quality=" + quality + ", food=" + food + "]";
}
}
