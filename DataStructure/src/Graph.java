import java.util.LinkedList;
import java.util.Iterator;

class Graph
{
   int numVertices;   
   LinkedList<Integer> adjNodes[]; // Adjacency list
 
   Graph(int vertex)
   {
    	
    numVertices = vertex;
    	
    // For each vertex a new adjacentList is created so that when an edge is created 
    // they can be linked 
    adjNodes = new LinkedList[vertex];
         
    for(int i = 0; i < vertex; ++i)
      adjNodes[i] = new LinkedList();
   }
   
   void addEdge(int vertex, int destVertex)
   {
	 // Creating an edge between two nodes  
     adjNodes[vertex].add(destVertex);
   }
     

   void DFSRecur(int vertex, boolean visitedVertices[])
   {
     // The current vertex is marked visited and then printed
     visitedVertices[vertex] = true;
     System.out.print(vertex+" ");
 
     // Recur for all the vertices adjacent to this vertex
     Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
     while(adjVertexList.hasNext())
     {
       int i = adjVertexList.next();
       if(!visitedVertices[i])
         DFSRecur(i, visitedVertices);
     }
   }
 
   void DFS(int vertex)
   {
     // Boolean array to keep track of visited vertices, mark all the vertices as not visited
     boolean visitedVertices[] = new boolean[numVertices];
     DFSRecur(vertex, visitedVertices);
   }
 
   void BFS(int vertex)
   {
     // Boolean array to keep track of visited vertices, mark all the vertices as not visited
        boolean visitedVertices[] = new boolean[numVertices];
 
     // A temporary queue to put all the adjacent nodes from the source vertex
     LinkedList<Integer> tempQueue = new LinkedList<Integer>();
     visitedVertices[vertex]=true;
     tempQueue.add(vertex); // Adding the current vertex to the queue
 
     while(!tempQueue.isEmpty())
     {
       // Pop the vertex from the queue and print it 
       vertex = tempQueue.poll();
       System.out.print(vertex+" ");
 
       // Finding all the adjacent vertices of the poped out vertex and put them in the tempQueue for theirs to be fund
       Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
       while(adjVertexList.hasNext())
       {
         int i = adjVertexList.next();
                
         // If the vertex has not been visited, add it to the queue
         if(!visitedVertices[i])
         {
           visitedVertices[i] = true;
           tempQueue.add(i);
         }
        }
      }
    }
    
    void topSort(int vertex, boolean visitedVertices[], Stack tempStack)
    {
	  // Boolean array to keep track of visited vertices, mark all the vertices as not visited
	  visitedVertices[vertex] = true;
	  int i;

	  // To find all the adjacent vertices by a recursive call to the function, just like DFS 
	  Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
	  while (adjVertexList.hasNext())
	  {
        i = adjVertexList.next();
        if(!visitedVertices[i])
        topSort(i, visitedVertices, tempStack);
	  }

	  // Adding the adjacent vertex found in the tempStack
	  tempStack.push(new Integer(vertex));
   }

  
   void topologicalSort()
   {
	 // Temp stack for putting all the visitedVertices adjacent vertices in   
	 Stack tempStack = new Stack();

	 // Mark all the vertices as not visited
	 boolean visitedVertices[] = new boolean[numVertices];
	 for(int i = 0; i < numVertices; i++)
		visitedVertices[i] = false;

	 // Recursive call to store all the adjacent vertices of the vertex and push them to the stack
	 for(int i = 0; i < numVertices; i++)
	  if(visitedVertices[i] == false)
		topSort(i, visitedVertices, tempStack);

	 // Printing the stack to show the topological sort 
	 while(!tempStack.isEmpty())
	  System.out.print(tempStack.pop() + " ");
   }
}