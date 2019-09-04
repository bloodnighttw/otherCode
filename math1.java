public class math1 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int a,b,c,d,e,f;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        int x,y;
        try{

            x = (c * e - b * f) / ( a * e - d * b);
            y = -1*(c * d - e * f) / ( b * d - a * e);
            System.out.println("x:"+x+"\n"+"y:"+y);

        }catch (java.lang.ArithmeticException exception){
            
            if((c*e-b*f)==0)
                System.out.println("too many ans");
            else
                System.out.println("0 Answer");
        
        }
    }
}
