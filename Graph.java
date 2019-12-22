import java.util.*;
class Graph
{
	static ArrayList<Integer> adjl[];
	Graph(int v)
	{
		//Integer i[]=new Integer[10];
		adjl=new ArrayList[v];
		for(int i=0;i<v;i++)
		{
			adjl[i]=new ArrayList();
		}
		//System.out.print("graph created with size  "+ v);
			System.out.println();
	}
	static void addEdge(int s,int d)
	{
		adjl[s].add(d);
		//System.out.print("	edge added between nodes   "+s+" and "+d);
		showGraphAsAdjList();
			System.out.println();
	}
	static void removeEdge(int s,int d)
	{
		adjl[s].remove((adjl[s].indexOf(d)));
		System.out.print("	edge removed between nodes   "+s+" and "+d);
		System.out.println();
	}
	static boolean isConnected(int s,int d)
	{
		System.out.print("inside isConnected function "+adjl[s]);
		if(adjl[s].contains(d))
			return true;
		else
			return false;
	}
	static void showGraphAsAdjList()
	{
		int n=adjl.length;
		int i=0;
		while(i<n)
		{
			System.out.print(adjl[i]);
			i++;
		}
	}
	static void visualGraph()
	{
		int n=adjl.length;
		int i=0;
		while(i<n)
		{
			System.out.print(i+"-->");
			System.out.print(adjl[i]);
			System.out.println();
			i++;
		}
	}
	public static void main(String args[])
	{
		Graph g=new Graph(5);
		addEdge(0,1);
		addEdge(1,2);
		addEdge(2,3);
		addEdge(3,0);	
		addEdge(3,4);	
		addEdge(4,0);	
		addEdge(4,2);	
		addEdge(3,1);	
		addEdge(0,2);	
		//showGraphAsAdjList();
		System.out.println("\n\n");
		visualGraph();

		System.out.println(isConnected(4,2));
		removeEdge(4,2);

		System.out.println(isConnected(4,2));
	}
}
