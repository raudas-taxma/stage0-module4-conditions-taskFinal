package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean first = secondSide + thirdSide > firstSide;
        boolean second = firstSide + thirdSide > secondSide;
        boolean third = firstSide + secondSide > thirdSide;
        boolean flag = first && second && third;

        System.out.println(flag ? "this is a valid triangle" : "it's not a triangle");

    }
}
