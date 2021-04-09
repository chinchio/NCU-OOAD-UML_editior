package component.canvas.point;

import java.util.ArrayList;
import java.util.List;

import component.canvas.CanvasBasicDrawTools;

public class BaseShapeMidPoint {
    private double midPointHightLightRectangleSize = 15.0;
    private Point eastMidPoint, southMidPoint, westMidPoint, northMidPoint;
    private List<Point> shapeMidPoint;

    public BaseShapeMidPoint(double x, double y, double width, double height) {
        this.northMidPoint = new Point(x + width / 2, y);
        this.eastMidPoint = new Point(x + width     , y + height / 2);
        this.southMidPoint = new Point(x + width / 2, y + height    );
        this.westMidPoint = new Point(x             , y + height / 2);

        this.shapeMidPoint = new ArrayList<>();

        this.shapeMidPoint.add(northMidPoint);
        this.shapeMidPoint.add(eastMidPoint);
        this.shapeMidPoint.add(southMidPoint);
        this.shapeMidPoint.add(westMidPoint);
    }

    public void move(double deltaX, double deltaY) {
        for (Point point : this.shapeMidPoint) {
            point.setPoint(point.getX() + deltaX, point.getY() + deltaY);
        }
    }

    public void drawMidPoint(CanvasBasicDrawTools drawTools) {
        for (Point point : this.shapeMidPoint) {
            drawTools.rect(point.getX(), point.getY(), midPointHightLightRectangleSize, midPointHightLightRectangleSize);
        }
    }

    public List<Point> getShapeMidPoints() {
        return this.shapeMidPoint;
    }
}
