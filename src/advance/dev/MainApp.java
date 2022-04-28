package advance.dev;

import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			Student arr[] = new Student[10];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Student();
				System.out.println(" Nhập Sinh Viên Thứ : " + (i+1));
				System.out.println("Nhập tên");
				arr[i].name = sc.nextLine();
				
				System.out.println("Nhập tuổi");
				arr[i].old = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nhập Địa chỉ");
				arr[i].add =sc.nextLine();
				sc.nextLine();
				
				System.out.println("Nhập SĐT");
				arr[i].sdt =sc.nextLine();
				sc.nextLine();
				
				System.out.println("Nhập ĐTB");
				arr[i].dtb=sc.nextFloat();
				sc.nextLine();
				
				}
				
				
		}
			}
}