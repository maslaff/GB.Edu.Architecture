package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.Id = id;
        this.Models = models;
        this.Flashes = flashes;
        this.cameras = cameras;
    }

    public <T> T method1(T varT) {
        return varT;
    }

    public <T, E> T method2(T varT, E varE) {
        return varT;
    }
}
