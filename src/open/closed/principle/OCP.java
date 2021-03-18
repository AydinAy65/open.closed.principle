/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package open.closed.principle;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.random;
import static java.awt.PageAttributes.MediaType.C;

import java.util.Random;
//Random ile şekiller için her defasında farklı bir şekil çizdirmeyi amaçladım fakat olmadı

/**
 *
 * @author Aydın Ay
 */
  
        interface Shape{
         abstract double  calculateArea();
      }


       class Rectangle implements Shape{
        double length;
        double width;

        double getAlan(){
            return length*width;
        }

          @Override
          public double calculateArea() {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      }

       class Circle{
        public double radius;
        public double getRadius(){
          return (22/7)*radius*radius;
        }
      }
        class Square implements Shape{
             int edge;
             public double calculateArea(){
             return edge*edge;
             }
         }
        class Triangle implements Shape{
             int height,floorArea;
             public double calculateArea(){
             return (floorArea*height)/2;
             }
         }

            class DrawingManager{
            void ciz(Shape obj){
               
            if(obj instanceof Circle){
              
              cizCircle((Circle)obj);
          }  
            else if(obj instanceof Rectangle){
              cizRectangle((Rectangle)obj);
                    

          }
        }

         private void cizCircle(Circle c){
             System.out.println("Daire cizildi");
         }
          private void cizRectangle(Rectangle r){
             System.out.println("Dikdortgen cizildi");
         }
      }

      public class OCP {


          public static void main(String[] args) {
              Circle c1=new Circle();
              c1.radius=30;
              Rectangle r1=new Rectangle();
              r1.length=20;
              r1.width=40;
              DrawingManager m=new DrawingManager();
              m.ciz(r1);


          }

      }