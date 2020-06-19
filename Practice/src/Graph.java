//Adjacency List Implementation of graph---Undirectional
import java.util.LinkedList;
public class Graph {
	int V;
	LinkedList<Integer> adjArrayList[];
	
	Graph(int V)
	{
		this.V = V;
		//initilize linkedlists equal to number of vertices
		adjArrayList = new LinkedList[V];
		for (int i =0;i<V;i++)
		{
			adjArrayList[i] = new LinkedList<>();
		}
	}
	
	void addEdge(Graph graph,int src,int dest)
	{
		graph.adjArrayList[src].add(dest);
		graph.adjArrayList[dest].add(src); //since undirectional graph
	}
	
	void printGraph(Graph graph)
	{
		for(int i =0 ;i<graph.V;i++)
		{
			System.out.println("Adjacency list of vertex " + i);
			System.out.println("Head");
			for(Integer pCrawl : graph.adjArrayList[i])
			{
				System.out.println("->" + pCrawl);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String args[])
	{
		int V = 5;
		Graph graph = new Graph(V);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 2, 4);
		graph.addEdge(graph, 3, 4);
		graph.addEdge(graph, 4, 0);
		graph.printGraph(graph);		
	}
}
