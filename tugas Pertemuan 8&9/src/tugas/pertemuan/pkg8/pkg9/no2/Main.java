package tugas.pertemuan.pkg8.pkg9.no2;

public class Main {
    public static void main(String[] args) {

		Person person = new Person("Febraka", "Sukabumi", 
			"08666669831", "rakafeb@gmail.com");

		Student student = new Student("yayas", "Cimahi", "089561234", 
			"yayasboxing@gmail.com", Student.TAHUN_AKHIR);

		Employee employee = new Employee("Raka", "Cirebon", "086189999999",
			"raka@gmail.com", 666, 6000000);

		Faculty faculty = new Faculty("Mufid", "Sukabumi", "084133333333",
			"Mufidirsan@gmail.com", 777, 10000000, "07.00 - 16.00", "Professor");

		Staff staff = new Staff("Zidan", "Bandung", "082030000000",
			"Fianzi@Gmail.com", 69, 6500000, "Executive Assistant");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
