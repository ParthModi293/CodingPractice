public class StringOperationChar {

    public static void main(String[] args) {


//        String name = "Parth";
        char[] name={'p', 'a', 'r', 't', 'h'};
        String res = "";

        for(int i =0; i < name.length;i++){


            res = res + name[i];

        }
        System.out.println(res);

    }
}
