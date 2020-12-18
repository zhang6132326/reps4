package com.zxf.ocp;

import com.sun.javafx.geom.ShapePair;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}
//绘图类
class GraphicEditor{
    public void drawShape(Shape s){
        if(s.m_type==1){
            drawRectangle(s);
        }else if(s.m_type==2){
            drawCircle(s);
        }
    }
    public void drawRectangle(Shape shape){
        System.out.println("矩形");
    }
    public void drawCircle(Shape shape){
        System.out.println("圆形");
    }

}
class Shape{
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.m_type=1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}