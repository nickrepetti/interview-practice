import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class UnweightedGraph {

  private Map<Integer, Vertex> vertices;

  public UnweightedGraph() {
    vertices = new HashMap<Integer, Vertex>();
  }

  public void addVertex(Vertex v) {
    vertices.put(v.getId(), v);
  }

  private Vertex getVertex(int id) {
    return vertices.get(id);
  }

  public void addEdge(int source, int destination) {
    Vertex s = getVertex(source);
    Vertex d = getVertex(destination);
    s.getAdjacent().add(d);
  }

  public List<Vertex> shortestPath(int source, int destination) {
    Vertex s = getVertex(source);
    Vertex d = getVertex(destination);

    if (s == null || d == null) {
      return null;
    }

    boolean pathFound = false;

    Queue<Vertex> q = new LinkedList<Vertex>();
    q.add(s);

    while (!q.isEmpty()) {
      Vertex v = q.remove();

      // Visit v

      // If we've reached our desination, stop
      if (v == d) {
        pathFound = true;
        break;
      }

      for (Vertex adj : v.getAdjacent()) {
        // Check if we've visited already
        if (adj != s && adj.getParent() == null) {
          adj.setParent(v);
          q.add(adj);
        }
      }
    }

    // Generate path
    List<Vertex> path = new LinkedList<Vertex>();

    if (!pathFound) {
      resetVertices();
      return path;
    }

    Vertex cur = d;
    while (cur != null) {
      path.add(cur);
      cur = cur.getParent();
    }

    resetVertices();

    Collections.reverse(path);

    return path;
  }

  private void resetVertices() {
    for (Map.Entry<Integer, Vertex> pair : vertices.entrySet()) {
      Vertex v = pair.getValue();
      v.setParent(null);
    }
  }

}

