/**
 * @description: Day la class tinh chu vi va dien tich hinh chu nhat
 * @author: Nguyen Thanh Nhan
 * @version: 1.0
 * @created: 20-Aug-2025 7:25:36 PM
 */
package iuh.fit.cs;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle() {}
	public Rectangle(double length, double width) {
		if(length < 0 || width < 0) {
			throw new IllegalArgumentException("Chieu dai hoac chieu rong khong duoc be hon 0");
		}
		this.length = length;
		this.width = width;
	}
	
	public double getLength() { return length; }
	public double getWidth() { return width; }
	
	public void setLength(double newVal) {
		if(newVal < 0) {
			throw new IllegalArgumentException("Chieu dai khong nho hon 0");
		}
		this.length = newVal;
	}
	public void setWidth(double newVal) {
		if(newVal < 0) {
			throw new IllegalArgumentException("Chieu rong khong nho hon 0");
		}
		this.width = newVal;
	}
	
	public double getPerimeter() {
		return (length + width) * 2;
	}
	public double getAria() {
		return length * width ;
	}
	public String toString() {
		return "HinhChuNhat[Chieu dai: " + length + ",Chieu rong: " + width + ",Chu vi: " + getPerimeter() + ",Dien tich "
				+ getAria() + "]";
	}
}
