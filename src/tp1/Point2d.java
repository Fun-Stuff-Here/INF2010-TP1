package tp1;

public class Point2d extends AbstractPoint {
    public static final Integer X = 0;
    public static final Integer Y = 1;

    // TODO creer un point en 2d avec 2 donnees
    public Point2d(Double x, Double y) {
        super(new Double[] {x, y});
    }

    // TODO creer un point a partir d'un vecteur de donnees
    public Point2d(Double[] vector) {
        super(new Double[] {vector[X], vector[Y]});
    }

    public Double X() { return vector[X];}
    public Double Y() { return vector[Y];}

    // TODO appliquer la transalation sur la classe courrante et retourner la reference
    @Override
    public Point2d translate(Double[] translateVector) {
        PointOperator.translate(vector,translateVector);
        return this;
    }

    // TODO appliquer la transalation sur la classe courrante et retourner la reference
    public Point2d translate(Point2d translateVector) {
        return translate(translateVector.vector);
    }

    // TODO appliquer la rotation sur la classe courrante et retourner la reference
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        PointOperator.rotate(vector,rotationMatrix);
        return this;
    }

    // TODO appliquer la rotation sur la classe courrante et retourner la reference
    public Point2d rotate(Double angle) {
        Double[][] rotationMatrix = new Double[2][2];
        rotationMatrix[0][0]= Math.cos(angle);
        rotationMatrix[0][1]= -1 *Math.sin(angle);
        rotationMatrix[1][0]= Math.sin(angle);
        rotationMatrix[1][1] =Math.cos(angle);
        return rotate(rotationMatrix);
    }

    // TODO appliquer la division sur la classe courrante et retourner la reference
    @Override
    public Point2d divide(Double divider) {
        PointOperator.divide(vector,divider);
        return this;
    }

    // TODO appliquer la multiplication sur la classe courrante et retourner la reference
    @Override
    public Point2d multiply(Double multiplier) {
        PointOperator.multiply(vector,multiplier);
        return this;
    }

    // TODO appliquer la addition sur la classe courrante et retourner la reference
    @Override
    public Point2d add(Double adder) {
        return translate(new Double[]{adder,adder});
    }

    // TODO creer un nouveau point.
    @Override
    public Point2d clone() {
        return new Point2d(vector[X],vector[Y]);
    }
}
