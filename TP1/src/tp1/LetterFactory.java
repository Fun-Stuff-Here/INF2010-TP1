package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    // TODO
    public static BaseShape create_e() {
        return new BaseShape().add(new Rectangle(stripeThickness,maxHeight)
                .translate(new Point2d(-halfMaxWidth,0.0)));
    }

    // TODO
    public static BaseShape create_a() {
        return new BaseShape().add(new Ellipse(maxWidth, maxHeight))
                .add((new Rectangle(halfStripeThickness, maxHeight))
                        .translate(new Point2d(halfMaxWidth, 0.0)))
                .remove(new Ellipse(maxWidth - stripeThickness, maxHeight - stripeThickness));
    }

    // TODO
    public static BaseShape create_C() {
        return new BaseShape().add(new Ellipse(maxWidth, maxHeight))
                                .remove(new Ellipse(maxWidth-stripeThickness, maxHeight - stripeThickness))
                                .remove(new Rectangle(stripeThickness, halfMaxHeight)
                                                .translate(new Point2d(halfMaxWidth, 0.0)));
    }

    // TODO
    public static BaseShape create_l() {

        return new Rectangle(maxWidth, stripeThickness);
    }

    // TODO
    public static BaseShape create_i() {
        return new Square(100.0);
    }

    // TODO
    public static BaseShape create_A() {
        return new BaseShape().add(new Ellipse(maxWidth, maxHeight)).
                remove(new Ellipse(maxWidth-stripeThickness, maxHeight - stripeThickness)).
                remove((new Rectangle(stripeThickness, halfMaxHeight)).translate(new Point2d(halfMaxWidth, 0.0)));
    }

    // TODO
    public static BaseShape create_V() {
        return new BaseShape().add(new Rectangle(maxHeight,stripeThickness)
                                        .translate(new Point2d(-halfMaxHeight,0.0)))
                                .rotate(Math.PI/5)
                                .add( new Rectangle(maxHeight,stripeThickness)
                                        .translate(new Point2d(-halfMaxHeight,0.0)))
                                .rotate(Math.PI/2.5)
                ;
    }

    // TODO
    public static BaseShape create_n() {
        return new Square(100.0);
    }

    // TODO
    public static BaseShape create_r() {
        return new BaseShape().add(new Rectangle(stripeThickness,maxHeight)
                        .translate(new Point2d(-halfMaxWidth,0.0)))
                .add(new Ellipse(maxWidth+4*stripeThickness,halfMaxHeight)
                        .remove(new Rectangle(4*stripeThickness,maxHeight)
                                .translate(new Point2d(-halfMaxWidth,0.0)))
                        .remove(new Ellipse(maxWidth+1.5*stripeThickness,halfMaxHeight-1.5*stripeThickness))
                        .translate(new Point2d(-1.3*stripeThickness,-halfMaxHeight/2.5))
                        .remove(new Rectangle(2*maxWidth,4*stripeThickness)))

                ;
    }

    // TODO
    public static BaseShape create_B() {
        return new BaseShape().add(new Rectangle(stripeThickness,maxHeight)
                                        .translate(new Point2d(-halfMaxWidth,0.0)))
                                .add(new Ellipse(maxWidth+4*stripeThickness,halfMaxHeight)
                                        .remove(new Rectangle(4*stripeThickness,maxHeight)
                                                    .translate(new Point2d(-halfMaxWidth,0.0)))
                                        .remove(new Ellipse(maxWidth+1.5*stripeThickness,halfMaxHeight-1.5*stripeThickness))
                                        .translate(new Point2d(-1.3*stripeThickness,halfMaxHeight/2)))
                                .add(new Ellipse(maxWidth+4*stripeThickness,halfMaxHeight)
                                        .remove(new Rectangle(4*stripeThickness,maxHeight)
                                                .translate(new Point2d(-halfMaxWidth,0.0)))
                                        .remove(new Ellipse(maxWidth+1.5*stripeThickness,halfMaxHeight-1.5*stripeThickness))
                                        .translate(new Point2d(-1.3*stripeThickness,-halfMaxHeight/2)))
                                        ;
    }
}
