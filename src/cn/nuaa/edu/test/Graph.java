package cn.nuaa.edu.test;

/**
 * @author planb
 * @date
 */
public class Graph {                   //A, B, C,D, E, F
    static int[][] graph = new int[][]{{0, 0, 1, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0}};
    int[] help = new int[graph.length];//用来记录已经遍历过的元素

    //DFS(深度优先遍历)同样适用于有向图 A->C->B->D->E->F 即 0->2->1->3->4->5
    public void dfsTraversing(int node, int[][] graph) {
        help[node]=1;
        System.out.println(node);
        for (int i = 0; i < graph[node].length; ++i) {
            if (help[i]==0&&i != node&&graph[node][i]==1) {
                dfsTraversing(i, graph);
            }
        }
    }

    //BFS(广度优先遍历)同样适用于有向图 A->C->D->B->E->F 即0->2->3->1->4->5
    public void bfsTraversing(int[][] graph) {
        int[] queue=new int[graph.length];
        int cnt=1;
        queue[0]=0;//将A作为起始顶点加入队列
        help[0]=1;
        System.out.println(0);
        for (int i=0;i<cnt;++i){
            for (int j=0;j<graph[queue[i]].length;++j){
                if (queue[i]!=j&&graph[queue[i]][j]==1&&help[j]==0){
                    help[queue[i]]=1;
                    queue[cnt++]=j;
                    System.out.println(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Graph().bfsTraversing(graph);
    }
}