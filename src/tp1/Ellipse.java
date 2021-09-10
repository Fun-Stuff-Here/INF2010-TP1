package tp1;

import java.util.Collection;

public class Ellipse extends BaseShape {
    // TODO creer une ellipse avec une largeur et une longueur.
    public Ellipse(Double widthRadius, Double heightRadius) {
        double maxX = widthRadius/2;
        double x = -maxX;
        double maxY = heightRadius/2;
        double y = -maxY;

        while (x<maxX){
            while (y<maxY){
                Double equation = ((Math.pow(x,2)/Math.pow(widthRadius/2,2))+(Math.pow(y,2)/Math.pow(heightRadius/2,2)));
                if(Math.round(equation * 10000.0) / 10000.0 <= 1.0 )
                    add(new Point2d(x,y));
                y += increment;
            }
            x += increment;
            y= -maxY;
        }
    }

    // TODO creer une ellipse avec les dimensions contenu dans un Point.
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    // TODO initialiser le parent.
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Ellipse translate(Point2d point) {
        super.translate(point);
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Ellipse rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Ellipse clone() { return new Ellipse(getCoords()); }
}
