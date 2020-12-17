package com.mycompany.ball;

public class BallMain {
    public static void main(String[] args) {
        Ball ball = new BallImpl(20,20,5,30,0);
        Container container = new ContainerImpl(0,0,100,100);


        System.out.println(container);
        while (container.collides(ball)){
            System.out.println(ball);
            ball.move();
            System.out.println(ball);
        }
        System.out.println(container.collides(ball));
    }
}
