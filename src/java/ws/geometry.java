/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "geometry")
public class geometry {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "AreaCircle")
    public double AreaCircle(@WebParam(name = "radius") double radius) {
        try {
            return Math.PI * (radius * radius);
        } catch (NumberFormatException ex) {
            return 91;
        }
    }

    @WebMethod(operationName = "AreaSquare")
    public double AreaSquare(@WebParam(name = "side") double side) {
        try {
            return side * side;
        } catch (NumberFormatException ex) {
            return 91;
        }
    }

    @WebMethod(operationName = "AreaRectangle")
    public double AreaRectangle(@WebParam(name = "width") double width, @WebParam(name = "length") double length) {
        try {
            return length * width;
        } catch (NumberFormatException ex) {
            return 91;
        } catch (Exception e) {
            return 01;
        }
    }

    @WebMethod(operationName = "AreaTriangle")
    public double AreaTriangle(@WebParam(name = "base") double base, @WebParam(name = "height") double height) {
        try {
            return (base * height) / 2;
        } catch (NumberFormatException ex) {
            return 91;
        } catch (Exception e) {
            return 01;
        }
    }

    @WebMethod(operationName = "AreaEllipse")
    public float AreaEllipse(@WebParam(name = "floata") float a, @WebParam(name = "floatb") float b) {
        try {
            return (float) 3.142 * a * b;
        } catch (NumberFormatException ex) {
            return 91;
        } catch (Exception e) {
            return 01;
        }
    }

    @WebMethod(operationName = "AreaSector")
    public double AreaSector(@WebParam(name = "radius") double radius, @WebParam(name = "angle") double angle) {
        try {
            return ((22 * radius * radius) / 7) * (angle / 360);
        } catch (NumberFormatException ex) {
            return 91;
        } catch (Exception e) {
            return 01;
        }
    }

    @WebMethod(operationName = "AreaPolygon")
    public double AreaPolygon(@WebParam(name = "sides") double n, @WebParam(name = "sidelength") double ln) {
        try {
            double angle = Math.toRadians(180 / n);
            angle = Math.tan(angle);
            return ((ln * ln * n) / (4 * angle));
        } catch (NumberFormatException ex) {
            return 91;
        } catch (Exception e) {
            return 01;
        }
    }
}
