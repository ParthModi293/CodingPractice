import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeRound {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        for(Integer grade: grades){





                int resGrade = ((grade/5) +1 ) *5;

                if(resGrade >=40){





                if(resGrade - grade <3){
                    result.add(resGrade);
                }
                else {
                    result.add(grade);
                }


            }else{
                result.add(grade);
            }

        }





        return result;

    }

    public static void main(String[] args) {

            List<Integer> a = Arrays.asList(73,67 ,38 ,33);
        System.out.println(gradingStudents(a));



    }
}
