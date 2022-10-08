package BuddyGroupB6_FOPJava_GradedProject1;

public class Main {
	public static void main(String args[]) {

		Hr_department obj_hr = new Hr_department();
		Tech_Department obj_tech = new Tech_Department();
		Admin_Department obj_admin = new Admin_Department();

		System.out.println("Welcome to " + obj_admin.departmentName());
		System.out.println(obj_admin.getTodaysWork());
		System.out.println(obj_admin.getWorkDeadline());
		System.out.println(obj_admin.isTodayAHoliday());
		System.out.println("");

		System.out.println("Welcome to " + obj_hr.departmentName());
		System.out.println(obj_hr.doActivity());
		System.out.println(obj_hr.getTodaysWork());
		System.out.println(obj_hr.getWorkDeadline());
		System.out.println(obj_hr.isTodayAHoliday());
		System.out.println("");

		System.out.println("Welcome to " + obj_tech.departmentName());
		System.out.println(obj_tech.getTodaysWork());
		System.out.println(obj_tech.getWorkDeadline());
		System.out.println(obj_tech.getTechStackInformation());
		System.out.println(obj_tech.isTodayAHoliday());

	}

}