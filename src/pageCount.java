public class pageCount {

    public static int pageCount(int n, int p) {



int res =p-1;

int sub= n-p;

if(res < sub){
    if(n%2==0){
        return  res;
    }
    return res-1;
}else{

    if(sub == 1){
        return 0;
    }


    return sub;
}






    }
    public static void main(String[] args) {

        System.out.println(pageCount(7,3));

    }
}
