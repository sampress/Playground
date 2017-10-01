import java.util.LinkedList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;



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
     
   void addEdgeUndirected(int v,int w) {
       adjNodes[v].add(w);
       adjNodes[w].add(v);
   }

   void DFSRecur(int vertex, HashSet<Integer> visited)
   {
     // The current vertex is marked visitedVertices and then printed
     visited.add(vertex);
     System.out.print(vertex+" ");
 
     // Recur for all the vertices adjacent to this vertex
     Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
     while(adjVertexList.hasNext())
     {
       int i = adjVertexList.next();
       if(!visited.contains(i))
         DFSRecur(i, visited);
     }
   }
 
   void DFS(int vertex)
   {
     // Boolean array to keep track of visitedVertices vertices, mark all the vertices as not visitedVertices
	   HashSet<Integer> visited = new HashSet<Integer>();
     DFSRecur(vertex, visited);
   }
 
   void BFS(int vertex)
   {
     // Boolean array to keep track of visitedVertices vertices, mark all the vertices as not visitedVertices
	   HashSet<Integer> visited = new HashSet<Integer>();
 
     // A temporary queue to put all the adjacent nodes from the source vertex
     LinkedList<Integer> tempQueue = new LinkedList<Integer>();
     visited.add(vertex);
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
                
         // If the vertex has not been visitedVertices, add it to the queue
         if(!visited.contains(i))
         {
           visited.add(i);
           tempQueue.add(i);
         }
        }
      }
    }
   
   public boolean GS(int vertex, int finalVertex, LinkedList<Integer> frontier)
   {
	   HashSet<Integer> explored = new HashSet<Integer>();
	   frontier.add(vertex);
	   while(!frontier.isEmpty())
	   {
		 int node = frontier.pop();   
		 if(node == finalVertex)
		 {
			 return true;
		 }
		 if(explored.contains(node))
		 {
			 continue;
		 }
		 explored.add(node);
		 
		 Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
	       while(adjVertexList.hasNext())
	       {
	         int i = adjVertexList.next();
	                
	         // If the vertex has not been visitedVertices, add it to the queue
	         if(!explored.contains(i) && !frontier.contains(i))
	         {
	           frontier.push(i);
	         }
	        }
	       
		
	   }
	   return false;
   }
    
   public boolean D(int vertex, int finalvertex)
   {
	   LinkedList<Integer> frontier = new LinkedList<Integer>();
	  return GS(vertex, finalvertex, frontier);
   }
    
   
   public void topologicalSort()
   {
	   Stack tempStack = new Stack();
	   HashSet<Integer> visited = new HashSet<Integer>();
	   for(int i = 0; i < numVertices; i++)
	   {
		  if(!visited.contains(i))
		    topologicalSortUtil(i, tempStack, visited);
	    }
	   
	// Printing the stack to show the topological sort 
		 while(!tempStack.isEmpty())
		  System.out.print(tempStack.pop() + " ");

   }
   
   public void topologicalSortUtil(int vertex, Stack tempStack, HashSet<Integer> visited )
   {
	   visited.add(vertex);
	   
	// Recursive call to store all the adjacent vertices of the vertex
       Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
       while(adjVertexList.hasNext())
       {
         int i = adjVertexList.next();
         
         if(!visited.contains(i))
        	 topologicalSortUtil(i, tempStack, visited);
       }
       // Adding the adjacent vertex found in the tempStack
 	  tempStack.push(new Integer(vertex));

        
   }
   
   
   
   public Boolean isCyclicDirected()
   {
	   ArrayList<Integer> recStack =new ArrayList<Integer>();
	   
	   for(int i = 0; i < numVertices; i++)
		      if(isCyclicDirectedUtil(i, recStack))
		        return true;
		    
	return false;
   }
   
   public Boolean isCyclicDirectedUtil(int vertex, ArrayList<Integer> recStack)
   {
	  recStack.add(vertex);
	   
	// Recursive call to store all the adjacent vertices of the vertex
       Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
       while(adjVertexList.hasNext())
       {
         int i = adjVertexList.next();
         
          if (recStack.contains(i))
             return true; 
          else if(isCyclicDirectedUtil(i, recStack))
          return true;
               
        }       
       
     
       recStack.remove(vertex);  
       return false;
   }
   
   public Boolean isCyclicUndirected()
   {
	   HashSet<Integer> visited = new HashSet<Integer>();
	   Map<Integer, Integer> parent = new HashMap<Integer, Integer>();
	   
	   for(int i = 0; i < numVertices; i++)
	   {
		   if(!visited.contains(i))
		   {
			   parent.put(i, null);
	           if(isCyclicUndirectedUtil(i, null, visited))
		        return true;
		   }
	   }
	   
	           return false;
   }
   
   public Boolean isCyclicUndirectedUtil(int vertex, Map<Integer, Integer> parent, HashSet<Integer> visited )
   {
	   visited.add(vertex);
	// Recursive call to store all the adjacent vertices of the vertex
       Iterator<Integer> adjVertexList = adjNodes[vertex].listIterator();
       while(adjVertexList.hasNext())
       {
         int i = adjVertexList.next();
         
         if(visited.contains(i))
         {
           if(parent.containsKey(i))
             return true;
         } 
         else if(isCyclicUndirectedUtil(i, parent, visited))
        	 return true;
       }
       
	   return false;
   }
   
 
}