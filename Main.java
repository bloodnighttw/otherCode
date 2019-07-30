import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many students: ");
        int numberOfStudents=sc.nextInt();
        Students[] students=new Students[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++) {
            try {
                System.out.print("NO."+(i+1)+" Rank: ");
                int rank = sc.nextInt();
                System.out.println();
                //如果排名是非法的(大於總人數或小於1) 丟出例外
                if (rank > numberOfStudents||rank <1)
                    throw new illegalRank();
                //如果排名是非法的(大於總人數或小於1) 丟出例外
                //設置學生排名
                else
                    students[i]=new Students(rank);
                //設置學生排名
            // 例外處理
            } catch (illegalRank e) {
                System.out.println("illegalRankNumber");
                System.out.println("stop runnung......");
                System.exit(0);
                //終止程式執行
            }
            //例外處理
        }


    }
}

class Students {

    private boolean same=false;
    private  int rank;

    Students(int Rank){
        rank=Rank;
    }

    public int getRank(){
        return  rank;
    }

    public boolean isSame(){
        return same;
    }

}

class Seat {

    int[][] seat;
    Seat(int line,int row){
        seat=new int[line][row];
    }

    void show(){
        for(int i=0;i<seat.length;i++){
            for(int j=0;j<seat[i].length;j++)
                System.out.print(seat[i][j]+" ");
            System.out.println();
        }
    }

    void setSeat(int line,int row,int number){
        seat[line][row]=number;
    }

}

class illegalRank extends Exception{
    illegalRank(){
        super("illegalRank");
    }
}
