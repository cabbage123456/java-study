public class Prime {
    public static void main(String[] args) {
        for(int i=100;i<=200;i++){
            boolean f = true;
            for(int j =2;j<=Math.sqrt(i);j++)
            {
                if (i%j==0){
                    f=false;
                    break;
                }
            }
            if (f){
                System.out.println("素数："+i);
            }
        }
    }
}
