package tp1;

import java.util.ArrayList;
import java.util.Collection;

public class BaseShape implements Cloneable {
    private Collection<Point2d> coords;
    protected final static Double increment =1.0;
    // TODO Initialiser la liste de points.
    public BaseShape() {
        coords = new ArrayList<Point2d>();
    }

    // TODO prendre une liste de points et creer une nouvelle forme.
    public BaseShape(Collection<Point2d> coords) {
        this.coords = new ArrayList<Point2d>();
        for (Point2d coord:coords){
            this.coords.add(coord.clone());
        }
    }

    // TODO ajouter ou retirer des coordonnees a la liste de points.
    public BaseShape add(Point2d coord) {
        coords.add(coord.clone());
        return this;
    }
    public BaseShape add(BaseShape shape) {
        for (Point2d coord: shape.coords) {
            add(coord);
        }
        return this;
    }
    public BaseShape addAll(Collection<Point2d> coords) {
        for (Point2d coord: coords) {
            add(coord);
        }
        return this;
    }
    public BaseShape remove(Point2d coord) {
        coords.remove(coord);
        return this;
    }
    public BaseShape remove(BaseShape shape) {
        for (Point2d point: shape.coords) {
            remove(point);
        }
        return this;
    }
    public BaseShape removeAll(Collection<Point2d> coords) {
        for (Point2d coord:coords) {
            remove(coord);
        }
        return this;
    }

    // TODO retourner les coordonnees de la liste.
    public Collection<Point2d> getCoords() {
        return new ArrayList<Point2d>(coords);
    }

    // TODO retourner une nouvelle liste ou tous les points sont des copy
    public Collection<Point2d> getCoordsDeepCopy() {
        ArrayList<Point2d> coordsCopy = new ArrayList<Point2d>();
        for (Point2d coord:coords) {
            coordsCopy.add(coord.clone());
        }
        return  coordsCopy;
    }

    // TODO appliquer la translation sur la forme.
    public BaseShape translate(Point2d point) {
        for (Point2d coord:coords) {
            coord.translate(point);
        }
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    public BaseShape rotate(Double angle) {
        for (Point2d coord:coords) {
            coord.rotate(angle);
        }
        return this;
    }

    private Double max(Integer index){
        if(coords.size() == 0)
            return -Double.MAX_VALUE;
        Double maximum= coords.iterator().next().vector[index];
        for (Point2d coord:coords) {
            maximum = Math.max(maximum,coord.vector[index]);
        }
        return maximum;
    }

    // TODO donner la plus grande valeur en X
    public Double getMaxX() {
        return max(Point2d.X);
    }

    // TODO donner la plus grande valeur en Y
    public Double getMaxY() {
        return max(Point2d.Y);
    }

    // TODO donner les plus grandes valeurs en X et Y
    public Point2d getMaxCoord() {
        return new Point2d(getMaxX(),getMaxY());
    }

    private  Double min(Integer index){
        if(coords.size() == 0)
            return Double.MAX_VALUE;
        Double minimum= coords.iterator().next().vector[index];
        for (Point2d coord:coords) {
            minimum = Math.min(minimum,coord.vector[index]);
        }
        return minimum;
    }

    // TODO donner la plus petite valeur en X
    public Double getMinX() {
        return min(Point2d.X);
    }
    // TODO donner la plus petite valeur en Y
    public Double getMinY() {
        return min(Point2d.Y);
    }

    // TODO donner les plus petites valeurs en X et Y
    public Point2d getMinCoord() {
        return new Point2d(getMinX(),getMinY());
    }

    // TODO retourner une nouvelle forme.
    public BaseShape clone() {
        return new BaseShape(getCoordsDeepCopy());
    }
}
