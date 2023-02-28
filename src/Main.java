public class Main {
    public static void main(String[] args) {
        //count from 0 to 30
        for (int count = 0; count <= 30; count++) {
            System.out.println(count);
        }

        //count down from 30 to 0
        for (int count = 30; count >= 0; count--) {
            System.out.println(count);
        }
        //count up by 3 from 0 to 18
        for (int count = 0; count <= 18; count = count + 3) {
            System.out.println(count);
        }

        //descending count from 10 to 0 by 2's
        for (int count = 10; count >= 0; count = count - 2) {
            System.out.println(count);
        }

        final int ROW = 5;
        final int COL = 0;
        for (int row = 0; row <= ROW; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int col = 5; col >= COL; col--)
        {
            for (int row = 0; row < col; row++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        final int NEWCOL = 5;
        final int NEWROW = 5;
        for (int col = 1; col <= NEWCOL; col = col + 1)
        {
            for (int row = 1; row <= NEWROW; row = row + 1)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }

}