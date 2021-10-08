public class Demo1 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==0|| i==2){
                    System.out.print("* ");
                }
                else if((i+j)%2==0){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");


            }
            System.out.println();
        }
    }

}
