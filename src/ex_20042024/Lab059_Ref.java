package ex_20042024;

public class Lab059_Ref {
    public static void main(String[] args) {
            String name="The Testing Academy";
            String name1="The Testing Academy";

            String name2=new String("The Testing Academy");
        System.out.println(name==name1);  //check the reference
        System.out.println(name.equals(name1));

        System.out.println(name==name2);
    }
}
