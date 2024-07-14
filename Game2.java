        import image.*;
        import world.*;

        public class Game2 extends World{
            public static void main(String[] args){
                new Game2()
                     .bigBang();
            }
            Scene scene;
            //Posn p;
            Ball ball;
            /*
            Posn rectanglePosition;
            Posn rectanglePosition2;
            Posn rectanglePosition3;
            Posn rectanglePosition4;
            Posn rectanglePosition5;
            Posn rectanglePosition6;
            */
            ILoRect lor;
            Game2(){
                 this.scene = new EmptyScene(1000, 600);
                // this.p = new Posn(100, 300);
                 this.ball = new Ball(new Posn(100, 300));
                 this.lor = new MtLoRect();
                 this.lor = new ConsLoRect(new Rect(new Posn(170, 330)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(70, 330)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(990, 330)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(0, 300)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(470, 300)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(570, 300)), this.lor);

                 /*
                 this.rectanglePosition = new Posn(170, 330);
                 this.rectanglePosition2 = new Posn(70, 330);
                 this.rectanglePosition3 = new Posn(990, 300);
                 this.rectanglePosition4 = new Posn(0, 300);
                 this.rectanglePosition5 = new Posn(470, 300);
                 this.rectanglePosition6 = new Posn(570, 300);
                 */
            }

            Game2(Scene scene, Ball ball,
                  //Posn p,
                //  Posn rectanglePosition, Posn rectanglePosition2, Posn rectanglePosition3, Posn rectanglePosition4, Posn rectanglePosition5, Posn rectanglePosition6 ){
                  ILoRect lor){
                  this.scene = scene;
                // this. p = p;
                 this.ball = ball;
                 this.lor = lor;
                 /*
                 this.lor = new MtLoRect();
                 this.lor = new ConsLoRect(new Rect(rectanglePosition), this.lor);
                 this.lor = new ConsLoRect(new Rect(rectanglePosition2), this.lor);
                 this.lor = new ConsLoRect(new Rect(rectanglePosition3), this.lor);
                 this.lor = new ConsLoRect(new Rect(rectanglePosition4), this.lor);
                 this.lor = new ConsLoRect(new Rect(rectanglePosition5), this.lor);
                 this.lor = new ConsLoRect(new Rect(rectanglePosition6), this.lor);
                */
                 /*
                 this.rectanglePosition = rectanglePosition;
                 this.rectanglePosition2 = rectanglePosition2;
                 this.rectanglePosition3 = rectanglePosition3;
                 this.rectanglePosition4 = rectanglePosition4;
                 this.rectanglePosition5 = rectanglePosition5;
                 this.rectanglePosition6 = rectanglePosition6;
           */
           }


            public Game2 onTick(){
              /*
               int newX = this.rectanglePosition.x;
               int newY = this.rectanglePosition.y;

               int newX2 = this.rectanglePosition2.x;
               int newY2 = this.rectanglePosition2.y;

               int newX3 = this.rectanglePosition3.x;
               int newY3 = this.rectanglePosition3.y;

               int newX4 = this.rectanglePosition4.x;
               int newY4 = this.rectanglePosition4.y;

               int newX5 = this.rectanglePosition5.x;
               int newY5 = this.rectanglePosition5.y;

               int newX6 = this.rectanglePosition6.x;
               int newY6 = this.rectanglePosition6.y;

              if (this.rectanglePosition.y <= 800) {
                 newX += 3;
                 newY += 5;
              } else if (this.rectanglePosition.x >= 980) {
                 newX -= 930;
                 newY = 0;
              } else {
                 newX -= 8;
                 newY -= 994;
              }

              if (this.rectanglePosition2.y <= 800) {
                 newX2 += 7;
                 newY2 += 19;
              } else if (this.rectanglePosition2.x >= 980) {
                 newX2 -= 990;
                 newY2 -= 200;
              } else {
                 newX2 -= 8;
                 newY2 -= 994;
              }

              if (this.rectanglePosition3.y <= 800) {
                 newX3 -= 10;
                 newY3 += 19;
              } else if (this.rectanglePosition3.x <= 1) {
                 newX3 += 990;
                 newY3 = 0;
              } else {
                 newX3 -= 18;
                 newY3 -= 594;
              }

              if (this.rectanglePosition4.y <= 800) {
                 newX4 += 3;
                 newY4 += 5;
              } else if (this.rectanglePosition4.x >= 980) {
                 newX4 -= 930;
                 newY4 = 0;
              } else {
                 newX4 -= 88;
                 newY4 -= 894;
              }

              if (this.rectanglePosition5.y <= 800) {
                 newX5 -= 10;
                 newY5 += 10;
              } else if (this.rectanglePosition5.x <= 1) {
                 newX5 += 800;
                 newY5 = 10;
              } else {
                 newX5 -= 18;
                 newY5 -= 594;
              }

              if (this.rectanglePosition6.y <= 800) {
                 newX6 += 3;
                 newY6 += 5;
              } else if (this.rectanglePosition6.x >= 980) {
                 newX6 -= 930;
                 newY6 = 0;
              } else {
                 newX6 -= 8;
                 newY6 -= 594;
              }
              */
             // move all posns by incrementing or decrementing x, y
              // if x >=980 : make it 960 and y = 0
              // otherwise decrement by 8 x and decrement by 594
              // if
              return new Game2(this.scene, this.ball,
                              //this.p,
                            //  new Posn(newX, newY), new Posn(newX2, newY2), new Posn(newX3, newY3), new Posn(newX4, newY4), new Posn(newX5, newY5), new Posn(newX6, newY6));
                               this.lor.move());
            }



            public Scene onDraw() {
    //Scene updatedScene = this.scene.placeImage(new Circle(10, "solid", "red"), this.p.x, this.p.y);

    Scene updatedScene = this.ball.draw(this.scene);
    updatedScene = this.lor.draw(updatedScene);
    /*
    updatedScene = updatedScene.placeImage(new Rectangle(140, 20, "solid", "black"), this.rectanglePosition.x, this.rectanglePosition.y);
    updatedScene = updatedScene.placeImage(new Rectangle(140, 20, "solid", "black"), this.rectanglePosition2.x, this.rectanglePosition2.y);
    updatedScene = updatedScene.placeImage(new Rectangle(140, 20, "solid", "black"), this.rectanglePosition3.x, this.rectanglePosition3.y);
    updatedScene = updatedScene.placeImage(new Rectangle(140, 20, "solid", "black"), this.rectanglePosition4.x, this.rectanglePosition4.y);
    updatedScene = updatedScene.placeImage(new Rectangle(140, 20, "solid", "black"), this.rectanglePosition5.x, this.rectanglePosition5.y);
    updatedScene = updatedScene.placeImage(new Rectangle(140, 20, "solid", "black"), this.rectanglePosition6.x, this.rectanglePosition6.y);
    */

    // background should be revised!!
    int platform1X = 100;
    int platform1Y = 1120;
    int platform1Width = 150;
    int platform1Height = 1620;

    int platform2X = 300;
    int platform2Y = 1120;
    int platform2Width = 150;
    int platform2Height = 1620;

    int platform3X = 500;
    int platform3Y = 1120;
    int platform3Width = 150;
    int platform3Height = 1620;

    int platform4X = 700;
    int platform4Y = 1120;
    int platform4Width = 150;
    int platform4Height = 1620;

    int platform5X = 900;
    int platform5Y = 1120;
    int platform5Width = 150;
    int platform5Height = 1620;



    updatedScene = updatedScene.placeImage(new Rectangle(platform1Width, platform1Height, "solid", "blue"), platform1X, platform1Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform2Width, platform2Height, "solid", "green"), platform2X, platform2Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform3Width, platform3Height, "solid", "yellow"), platform3X, platform3Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform4Width, platform4Height, "solid", "orange"), platform4X, platform4Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform5Width, platform5Height, "solid", "purple"), platform5X, platform5Y);


    return updatedScene;
}




            public Game2 onMouse(int x, int y, String me){
                if(me.equals("button-down")){
                    return new Game2(this.scene, new Ball(new Posn (500, 300)),
                                     this.lor);
                                     //rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                } else {
                  return this;
                }
           }

            public boolean stopWhen (){
              /*
              boolean collidedWithEnemy = (Math.abs(this.ball.p.x - this.rectanglePosition.x) < 30) && (Math.abs(this.ball.p.y - this.rectanglePosition.y) < 30);
              boolean collidedWithEnemy2 = (Math.abs(this.ball.p.x - this.rectanglePosition2.x) < 30) && (Math.abs(this.ball.p.y - this.rectanglePosition2.y) < 30);
              boolean collidedWithEnemy3 = (Math.abs(this.ball.p.x - this.rectanglePosition3.x) < 30) && (Math.abs(this.ball.p.y - this.rectanglePosition3.y) < 30);
              boolean collidedWithEnemy4 = (Math.abs(this.ball.p.x - this.rectanglePosition4.x) < 30) && (Math.abs(this.ball.p.y - this.rectanglePosition4.y) < 30);
              boolean collidedWithEnemy5 = (Math.abs(this.ball.p.x - this.rectanglePosition5.x) < 30) && (Math.abs(this.ball.p.y - this.rectanglePosition5.y) < 30);
              boolean collidedWithEnemy6 = (Math.abs(this.ball.p.x - this.rectanglePosition6.x) < 30) && (Math.abs(this.ball.p.y - this.rectanglePosition6.y) < 30);

              return collidedWithEnemy || collidedWithEnemy2 || collidedWithEnemy3 || collidedWithEnemy4 || collidedWithEnemy5 || collidedWithEnemy6;
            */
              return this.lor.anyCloseTo(this.ball);
            }


            public Scene lastScene(){
              return new EmptyScene(1000, 1000).placeImage(new Text("Game Over!", 25, "red"), 530, 100);
            }

            public Game2 onKey( String ke){
              /*
                  if(ke.equals("left")){
                    if (this.p.x > 100) {
                      return new Game2(this.scene, new Posn (this.p.x - 200, this.p.y ), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                    } else {
                      return new Game2(this.scene, new Posn (this.p.x, this.p.y ), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                    }
                } else
                if(ke.equals("right")){
                  if (this.p.x < 900) {
                    return new Game2(this.scene, new Posn (this.p.x + 200, this.p.y), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                  } else {
                    return new Game2(this.scene, new Posn (this.p.x, this.p.y), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                  }
                  } else {
                  return this;
                }
                */
              return new Game2(this.scene, this.ball.move(ke), this.lor);
                               //rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                  }
            }


        class Rect {
         Posn p ;
         Rect (Posn p) {
           this. p = p;
         }
         Rect move(){
            if (this.p.y <= 800) {
              return new Rect(
                      new Posn(this.p.x + 3,
                               this.p.y + 5));

              } else if (this.p.x >= 980) {
                 return new Rect(
                      new Posn(this.p.x - 930,
                               0));

              } else {
                 return new Rect(
                      new Posn(this.p.x -8,
                               this.p.y -994));
                 //newX -= 8;
                 //newY -= 994;
              }

         }
        Scene draw(Scene scene){
                   return scene.placeImage(new Rectangle(140, 20, "solid", "black"), this.p.x, this.p.y);

                  }
        }


       interface ILoRect{
          ILoRect move();
          boolean anyCloseTo(Ball other);
          Scene draw(Scene scene);
        }
        class MtLoRect  implements ILoRect{
          MtLoRect(){}
          public ILoRect move(){
           return this;
          }
          public  boolean anyCloseTo(Ball other){
            return false;
          }
          public    Scene draw(Scene scene){
            return scene;
          }
        }
        class ConsLoRect implements ILoRect{
         Rect fst;
         ILoRect rst;
         ConsLoRect(Rect fst, ILoRect rst){
          this.fst = fst;
          this.rst = rst;
         }
          public ILoRect move(){
           return new ConsLoRect(this.fst.move()
                              , this.rst.move());
          }
          public  boolean anyCloseTo(Ball other){
            return other.closeTo(this.fst.p) ||
                 this.rst.anyCloseTo(other);
          }
          public    Scene draw(Scene scene){
            return this.rst.draw(this.fst.draw(scene));
          }
        }
        class Ball {
          Posn p;
          Ball(Posn p) {
           this.p = p;
          }
          Ball move(String ke){
             if(ke.equals("left")){
                    if (this.p.x > 100) {
                      return new Ball(new Posn (this.p.x -200, this.p.y));
                     // return new Game2(this.scene, new Posn (this.p.x - 200, this.p.y ), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                    } else {
                      return this;
                      //return new Game2(this.scene, new Posn (this.p.x, this.p.y ), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                    }
                } else
                if(ke.equals("right")){
                  if (this.p.x < 900) {
                    return new Ball(new Posn(this.p.x + 200, this.p.y ));
                   // return new Game2(this.scene, new Posn (this.p.x + 200, this.p.y), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                  } else {
                    return this;
                    //return new Game2(this.scene, new Posn (this.p.x, this.p.y), rectanglePosition, rectanglePosition2, rectanglePosition3, rectanglePosition4, rectanglePosition5, rectanglePosition6);
                  }
                  } else {
                  return this;
                  }
          }
                  Scene draw(Scene scene){
                   return scene.placeImage(new Circle(10, "solid", "red"), this.p.x, this.p.y);

                  }
                  boolean closeTo(Posn other){
                     return (Math.abs(this.p.x - other.x) < 30) && (Math.abs(this.p.y - other.y) < 30);

                  }
        }
        interface ILoP{
          ILoP moveAll();
        }
        class MtLoP  implements ILoP{
          MtLoP(){}
          public ILoP moveAll(){
           return this;
          }
        }
        class ConsLoP implements ILoP{
         Posn fst;
         ILoP rst;
         ConsLoP(Posn fst, ILoP rst){
          this.fst = fst;
          this.rst = rst;
         }
          public ILoP moveAll(){
           return new ConsLoP(new Posn(this.fst.x+ 3, this.fst.y + 3)
                              , this.rst.moveAll());
          }
        }
