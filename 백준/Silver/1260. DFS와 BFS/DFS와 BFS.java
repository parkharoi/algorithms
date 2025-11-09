import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	
	static ArrayList<ArrayList<Integer>> adj;
	static boolean[] visited;
	
	public static void dfsIterative(int startNode) {
		Stack<Integer> stack = new Stack<>();
        
		stack.push(startNode);
        
		while(!stack.isEmpty()) {
			int node = stack.pop();

			if(!visited[node]) {
				visited[node] = true;
				System.out.print(node + " ");


				for(int i = adj.get(node).size() - 1; i >= 0; i--) {
					int nextNode = adj.get(node).get(i);
					if(!visited[nextNode]) {
						stack.push(nextNode);
					}
				}
			}
		}
	}
    
	public static void bfs(int startNode) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(startNode);
		visited[startNode] = true;
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");
			
			for (int nextNode : adj.get(node) ) {
				if(!visited[nextNode]) {
					visited[nextNode] = true;
					queue.offer(nextNode);
				}
			}
		}
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		adj = new ArrayList<>(N+1);
		for(int i=0; i<=N; i++) {
			adj.add(new ArrayList<>());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		for(int i =1; i<=N; i++) {
			Collections.sort(adj.get(i));
		}
		visited = new boolean[N + 1];
		dfsIterative(V); 
		System.out.println();
		
		visited = new boolean[N + 1];
		bfs(V);
	}
}