class Solution {
    public int[][] merge(int[][] intervals) {
//         int n=intervals.length,i;
//         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
//         List<List<Integer>> list  = new ArrayList<>();
//         for( i = 0;i<intervals.length-1;i++)
//         {
//             List<Integer> arr = new ArrayList<>();
//             arr.add(intervals[i][0]);
//             if(intervals[i][1]>=intervals[i+1][0])
//             {
//                 arr.add(Math.max(intervals[i+1][1],intervals[i][1]));
//                 i++;
//             }else{
//                 arr.add(intervals[i][1]);
//             }
//             list.add(arr);
            
//         }
//      if(i==n-1){
//         List<Integer> arr = new ArrayList<>();
//         arr.add(intervals[n-1][0]);
//         arr.add(intervals[n-1][1]);
//                 list.add(arr);
//         }
// // for( i=0;i<list.size();i++){
// //     System.out.print(list.get(i));
// // }
// //     System.out.print("h");
// // int a[][]=new int[1][1];
//         // return new int[][]=Arrays.toArray(list);
//          return  list.stream()
//                 .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
//                 .toArray(int[][]::new);



        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<intervals.length;i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!list.isEmpty() && list.get(list.size()-1).get(1) >= start)
            {
                continue;
            }
            for(int j = i+1;j<intervals.length;j++)
            {
                if(intervals[j][0]<=end)
                {
                    end = Math.max(end,intervals[j][1]);

                }else{
                    break;
                }
                
            }
            List<Integer> newList = new ArrayList<>();
                newList.add(start);
                newList.add(end);

                list.add(newList);
        }
        return  list.stream()
                .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);


    }
}