package CaUtil;

public class UnionFind {
    private int[] parents;

    public UnionFind(int n) {
        parents = new int[n];
        for(int i = 0; i < n; i++)
            parents[i] = i;
    }

    public int find(int cur) {
        if (cur == parents[cur])
            return cur;

        return parents[cur] = find(parents[cur]);
    }

    public void union(int node1, int node2) {
        int node1Parent = find(node1);
        int node2Parent = find(node2);

        if(node1Parent == node2Parent)
            return;

        parents[node2Parent] = node1Parent;
    }
}
