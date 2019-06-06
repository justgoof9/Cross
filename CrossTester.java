class CrossTester {
    public static void main(String [] args){
        int arr [][] = {
            {7,22,1,33},
            {5,3,10,4},
            {66,44,2,55},
        };

        int arr2 [][] = {
            {11,22,33,5,44,55},
            {22,33,44,6,55,66},
            {4,5,6,7,8,9},
            {33,44,55,8,66,77},
            {44,55,66,9,77,8},
        };

        int arr3 [][] = {
            {10,2,8,5,4,5},
            {2,13,4,60,55,0},
            {14,5,26,7,80,9},
        };

        int arr4 [][] = {
            {10,2,8,5,4,5},
            {2,13,4,60,55,0},
            {14,5,26,7,80,9},
        };



        Cross c = new Cross();
        System.out.println(c.sumCross(arr,1,2));
      //  Cross c2 = new Cross(arr2);
     //   System.out.println(c2.removeCross(arr2,2,3));

        Cross c3 = new Cross();

        for (int[] x : arr3)
        {
           for (int y : x)
           {
                System.out.print(y + " ");
           }
           System.out.println();
        }

        c3.sortedRows(arr3);
        System.out.println();

        for (int[] x : arr3)
        {
           for (int y : x)
           {
                System.out.print(y + " ");
           }
           System.out.println();
        }

        Cross c4 = new Cross();
        c4.sortedColumns(arr4);

        for (int[] x : arr4)
        {
           for (int y : x)
           {
                System.out.print(y + " ");
           }
           System.out.println();
        }

    }

}
