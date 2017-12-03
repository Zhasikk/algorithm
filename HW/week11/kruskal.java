import java.util.*;
public class kruskal {
    static int[] listOfConnections;

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int vertices = sr.nextInt();
        int edges = sr.nextInt();
        Edge[] listOfEdges = new Edge[edges];
        listOfConnections = new int[vertices+1];

        for(int i = 0;i < vertices;i++) {
            listOfConnections[i] = i;
        }

        for(int j = 0;j < edges;j++) {
            int from = sr.nextInt();
            int to = sr.nextInt();
            int weight = sr.nextInt();

            listOfEdges[j] = new Edge(weight, from, to);
        }
        System.out.println("\nMST edges: ");

        Arrays.sort(listOfEdges, (e1,e2) -> Integer.compare(e1.getWeight(),e2.getWeight()));

        int weightOfMST = 0;
        int edgesOfMST = 0;
        int cur = 0;

        while(edgesOfMST < vertices-1 || cur < edges) {

            int a = listOfEdges[cur].getStart();
            int b = listOfEdges[cur].getEnd();
            int w = listOfEdges[cur].getWeight();

            if(find(a) != find(b)) {
                weightOfMST = weightOfMST + w;
                edgesOfMST++;
                connect(a,b);
                System.out.println(a + " " + b + " " + w);
            }
            cur++;
        }
        System.out.println( "\nWeight of MST is: " + weightOfMST);
    }

    static int find(int x) {
        if(listOfConnections[x] == x) {
            return x;
        }
        else {
            return find(listOfConnections[x]);
        }
    }

    static void connect(int x, int y) {
        listOfConnections[find(x)] = find(y);
    }

    static class Edge {
        private int weight;
        private int start;
        private int end;

        public Edge(int w, int a, int b) {
            this.start = a;
            this.end = b;
            this.weight = w;
        }

        public int getWeight() {
            return this.weight;
        }
        public int getStart() {
            return this.start;
        }
        public int getEnd() {
            return this.end;
        }
    }
}
