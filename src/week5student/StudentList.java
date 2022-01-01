package week5student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentList {
	public static void main (String[] args) {
		ArrayList<Student> friends = new ArrayList<Student>();

		friends.add(new Student ("John", "Smith", "610-555-7384"));
		friends.add(new Student ("Laura", "Apple", "215-555-3827"));
		friends.add(new Student ("Laura", "Barnes", "733-555-2969"));
		friends.add(new Student ("Laura", "Zimmer", "663-555-3984"));
		friends.add(new Student ("Laura", "Apple", "464-555-3489"));
//		friends.add(new Student ("Frank", "Phelps", "322-555-2284"));
//		friends.add(new Student ("Mario", "Guzman", "804-555-9066"));
//		friends.add(new Student ("Marsha", "Grant", "243-555-2837"));
//
//        Student stud = new Student("Roger", "Ferguson", "123");

//        Collections.sort(friends);
//        System.out.println("Friends " +friends);
//
//		Collections.sort(friends, new SortByFirstName());
//        System.out.println("Friends " +friends);
//
//		Collections.sort(friends, new SortByLastName());
//		System.out.println("Friends " +friends);
//
//        Collections.sort(friends, new Comparator<Student>() {
//					@Override
//					public int compare(Student o1, Student o2) {
//						return o1.getFirstName().compareTo(o2.getFirstName());
//					}
//				});
//				System.out.println("Friends " + friends);
//
//	    Collections.sort(friends, new Comparator<Student>() {
//			   public int compare (Student o1, Student o2) {
//				   return o1.getLastName().compareTo(o2.getLastName());
//			   }
//		});
//
//        Collections.sort(friends, new Comparator<Student>() {
//            public int compare (Student o1, Student o2) {
//                return o1.getFirstName().compareTo(o2.getFirstName());
//            }
//        });
//
//	    Collections.sort(friends, ( s1,   s2) ->
//	    	s1.getLastName().compareTo(s2.getLastName()));
//
//        Collections.sort(friends, ( s1,  s2) -> {
//	    	if (s1.getLastName().compareTo(s2.getLastName()) > 0 ) {
//	    		return 1;
//	    	}
//	    	else if (s1.getLastName().compareTo(s2.getLastName()) < 0 )
//	    		return -1;
//	    		else
//	    			return 0;
//        });
//
//		System.out.println("Friends " +friends);

		ArrayList<Student> list = (ArrayList<Student>) friends.stream()
				.map(arg -> {arg.setFirstName((arg.getFirstName()).toUpperCase());
				return arg;
				})
				.filter(arg ->!arg.getLastName().equals("BARNES"))

				.map(arg -> {arg.setLastName((arg.getLastName()).toUpperCase());
					return arg;
				})

				.filter(arg ->!arg.getLastName().equals("SMITH"))
                .filter(arg ->arg.getFirstName().equals("LAURA" ))


				.collect(Collectors.toList());

		System.out.println("List temp" +list);
        System.out.println (friends.parallelStream()
				.filter(arg-> arg.getLastName().equals("ferguson"))
				.count());
        System.out.println(friends.size());

//        Student t =  friends.stream()
//                .max ((s1,  s2) -> s1.getLastName().compareTo(s2.getLastName()));

//        Student t =  friends.stream()
//                .max ());

    }


}

