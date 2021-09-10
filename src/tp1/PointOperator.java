package tp1;

public final class PointOperator {

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void translate(Double[] vector, Double[] translateVector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] += translateVector[i];
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        if(vector.length != rotationMatrix.length) {
            System.out.print("vector and rotation Matrix aren't the same size\n Rotation is impossible\n");
            return;
        }
        Double[] tempVector = vector.clone();
        for (int i = 0; i < rotationMatrix.length; i++) {
            vector[i]=0.0;
            for (int j = 0; j < vector.length; j++) {
                vector[i] += rotationMatrix[i][j]*tempVector[j];
            }
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void divide(Double[] vector, Double divider) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] /= divider;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void multiply(Double[] vector, Double multiplier) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= multiplier;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void add(Double[] vector, Double adder) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] += adder;
        }
    }
}
