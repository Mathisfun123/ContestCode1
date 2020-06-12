import java.util.HashSet;

public class DFS_cycles {
	static int[][] graph = {
			{0, 1, 0, 0, 0},
			{1, 0, 1, 1, 0},
			{0, 1, 0, 0, 1},
			{0, 1, 0, 0, 1},
			{0, 0, 1, 1, 0}
	};
	public static void main(String[] args) {
		System.out.println(hasCycle());

	}
	static boolean hasCycle(){
		HashSet<Integer> visited = new HashSet<>();
		for(int i = 0; i< 5; i++){
			if(dfs(i, visited, -1)){
				return true;
			}
		}
		return false;
	}
	static boolean dfs(int vertex, HashSet<Integer> visited, int parent){
		visited.add(vertex);
		for(int v = 0; v< 5; v++){
			if(graph[vertex][v]==1){
				if(v==parent){
					continue;
				}
				if(visited.contains(v)){
					return true;
				}
				if(dfs(v, visited, vertex)){
					return true;
				}
			}
		}
		return false;
	}

}
