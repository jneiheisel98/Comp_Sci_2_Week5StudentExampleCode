package week5student;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
       if(o1.getFirstName().compareTo(o2.getFirstName())>0){
            return 1;

        }
        else if(o1.getFirstName().compareTo(o2.getFirstName())<0){
            return -1;

        }
        else{
            return 0;
       }
    }


}
