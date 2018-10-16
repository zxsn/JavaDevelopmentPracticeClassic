
    /**  
    * @Title: Point.java
    * @Package com.java.development.ten_generics
    * @Description: TODO(用一句话描述该文件做什么)
    * @author Administrator
    * @date 2018年10月16日
    * @version V1.0  
    */
    
package com.java.development.ten_generics;


    /**
     * @ClassName : Point
     * @Description : TODO(这里用一句话描述这个类的作用)
     * @author  Administrator
     * @date  2018年10月16日
     */
    public class Point {
        
            /**
            * @Fields x : TODO(用一句话描述这个变量表示什么)
            */
            
        private Object x;
        
            /**
            * @Fields y : TODO(用一句话描述这个变量表示什么)
            */
            
        private Object y;

        
            /**
             * 创建一个新的实例 com.java.development.ten_generics.Point.
             *
             */
            
        public Point() {
        }

        
            /**
            * @return x
            */
            
        public Object getX() {
            return x;
        }

        
            /**
             * @param x the x to set
             */
            
        public void setX(Object x) {
            this.x = x;
        }

        
            /**
            * @return y
            */
            
        public Object getY() {
            return y;
        }

        
            /**
             * @param y the y to set
             */
            
        public void setY(Object y) {
            this.y = y;
        }
    }