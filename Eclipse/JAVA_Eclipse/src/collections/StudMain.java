package collections;
import java.util.*;
import java.util.stream.Collectors;
public class StudMain {

	public static void main(String[] args) {
		List<Student> studList = new ArrayList<Student>();
		studList.add(new Student(1,"Syamala","EEE", 9.2));
		studList.add(new Student(2,"Saranya","CSE", 8.9));
		studList.add(new Student(3,"Saiki","EEE", 8));
		studList.add(new Student(4,"Trinadh","EEE", 7.8));
		studList.add(new Student(5,"Syam","ECE", 9.5));
		studList.add(new Student(6,"Devadatta","CE", 6.5));
		studList.add(new Student(7,"SaiChand","ECE", 8.2));
		studList.add(new Student(8,"GR","ME", 7.5));
		studList.add(new Student(9,"Bharat","EEE", 6.9));
		studList.add(new Student(10,"Vyshnavi","CSE", 7.9));
		studList.forEach(System.out::println);
		
		Collections.sort(studList, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
			
			
		});
		System.out.println("Sort based on name using Comparator");
		studList.forEach(System.out::println);
		Collections.sort(studList, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				return s2.getName().compareTo(s1.getName());
			}
			
			
		});
		System.out.println("Sort based on name using Comparator reverse order");
		studList.forEach(System.out::println);
		Collections.sort(studList, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				return s2.getBranch().compareTo(s1.getBranch());
			}
			
			
		});
		System.out.println("Sort based on branch using Comparator reverse order");
		studList.forEach(System.out::println);
		Collections.sort(studList, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().length()-s2.getName().length();
			}
			
			
		});
		System.out.println("Sort based on length of name using Comparator");
		studList.forEach(System.out::println);
		
		Collections.sort(studList, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				return s2.getGPA()>s1.getGPA()?1:-1;
			}
			
			
		});
		System.out.println("Sort based on gpa using Comparator");
		studList.forEach(System.out::println);
		
		System.out.println("Sort based on specific branch using Comparator");

		for(Student s:studList) {
			if(s.getBranch()=="EEE") {
				System.out.println(s);
				
			}
		}
		double sum=0;
		int sc=0;
		for(Student s :studList) {
			sum=sum+s.getGPA();
			sc++;
		}
		//System.out.println(sum);
		//System.out.println(sc);
		double avg=sum/sc;
		System.out.println("The average of all students gpa "+avg);
		double sume=0;
		int sce=0;
		for(Student s :studList) {
			if(s.getBranch().equals("EEE")){
				sume=sume+s.getGPA();
				sce++;
		}
		}
		//System.out.println(sume);
		//System.out.println(sce);
		double avge=sume/sce;
		System.out.println("The average of EEE students gpa "+avge);
		List<Student> eeeStu=new ArrayList<Student>();
		for(Student s :studList) {
			if(s.getBranch().equals("EEE")){
				eeeStu.add(s);
		}
		}
		System.out.println("Sorting using lambda");
		Collections.sort(eeeStu,(s1,s2)->s1.getName().compareTo(s2.getName()));
		eeeStu.forEach(System.out::println);
		
		
		System.out.println("Sorting using Streams");
		List<Student> stuEEE= studList.stream()
				.filter(s->s.getBranch().equals("EEE"))
				.collect(Collectors.toList());
		stuEEE.forEach(System.out::println);
		
		
		System.out.println("Sorting using Streams EEE students by name");
		List<Student> stuEEEByName= studList.stream()
				.filter(s->s.getBranch().equals("EEE"))
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		stuEEEByName.forEach(System.out::println);
		
		
		
		System.out.println("Sorting using Streams EEE students by gpa");
		List<Student> stuEEEByGPA= studList.stream()
				.filter(s->s.getBranch().equals("EEE"))
				.sorted(Comparator.comparing(Student::getGPA))
				.collect(Collectors.toList());
		stuEEEByGPA.forEach(System.out::println);
		
		
		double avgStream= studList.stream().mapToDouble(Student::getGPA).average().orElse(0.0);
		System.out.println("Avergae gpa of all using streams "+avgStream);
		
		
		double avgStreamCSE= studList.stream()
				.filter(s->s.getBranch().equals("CSE"))
				.mapToDouble(Student::getGPA)
				.average()
				.orElse(0.0);
		System.out.println("Avergae gpa of CSE students using streams "+avgStreamCSE);
		
		



		


	}

}

