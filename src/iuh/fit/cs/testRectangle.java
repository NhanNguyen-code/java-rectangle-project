/**
 * @description: Day la file chua ham main de chay chuong trinh
 * @author: Nguyen Thanh Nhan
 * @version: 1.0
 * @created: 20-Aug-2025 7:37:45 PM
 */
package iuh.fit.se;

import java.util.Scanner;

public class testRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Nhap chieu dai: ");
			double length = sc.nextDouble();
			System.out.println("Nhap chieu rong: ");
			double width = sc.nextDouble();
			
			Rectangle rec = new Rectangle(length, width);
			
			System.out.println("Chu vi Hinh Chu Nhat: " + rec.getPerimeter());
			System.out.println("Dien tich Hinh Chu Nhat: " + rec.getAria());
			System.out.println("Thong tin hinh chu nhat: " + rec.toString());
		}catch(IllegalArgumentException e){
			System.out.println("Loi: " + e.getMessage());
		}
		sc.close();
	}
}
