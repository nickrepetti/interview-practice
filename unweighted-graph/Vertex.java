import java.util.List;
import java.util.ArrayList;

public class Vertex {

  private int id;
  private State state;
  private List<Vertex> adjacent;
  private Vertex parent;

  public Vertex(State state) {
    this.id = state.getId();
    this.state = state;
    adjacent = new ArrayList<Vertex>();
    parent = null;
  }

  public int getId() {
    return id;
  }

  public void setParent(Vertex parent) {
    this.parent = parent;
  }

  public Vertex getParent() {
    return parent;
  }

  public List<Vertex> getAdjacent() {
    return adjacent;
  }

  public State getState() {
    return state;
  }

  @Override
  public String toString() {
    return state.toString();
  }

}

